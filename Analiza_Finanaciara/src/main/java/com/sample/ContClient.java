package com.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cont_client")
public class ContClient {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cont_client_id_seq")
    @SequenceGenerator(name="cont_client_id_seq", sequenceName="cont_client_id_seq", allocationSize=1)
	@Column(name = "id")
	private Long id;
	
	@Column(name="denumire")
	private String denumire;
	
	@Column(name="suma")
	private Double suma;

	/*	sau aici mai ziceam daca e sa punem tipul asta :-??
	 * @Enumerated(EnumType.STRING)
	@Column(name="Tip_Cont")
	TipCont TipCont;*/
	
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
