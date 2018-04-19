package com.niit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="blogpost")

public class BlogPost {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable=false)
	private String blog_title;
	@Lob
	@Column(nullable=false)
	private String blog_content;
	private Date blog_postedOn;
	@ManyToOne
	private User blog_postedBy;
	private int likes;
	private boolean approved;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlog_title() {
		return blog_title;
	}
	public void setBlog_title(String blog_title) {
		this.blog_title = blog_title;
	}
	public String getBlog_content() {
		return blog_content;
	}
	public void setBlog_content(String blog_content) {
		this.blog_content = blog_content;
	}
	public Date getBlog_postedOn() {
		return blog_postedOn;
	}
	public void setBlog_postedOn(Date blog_postedOn) {
		this.blog_postedOn = blog_postedOn;
	}
	public User getBlog_postedBy() {
		return blog_postedBy;
	}
	public void setBlog_postedBy(User blog_postedBy) {
		this.blog_postedBy = blog_postedBy;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	

}



