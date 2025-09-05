package com.api.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory fact;

	public String InsertData(Student s) {
		
		Session ss = null;
		Transaction tr = null;
		String msg = null;
		
		try {
		 ss = fact.openSession();
	     tr = ss.beginTransaction();
	     ss.persist(s);
	     tr.commit();
	    
	     msg = "data inserted.....";
		}catch(Exception e) {
			if(tr != null) {
				tr.rollback();
			}
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
	    return msg;
	}

	public String DeleteData(int Stud_ID) {
		Session ss = fact.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, Stud_ID);

		ss.remove(s);

		tr.commit();

		ss.close();

		return "Data deleted succesfully.....";
	}

	public String UpdateData(int Stud_ID) {
		Session ss = fact.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, Stud_ID);

		ss.merge(s);

		tr.commit();
		ss.close();

		return "Data updated succesfully.....";

	}
}
