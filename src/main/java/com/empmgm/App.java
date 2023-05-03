package com.empmgm;

import java.util.List;

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
  //     employee e1=new employee();
        
 //       e1.setEmpId(11);
 //      e1.setEmpName("sowmya");
 //      e1.setEmpLocation("pune");
 //      e1.setEmpProject("Linux project");
     
        Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        
        Transaction tx=ses.beginTransaction();
        employee e2=new employee();
        
  //   ses.save(e1);

    	
 //     e2= ses.get(employee.class,11); //to retrive data of user
    	
 //   	String city="pune";
 //   	e2=(employee)ses.createQuery("from employee where empLocation=:city")
 //  		.setParameter("city", city).uniqueResult();
    	
  //     	Query qu=ses.createQuery("from employee");
    	
  //   	List<employee> li=qu.list();    	
  //   	for(employee e:li)
  //        System.out.println(e.getEmpId()+" : "+e.getEmpName());
    	
    	
  //   	Query q=ses.createQuery("update employee set empLocation=:location where empId=:id")
  //  		.setParameter("location","pune").setParameter("id",13);
  //  	int status=q.executeUpdate();
 //    	System.out.println(status);

  	Query qu=ses.createQuery("delete from employee where empId=:id").setParameter("id",13);

   	System.out.println(qu.executeUpdate());	
    
        tx.commit();
   //   System.out.println("employee name is "+e2.getEmpName());
    	
     System.out.println(e2);  
}
}