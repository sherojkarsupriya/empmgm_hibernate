package com.empmgm;

/**
 * Hello world!
 *
 */
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        employee e1=new employee();
        
        e1.setEmpId(10);
        e1.setEmpName("supriya");
        e1.setEmpLocation("Nanded");
        e1.setEmpProject("Java project");
     
        Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        
        Transaction tx=ses.beginTransaction();
        ses.save(e1);
        tx.commit();
   
     System.out.println(e1);  
}
}