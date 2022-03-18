package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Modeles.App_User;
import com.example.demo.Services.App_Role_Service;
import com.example.demo.Services.App_User_Service;
import com.example.demo.Services.Categorie_Service;
import com.example.demo.Services.Produit_Service;

@SpringBootApplication
public class ProjetTutoreApplicationSpringApplication implements CommandLineRunner {

	@Autowired
	App_Role_Service app_role_service;
	@Autowired
	App_User_Service app_user_service;
	@Autowired
	Categorie_Service categorie_service;
	@Autowired
	Produit_Service produit_service;

	public static void main(String[] args) {
		SpringApplication.run(ProjetTutoreApplicationSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		App_User au1 = new App_User("Anaïs", 1, "password1");
		App_User au2 = app_user_service.addApp_User(au1);
	}

}
