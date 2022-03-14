package org.acs.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.acs.hibernate.model.Address;
import org.acs.hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       
       cfg.configure();
       
       SessionFactory factory = cfg.buildSessionFactory();
       
       Session session = factory.openSession();
       
       Transaction tx =  session.beginTransaction();
       
       //insert into data into ur database
		/*
		 * Employee e1 = new Employee();
		 * 
		 * e1.setName("abhishek"); e1.setMail("abhi@gmail.com");
		 * 
		 * 
		 * Employee e2 = new Employee();
		 * 
		 * e2.setName("naveen"); e2.setMail("naveen@gmail.com");
		 * 
		 * Address a1 = new Address(); a1.setAddressLine("1"); a1.setCity("hyd");
		 * a1.setState("ts"); a1.setCountry("india"); a1.setPincode(505185);
		 * 
		 * Address a2 = new Address(); a2.setAddressLine("2"); a2.setCity("hyd");
		 * a2.setState("ts"); a2.setCountry("india"); a2.setPincode(505185);
		 * 
		 * e1.setAddress(a1); e2.setAddress(a2);
		 * 
		 * session.persist(e1); session.persist(a2);
		 */
     
     //tx.commit();
       
       //*********************************************************************************
		/*
		 * TypedQuery query = session.createQuery("from Employee e"); List<Employee>
		 * list = query.getResultList();
		 * 
		 * Iterator<Employee> iterator=list.iterator(); if (iterator.hasNext()) {
		 * Employee emp = iterator.next();
		 * System.out.println("employee name is"+" "+emp.getName()+"employee id is  "
		 * +" "+emp.getEmployeeId());
		 * 
		 * Address a=emp.getAddress();
		 * System.out.println("address line is is "+a.getAddressLine()+" "+"city="+a.
		 * getCity()+" "+"state="+a.getState());
		 * 
		 * }
		 */
       
       
       //*********************************************JOINS
    
       String sql="from Employee where employeeId=1";
	   
	   org.hibernate.query.Query query=session.createQuery(sql);
	   	List results=query.list();
	   	
	 
        tx.commit();
        session.close();
     
    }

	}

	

