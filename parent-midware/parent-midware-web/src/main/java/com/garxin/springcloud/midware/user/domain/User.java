package com.garxin.springcloud.midware.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "users")
public class User {

	public interface UserSimpleView {
	}

	public interface UserDetailView extends UserSimpleView {
	}

	@Id
	private String id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "birthday")
	private Date birthday;

	@JsonView(User.UserSimpleView.class)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User() {
	}

	@JsonView(User.UserSimpleView.class)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonView(UserSimpleView.class)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JsonView(UserDetailView.class)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
