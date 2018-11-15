package es.lahoz.model;


import java.util.ArrayList;
import java.util.List;

public class Owner {

	private Integer codOwner;
	private String name;
	private String surname;
	private List<Pet> pets = new ArrayList<Pet>();
	
	
	public Integer getCodOwner() {
		return codOwner;
	}
	
	public void setCodOwner(Integer codOwner) {
		this.codOwner = codOwner;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public List<Pet> getPets() {
		return pets;
	}
	
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
	
	
}
