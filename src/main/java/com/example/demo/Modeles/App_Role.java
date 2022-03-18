package com.example.demo.Modeles;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class App_Role implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String role_name;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "roles"

	)
	private Set<App_User> app_user;

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Set<App_User> getApp_user() {
		return app_user;
	}

	public void setApp_user(Set<App_User> app_user) {
		this.app_user = app_user;
	}

	public App_Role() {

	}

	public App_Role(String role_name, Set<App_User> app_user) {

		this.role_name = role_name;
		this.app_user = app_user;
	}

	@Override
	public String toString() {
		return "App_Role [role_name=" + role_name + ", app_user=" + app_user + "]";
	}

}
