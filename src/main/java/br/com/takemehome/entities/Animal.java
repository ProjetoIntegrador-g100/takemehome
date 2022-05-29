package br.com.takemehome.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Customer customer;
	private String code;
	private String tagCode;
	private String birthdate;
	private String species;
	private String breed;
	private String name;
	private String color;
	private String gender;
	private Boolean castrated;

	public Animal() {

	}

	public Animal(Integer id, Customer customer, String code, String tagCode, String birthdate, String species,
			String breed, String name, String color, String gender, Boolean castrated) {
		super();
		this.id = id;
		this.customer = customer;
		this.code = code;
		this.tagCode = tagCode;
		this.birthdate = birthdate;
		this.species = species;
		this.breed = breed;
		this.name = name;
		this.color = color;
		this.gender = gender;
		this.castrated = castrated;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTagCode() {
		return tagCode;
	}

	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getCastrated() {
		return castrated;
	}

	public void setCastrated(Boolean castrated) {
		this.castrated = castrated;
	}

}
