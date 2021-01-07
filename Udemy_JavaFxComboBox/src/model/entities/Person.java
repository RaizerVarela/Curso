package model.entities;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String emai;
	
	public Person() {
		
	}

	public Person(Integer id, String name, String emai) {
		this.id = id;
		this.name = name;
		this.emai = emai;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", emai=" + emai + "]";
	}
}
