package com.niit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JobData")

public class Job {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
		@Column(nullable=false)
	private String job_title;
	private String job_description;
		@Column(nullable=false)
	private String job_skill;
	private String job_location;
	private String job_salary;
	private String companyName;
	private String job_experience;
	private Date job_postedOn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public String getJob_salary() {
		return job_salary;
	}
	public void setJob_salary(String job_salary) {
		this.job_salary = job_salary;
	}
	public String getJob_experience() {
		return job_experience;
	}
	public void setJob_experience(String job_experience) {
		this.job_experience = job_experience;
	}
	public String getJob_skill() {
		return job_skill;
	}
	public void setJob_skill(String job_skill) {
		this.job_skill = job_skill;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getJob_postedOn() {
		return job_postedOn;
	}
	public void setJob_postedOn(Date job_postedOn) {
		this.job_postedOn = job_postedOn;
	}
	
	
}


