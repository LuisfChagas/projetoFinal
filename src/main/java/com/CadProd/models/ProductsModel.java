package com.CadProd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="product")
public class ProductsModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String brand;
	private String madein;
	private float price;
	
	protected void Products() {
	}
	
	protected void Product(int id, String nome, String brand, String madein, float price) {
		this.id = id;
		this.nome = nome;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public String getMadein() {
		return madein;
	}
	public String getNome() {
		return nome;
	}
	public float getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
