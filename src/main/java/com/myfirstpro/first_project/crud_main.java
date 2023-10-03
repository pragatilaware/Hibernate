package com.myfirstpro.first_project;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class crud_main {
	
	static Scanner sc = new Scanner(System.in);
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
		
		Crud_operation obj = new Crud_operation();
		System.out.println("enter your id");
		 int id = sc.nextInt();
		 
		 System.out.println("enter your emplyname");
		 String name = sc.next();
		 
		 System.out.println("enter your depatment");
		 String emplydepart = sc.next();
		 
		 
		 
		 
		obj.setEmpyId(id);
		obj.setEmplyDepartment(emplydepart);
		obj.setEmplyName(name);
		
		 Session ss = sf.openSession();
		 		
		 Transaction ts = ss.beginTransaction();
		 ss.save(obj);
		 ts.commit();
		 ss.close();
;		 
		
	}

}
