package net.guides.springboot2.springboot2jpacrudexample.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class Plane {
	@Id
	private long id;
	private String loai;
	private int tamBay;
	
	public Plane() {
		
	}
	

	public Plane(long id, String loai, int tamBay) {
		super();
		this.id = id;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLoai() {
		return loai;
	}


	public void setLoai(String loai) {
		this.loai = loai;
	}


	public int getTamBay() {
		return tamBay;
	}


	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}


	@Override
	public String toString() {
		return "Plane [id=" + id + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}


	
	
}
