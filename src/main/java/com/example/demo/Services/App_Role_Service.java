package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Modeles.App_Role;
import com.example.demo.Repositories.App_Role_Repository;

@Service
public class App_Role_Service {

	@Autowired
	App_Role_Repository app_role_repository;

	public App_Role addApp_Role(App_Role ap) {
		return (App_Role) app_role_repository.save(ap);
	}

	public List<App_Role> read() {
		return app_role_repository.findAll();
	}

	public List<App_Role> readUsers() {

		return app_role_repository.findAll();
	}

	public void deleteUser(String id) {
		app_role_repository.deleteById(id);
	}
}
