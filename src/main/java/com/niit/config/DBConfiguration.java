package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.DaoImpl.UserDaoImpl;
import com.niit.dao.UserDao;
import com.niit.model.BlogComment;
import com.niit.model.BlogPost;
import com.niit.model.BlogPostLikes;
import com.niit.model.Friend;
import com.niit.model.Job;
import com.niit.model.Notification;
import com.niit.model.ProfilePicture;
import com.niit.model.User;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit")

public class DBConfiguration {

	public static SessionFactory sessionFactory=null;

	public DBConfiguration()
	{
		System.out.println("DBConfig class is instantiated");
	}
	
	@Autowired 
	@Bean(name="sessionFactory")
	public SessionFactory getsessionFactory() 
	{
		LocalSessionFactoryBuilder localSessionFacBuilder=null;
		try{
			Properties hibernateProperties=new Properties();
			hibernateProperties.put("hibernate.temp.use_jdbc_metadata_defaults","false");
		//hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto","none");
			hibernateProperties.put("hibernate.show_sql", "true");
			hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
			
		
		LocalSessionFactoryBuilder lsfb = new LocalSessionFactoryBuilder(getDataSource());
		lsfb.addProperties(hibernateProperties);
		Class classes[] = new Class[]{User.class,Job.class,BlogPost.class,Notification.class,BlogPostLikes.class,BlogComment.class,ProfilePicture.class,Friend.class};
		sessionFactory=lsfb.buildSessionFactory();
		System.out.println("SessionFactory object created");
		 
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return sessionFactory;
		}
	
	@Bean(name="DataSource")
	public DataSource getDataSource() 
	{
		DriverManagerDataSource driverMgrDataSource=new DriverManagerDataSource();
		driverMgrDataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		driverMgrDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		driverMgrDataSource.setUsername("web");
		driverMgrDataSource.setPassword("com");
		return driverMgrDataSource;
	}
	
	@Autowired 
	@Bean
	public HibernateTransactionManager hibTransManagement(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTransactionmgr=new HibernateTransactionManager();
		hibernateTransactionmgr.setSessionFactory(sessionFactory);
		return hibernateTransactionmgr;
	}
	
	@Bean(name="userDao")
	public UserDao getUserDaoImpl()
	{
		return new UserDaoImpl();
	}


}
