package com.myfirstpro.first_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        System.out.println(sf);
        student obj = new student();
        obj.setId(102);
        obj.setStdName("pragati");
        obj.setStdSurname("Laware");
        System.out.println(obj);
        
        
        // crating object of adrees class
        Address ad = new Address();
       ad.setCity("delhi");
       ad.setAddedDate(new Date());
       ad.setOpen(true);
       ad.setStreet("stree1");
       ad.setX(384);
      // 
       
       //reading image
       FileInputStream file = new FileInputStream("src/main/java/photo.png");
       byte[] data = new byte[file.available()];
       file.read(data);
       ad.setImage(data);
       
       
        
       
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(obj);
        session.save(ad);
        tx.commit();
        session.close();
        
        
        
        
        
        
        
        
        
       
    }
}
