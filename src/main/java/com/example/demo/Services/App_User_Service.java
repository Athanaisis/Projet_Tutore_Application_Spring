package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modeles.App_User;
import com.example.demo.Repositories.App_User_Repository;

@Service
public class App_User_Service {

	@Autowired
	App_User_Repository app_user_repository;

	public App_User addApp_User(App_User au) {
		return (App_User) app_user_repository.save(au);
	}

	public List<App_User> read() {
		return app_user_repository.findAll();
	}

	public Optional<App_User> rechercheParId(String id) {
		return app_user_repository.findById(id);
	}

	public void supprimerParId(String id) {
		app_user_repository.deleteById(id);
	}
}
