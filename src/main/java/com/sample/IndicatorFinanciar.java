package com.sample;

import java.util.ArrayList;
import java.util.List;

import com.sample.ContClient;

public class IndicatorFinanciar {
	private Long id;
	private String denumire;

	// Solvabilitate
	private List<ContClient> conturiTotalDatorii = new ArrayList<ContClient>();
	private List<ContClient> conturiTotalActiv = new ArrayList<ContClient>();
	private List<ContClient> conturiCapitalPropriu = new ArrayList<ContClient>();
	private List<ContClient> conturiTotalCapitaluri = new ArrayList<ContClient>();
	private List<ContClient> rateScadenteRambursare = new ArrayList<ContClient>();
	private List<ContClient> dobanziRate = new ArrayList<ContClient>();
	private Double cashFlow;
	
	//Autonomie Financiara
	private List<ContClient> conturiCapitalPermanent = new ArrayList<ContClient>();
	private List<ContClient> conturiPasivTotal = new ArrayList<ContClient>();
	
	private List<ContClient> conturiDatoriiPeTermenLung = new ArrayList<ContClient>();
	
	//Viteza de rotatie a activelor
	private List<ContClient> conturiCifraDeAfaceri = new ArrayList<ContClient>();
	private List<ContClient> conturiCapitaluriCirculante = new ArrayList<ContClient>();
	private List<ContClient> conturiStocGlobalMediu = new ArrayList<ContClient>();
	private Double numarDeRotatii;
	private Double stocuriMedii;
	private Double bazaDeCalcul;
	
	public IndicatorFinanciar() {
	}

	//Constructor Solvabilitate
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiTotalDatorii,
			List<ContClient> conturiTotalActiv, List<ContClient> conturiCapitalPropriu,
			List<ContClient> conturiTotalCapitaluri, List<ContClient> rateScadenteRambursare,
			List<ContClient> dobanziRate, Double cashFlow) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiTotalDatorii = conturiTotalDatorii;
		this.conturiTotalActiv = conturiTotalActiv;
		this.conturiCapitalPropriu = conturiCapitalPropriu;
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
		this.rateScadenteRambursare = rateScadenteRambursare;
		this.dobanziRate = dobanziRate;
		this.cashFlow = cashFlow;
	}

	public Long getId() {
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

	public List<ContClient> getConturiTotalDatorii() {
		return conturiTotalDatorii;
	}

	public void setConturiTotalDatorii(List<ContClient> conturiTotalDatorii) {
		this.conturiTotalDatorii = conturiTotalDatorii;
	}

	public List<ContClient> getConturiTotalActiv() {
		return conturiTotalActiv;
	}

	public void setConturiTotalActiv(List<ContClient> conturiTotalActiv) {
		this.conturiTotalActiv = conturiTotalActiv;
	}

	public List<ContClient> getConturiCapitalPropriu() {
		return conturiCapitalPropriu;
	}

	public void setConturiCapitalPropriu(List<ContClient> conturiCapitalPropriu) {
		this.conturiCapitalPropriu = conturiCapitalPropriu;
	}

	public List<ContClient> getConturiTotalCapitaluri() {
		return conturiTotalCapitaluri;
	}

	public void setConturiTotalCapitaluri(List<ContClient> conturiTotalCapitaluri) {
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
	}

	public List<ContClient> getRateScadenteRambursare() {
		return rateScadenteRambursare;
	}

	public void setRateScadenteRambursare(List<ContClient> rateScadenteRambursare) {
		this.rateScadenteRambursare = rateScadenteRambursare;
	}

	public List<ContClient> getDobanziRate() {
		return dobanziRate;
	}

	public void setDobanziRate(List<ContClient> dobanziRate) {
		this.dobanziRate = dobanziRate;
	}

	public Double getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(Double cashFlow) {
		this.cashFlow = cashFlow;
	}

	public List<ContClient> getConturiCapitalPermanent() {
		return conturiCapitalPermanent;
	}

	public void setConturiCapitalPermanent(List<ContClient> conturiCapitalPermanent) {
		this.conturiCapitalPermanent = conturiCapitalPermanent;
	}

	public List<ContClient> getConturiPasivTotal() {
		return conturiPasivTotal;
	}

	public void setConturiPasivTotal(List<ContClient> conturiPasivTotal) {
		this.conturiPasivTotal = conturiPasivTotal;
	}

	public List<ContClient> getConturiDatoriiPeTermenLung() {
		return conturiDatoriiPeTermenLung;
	}

	public void setConturiDatoriiPeTermenLung(List<ContClient> conturiDatoriiPeTermenLung) {
		this.conturiDatoriiPeTermenLung = conturiDatoriiPeTermenLung;
	}

	public List<ContClient> getConturiCifraDeAfaceri() {
		return conturiCifraDeAfaceri;
	}

	public void setConturiCifraDeAfaceri(List<ContClient> conturiCifraDeAfaceri) {
		this.conturiCifraDeAfaceri = conturiCifraDeAfaceri;
	}

	public List<ContClient> getConturiCapitaluriCirculante() {
		return conturiCapitaluriCirculante;
	}

	public void setConturiCapitaluriCirculante(List<ContClient> conturiCapitaluriCirculante) {
		this.conturiCapitaluriCirculante = conturiCapitaluriCirculante;
	}

	public List<ContClient> getConturiStocGlobalMediu() {
		return conturiStocGlobalMediu;
	}

	public void setConturiStocGlobalMediu(List<ContClient> conturiStocGlobalMediu) {
		this.conturiStocGlobalMediu = conturiStocGlobalMediu;
	}

	public Double getNumarDeRotatii() {
		return numarDeRotatii;
	}

	public void setNumarDeRotatii(Double numarDeRotatii) {
		this.numarDeRotatii = numarDeRotatii;
	}

	public Double getStocuriMedii() {
		return stocuriMedii;
	}

	public void setStocuriMedii(Double stocuriMedii) {
		this.stocuriMedii = stocuriMedii;
	}

	public Double getBazaDeCalcul() {
		return bazaDeCalcul;
	}

	public void setBazaDeCalcul(Double bazaDeCalcul) {
		this.bazaDeCalcul = bazaDeCalcul;
	}

	
}
