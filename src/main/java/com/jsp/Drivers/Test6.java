package com.jsp.Drivers;
//OneToOne - Default FetchType: EAGER
//OneToMany - Default FetchType: LAZY
//ManyToOne - Default FetchType: EAGER
//ManyToMany - Default FetchType: LAZY
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.Entities.Person_Bi;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		em.find(Person_Bi.class, 1);
	}

}
