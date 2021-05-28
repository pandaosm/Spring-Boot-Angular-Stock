package com.projet.stock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projet.stock.model.Agent;
import com.projet.stock.model.User;
import com.projet.stock.repository.AgentRepository;
import com.projet.stock.repository.UserRepository;

@SpringBootApplication
public class PStockApplication implements CommandLineRunner{

	private final UserRepository ur;
	
	private final AgentRepository ar;
	
	
	
	public PStockApplication(UserRepository ur, AgentRepository ar) {
		super();
		this.ur = ur;
		this.ar = ar;
	}

	public static void main(String[] args) {
		SpringApplication.run(PStockApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Agent ag = new Agent(11,"JAVA","A100","A");
		ar.save(ag);
	}

}
