package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cards")
public class Card {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String pan;
	private int user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", pan=" + pan + ", user=" + user + "]";
	}
	
}
