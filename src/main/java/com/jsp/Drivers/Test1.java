package com.jsp.Drivers;
//insert
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.Identity_Bi;
import com.jsp.Entities.Person_Bi;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_Bi p = new Person_Bi();
		p.setName("Rahul");
		p.setAge(22);
		p.setLoc("Bangalore");
		
		
		Identity_Bi i = new Identity_Bi();
		i.setName("Aadhar");
		i.setNum(678856778);
		
		p.setIdentity(i);
		i.setPerson(p);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(p);
		em.persist(i);
		et.commit();

	}

}
