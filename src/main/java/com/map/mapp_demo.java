package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapp_demo {
	
	public static void main(String[] args) {
		 System.out.println( "Hello World!" );
	        Configuration con = new Configuration();
	        con.configure("hibernate.cfg.xml");
	        SessionFactory sf = con.buildSessionFactory();
	        System.out.println(sf);
	        
	        question obj = new question();
	        obj.setQueston_id(102);
	        obj.setQuestion("what is java");
	        
	        
	        Answare obj2 = new Answare();
	        obj2.setAns_id(202);
	        obj2.setAnswer("it is programing language");
	        
	        obj.setAns(obj2);
	        
	        Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(obj);
	        session.save(obj2);
	        
	        tx.commit();
	        session.close();
	        
	        
	}

}
