package com.jsp.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="identity_info")
public class Identity_Bi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="identity_name")
	private String name;
	@Column(name="identity_num")
	private long num;
	@OneToOne(mappedBy = "identity")
	private Person_Bi person;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public Person_Bi getPerson() {
		return person;
	}
	public void setPerson(Person_Bi person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Identity_Bi [id=" + id + ", name=" + name + ", num=" + num + "]"; //Remove person data from here to avoid StackOverflow.
	}
	
	
	

}
