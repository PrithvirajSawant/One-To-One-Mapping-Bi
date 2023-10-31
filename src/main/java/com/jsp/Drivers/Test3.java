package com.jsp.Drivers;
//Position parameter - JPQL
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Entities.Person_Bi;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		String q = "select p from Person_Bi p where p.name=?1";
		Query query =  em.createQuery(q);
		query.setParameter(1, "Rahul"); //Position parameter
//		Person_Bi person = (Person_Bi)query.getSingleResult();
		List list = query.getResultList(); // To get the list of data that are duplicate(name in this case). 
//		System.out.println(person);
		System.out.println(list);

	}

}
