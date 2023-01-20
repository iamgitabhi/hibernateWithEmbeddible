package com.hibembd.embedddible;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started !" );
        Configuration config=new Configuration();
        config.configure("hibernate1.cfg.xml");
        
        //sessionFactory is used to build session
        SessionFactory sfactory=config.buildSessionFactory();
        
        //setting values
        Student st=new Student();
        st.setsId(1);
        st.setName("Abhishek");
        
        //course object is created to insert course values in course and is set into student
        Course course=new Course();
        course.setCourseName("Java");
        course.setFee(10000);
        
        st.setCor(course);
        
        //session is used as it has save method in it
        Session session=sfactory.openSession();
        System.out.println("Session started");
        
        //transaction
        Transaction tx=session.beginTransaction();
        System.out.println("transaction is started");
        
        //object is saved
        session.save(st);
        System.out.println("data saved");
        
        //commit ensures that object is saved in dB
        tx.commit();
        System.out.println("saved in db");
        
        session.close();
        System.out.println("session closed");
    }
}
