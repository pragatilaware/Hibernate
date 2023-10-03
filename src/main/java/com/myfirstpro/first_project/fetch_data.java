package com.myfirstpro.first_project;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetch_data {
	
	//static Scanner sc = new Scanner(System.in);
	public static void  main(String[]args) {
		// TODO Auto-generated constructor stub
		
		System.out.println("hello pragati 1");
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		System.out.println("hello pragati 2");
		SessionFactory sf = conf.buildSessionFactory();
		System.out.println("hello pragati  3");
		
		System.out.println(sf);
		System.out.println("hello 4");
		Session ss = sf.openSession();
		
		Persons obj =(Persons)ss.get(Persons.class,103);
		System.out.println(obj);
		
		
		
	//	Persons obj = new Persons();
		
		//Persons  s =ss.get(Persons.class, 101);
       // System.out.println(s);
      //  System.out.println("Id : "+s.getID());
        
      // System.out.println("Name : "+s.getEmplyName());
       // System.out.println("Class : "+s.getEmplyDepartment());
		// Transaction ts = ss.beginTransaction();
		// ss.save(obj);
		/// ts.commit();
        
		 ss.close();
		 sf.close();
		
		

}}
