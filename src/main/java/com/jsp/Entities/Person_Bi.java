package com.jsp.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person_info")
public class Person_Bi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="person_name")
	private String name;
	@Column(name="person_age")
	private int age;
	@Column(name="person_loc")
	private String loc;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Identity_Bi identity;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Identity_Bi getIdentity() {
		return identity;
	}
	public void setIdentity(Identity_Bi identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "Person_Bi [id=" + id + ", name=" + name + ", age=" + age + ", loc=" + loc + ", identity=" + identity
				+ "]";
	}
	
	
	
	
	

}
