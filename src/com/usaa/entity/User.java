package com.usaa.entity;
// Generated 16 Feb, 2018 2:09:18 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "splitapp")
public class User implements java.io.Serializable {

	private int userId;
	private long amountLent;
	private long amountOwes;
	private String userName;

	public User() {
	}

	public User(int userId, long amountLent, long amountOwes) {
		this.userId = userId;
		this.amountLent = amountLent;
		this.amountOwes = amountOwes;
	}

	public User(int userId, long amountLent, long amountOwes, String userName) {
		this.userId = userId;
		this.amountLent = amountLent;
		this.amountOwes = amountOwes;
		this.userName = userName;
	}

	@Id

	@Column(name = "userId", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "amountLent", nullable = false)
	public long getAmountLent() {
		return this.amountLent;
	}

	public void setAmountLent(long amountLent) {
		this.amountLent = amountLent;
	}

	@Column(name = "amountOwes", nullable = false)
	public long getAmountOwes() {
		return this.amountOwes;
	}

	public void setAmountOwes(long amountOwes) {
		this.amountOwes = amountOwes;
	}

	@Column(name = "userName")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
