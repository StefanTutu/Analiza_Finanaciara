package com.sample;

public class ContClient {

	private Long id;
	private String denumire;
	private Double suma;

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
