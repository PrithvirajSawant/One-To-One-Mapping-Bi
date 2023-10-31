package com.jsp.Drivers;
//query.getResultList() - JPQL
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		String q = "select p from Person_Bi p where p.name=?1 and p.age=?2";
		Query query =  em.createQuery(q);
		query.setParameter(1, "Rahul"); //Position parameter
		query.setParameter(2, 22); //Position parameter
		
//		Person_Bi person = (Person_Bi)query.getSingleResult();
		List list = query.getResultList(); // To get the list of data that are duplicate(name in this case). 
//		System.out.println(person);
		int count = 0;
		if(list!=null)
		{
			System.out.println("-----------------");
			for(Object o : list)
			{
				System.out.println(o);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("No data");
		}
//		System.out.println(list);

	}

}
