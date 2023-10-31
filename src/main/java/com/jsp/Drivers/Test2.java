package com.jsp.Drivers;
//fetch the data //query.getResultList() - JPQL
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "select p from Person_Bi p";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(q);
		List list  = query.getResultList();
		if(list!=null)
		{
//			System.out.println(list);
			for(Object obj:list)
			{
				System.out.println(obj);
			}
		}

	}

}
