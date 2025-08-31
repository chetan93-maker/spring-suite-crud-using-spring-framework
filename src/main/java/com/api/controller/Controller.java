package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Student;
import com.api.service.StudentServ;

@RestController
public class Controller {
   
	@Autowired
	StudentServ ss;
	
	@PostMapping("/save")
	public String InserData(@RequestBody Student s) {
	String msg = ss.InserData(s);
	return msg;
	}
	
	@DeleteMapping("/delete/{Stud_ID}")
	public String DeleteData(@PathVariable int  Stud_ID) {
	String msg = ss.DeleteData(Stud_ID);
	return msg;
	}
	
	@PutMapping("/update/{Stud_ID}")
	public String UpdateData(@PathVariable int Stud_ID, @RequestBody Student s) {
	String msg = ss.UpdateData(Stud_ID);
	return msg;
	}
	
	
}
