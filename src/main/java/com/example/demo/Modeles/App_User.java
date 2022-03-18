package com.example.demo.Modeles;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class App_User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String username;

	private int active;

	private String password;

	@ManyToMany()
	private Set<App_Role> roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<App_Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<App_Role> roles) {
		this.roles = roles;
	}

	public App_User() {

	}

	public App_User(String username, int active, String password) {

		this.username = username;
		this.active = active;
		this.password = password;

	}

	public App_User(int active, String password) {

		this.active = active;
		this.password = password;

	}

	@Override
	public String toString() {
		return "App_User [username=" + username + ", active=" + active + ", password=" + password + ", roles=" + roles
				+ "]";
	}

}
