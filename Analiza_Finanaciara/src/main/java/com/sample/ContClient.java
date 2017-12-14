package com.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContClient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="denumire")
	private String denumire;
	
	@Column(name="suma")
	private Double suma;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Tip_Cont")
	TipCont TipCont;

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public Double getSuma() {
		return suma;
	}

	public void setSuma(Double suma) {
		this.suma = suma;
	}

	public ContClient(Long id, String denumire, Double suma) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.suma = suma;
	}

	public ContClient() {
		super();
	}

}
