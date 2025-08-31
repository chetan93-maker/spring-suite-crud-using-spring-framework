package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.repository.StudentDao;
import com.api.entity.Student;


@Service
public class StudentServ {
       
	 @Autowired
	 StudentDao   sd;
	
     public String InserData(Student s) {
     String msg = sd.InsertData(s);
     return msg;
    	 
     }
     
     public String DeleteData(int Stud_ID) {
     String msg = sd.DeleteData(Stud_ID);
     return msg;
     }
     
     public String UpdateData(int Stud_ID) {
     String msg = sd.UpdateData(Stud_ID);
     return msg;
     
     }
}
