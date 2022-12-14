package com.bridgelabz.greeting.controller;

import java.util.List;

//import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greeting.model.greetingModel;
import com.bridgelabz.greeting.service.greetingService;

@RestController
public class greetingController {
	@Autowired
	greetingService service;
//	@GetMapping("/")
//	public String httpMetod() {
//		JSONObject obj=new JSONObject();
//		obj.put("name","sonoo");
//		return service.getMessage();
//	}
	//UC2
	@GetMapping("/")
	public String message() {
		return service.getMessage();
	}
	//UC3
	@GetMapping("/{firstName}/{lastName}")
	public String greetMessage(@PathVariable String firstName , @PathVariable String lastName ) {
		return service.getGreetMessage(firstName,lastName);
	}
	//UC3
	@GetMapping("/{name}")
	public String greetMessagesF(@PathVariable String name ) {
		return service.getGreetMessageF(name);
	}
	////UC3 add message in database
	@PostMapping("/add")
	public greetingModel addMsg(@RequestBody greetingModel data) {
		return service.addGreetMsg(data);
	}
	////UC5 Retrieve 
	@GetMapping("/message/{id}")
	public greetingModel getMessage(@PathVariable int id) {
		greetingModel response = service.getGreetMsg(id);
		return response;
	}
	////UC6 get all greeting message
	@PostMapping("/getAll")
	public List<greetingModel> getmessage() {
		return service.getMsg();
	}
	//UC7
		@PostMapping("/update/{id}")
		public void greetMessage(@RequestBody greetingModel data , @PathVariable int id ) {
			service.updateGreetMessage(data, id);
		}
	////UC8 Delete 
	@DeleteMapping("/deletemessage/{id}")
	public void deleteMessage(@PathVariable int id) {
		service.deleteGreet(id);
	}
}
