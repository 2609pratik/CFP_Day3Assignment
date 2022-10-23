package com.bridgelabz.greeting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greeting.model.greetingModel;
import com.bridgelabz.greeting.repository.greetingRepository;

@Service
public class greetingService {
	@Autowired
	greetingRepository repo;
	public String getMessage() {
		return "Hello World....!";
	}

	public String getGreetMessage(String firstName, String lastName) {
		return "Hello " + firstName + " " + lastName;
	}

	public String getGreetMessageF(String name) {
		return "Hello " + name;
	}

	public greetingModel addGreetMsg(greetingModel data) {
		greetingModel saveGreeting = repo.save(data);
		return saveGreeting;
	}

	public List<greetingModel> getMsg() {
		return repo.findAll();
	}

	public greetingModel getGreetMsg(int id) {
		return repo.findById(id).get();
	}

	public void deleteGreet(int id) {
		repo.deleteById(id);
	}

	public void updateGreetMessage(greetingModel data, int id) {
		repo.deleteById(id);
		repo.save(data);
	}

	 
}
