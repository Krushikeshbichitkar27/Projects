package com.sportsmanagement.sportsmanagement;
//importing packages

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sports")

//main class
public class SportsManagement {
	@Id
	@Column(name = "playerId")
	private int id;

	@Column(name = "playefirstName")
	private String playerFirstName;

	@Column(name = "playelastName")
	private String playerLastName;

	@Column(name = "age")
	private int age;

	@Column(name = "playerAddress")
	private String address;

	@Column(name = "playerCategory")
	private String category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstiName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
