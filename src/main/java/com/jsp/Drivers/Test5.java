package com.jsp.Drivers;
//Named parameter
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		String q = "select p from Person_Bi p where p.name=:abc and p.age=:xyz";
		Query query =  em.createQuery(q);
		query.setParameter("abc", "Rahul"); //Named parameter
		query.setParameter("xyz",22); 
		List list = query.getResultList(); // To get the list of data that are duplicate(name in this case). 
		if(list!=null)
		{
			System.out.println("-------------------");
			for(Object o:list)
			{
				System.out.println(o);
			}
		}
	}

}
