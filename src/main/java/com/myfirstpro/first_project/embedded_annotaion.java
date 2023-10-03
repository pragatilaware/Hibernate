package com.myfirstpro.first_project;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Embeddable
public class embedded_annotaion {
	
	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        System.out.println(sf);
        
        Persons per1= new Persons();
        per1.setID(303);
        per1.setFirstName("salman ");
        per1.setLastName("khan"); 
         per1.setAge(45);
         
         certificate obj = new certificate();
         
         obj.setCourse_type("data scuence");
         obj.setCouser("java");
         
         per1.setCerti(obj);
        
        
        
        
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(per1);
       // session.save(obj);
        tx.commit();
        session.close();
        
        
	}

}
