package net.guides.springboot2.springboot2jpacrudexample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "chuyenbay")
public class Flight {
	@Id
	private String id;
	private String gaDi;
	private String gaDen;
	private int doDai;
	private Date gioDi;
	private Date gioDen;
	private int chiPhi;
	
	@Id
	@Column(name="ma_cb")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public int getDoDai() {
		return doDai;
	}
	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}
	public Date getGioDi() {
		return gioDi;
	}
	public void setGioDi(Date gioDi) {
		this.gioDi = gioDi;
	}
	public Date getGioDen() {
		return gioDen;
	}
	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}
	public int getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}
	public Flight(String id, String gaDi, String gaDen, int doDai, Date gioDi, Date gioDen, int chiPhi) {
		super();
		this.id = id;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi=" + gioDi
				+ ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
