package com.niit.webprojectbackend2;

import com.niit.DaoImpl.UserDaoImpl;
import com.niit.dao.UserDao;
import com.niit.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
	/*@Autowired
	static 
	UserDao userDao;*/
	  
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.niit");
        context.refresh();
        
        UserDao userDao = (UserDao)context.getBean("UserDaoimpl");
        */
    
    	 UserDao userDao1 = new UserDaoImpl();
        User u = new User();
        u.setEmail("monalisamahapatra52@gmail.com");
        u.setFirstname("monalisa");
        u.setLastname("Mahapatra");
        u.setOnline(false);
        u.setPassword("9090625459");
        u.setRole("student");
        userDao1.registerUser(u);
        System.out.println("Insert done");
           }


        
    }
    

