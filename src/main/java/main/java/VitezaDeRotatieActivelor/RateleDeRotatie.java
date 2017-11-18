package main.java.VitezaDeRotatieActivelor;

import com.sample.IndicatorFinanciar;

public class RateleDeRotatie {

	private IndicatorFinanciar indicatorFinanciar;
	private TipVitezaDeRotatieActivelor tip;
	private Double vitezaInZile;

	public RateleDeRotatie() {

	}

	public RateleDeRotatie(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipVitezaDeRotatieActivelor getTip() {
		return tip;
	}

	public void setTip(TipVitezaDeRotatieActivelor tip) {
		this.tip = tip;
	}

	public Double getVitezaInZile() {
		return vitezaInZile;
	}

	public void setVitezaInZile(Double vitezaInZile) {
		this.vitezaInZile = vitezaInZile;
	}

	public double formulaCalcul90zile1() {
		Double numarDeRotatii = 0.0;
		numarDeRotatii += indicatorFinanciar.getNumarDeRotatii();
		Double vitezaInZile = 90 / numarDeRotatii;
		return vitezaInZile;
	}

	public double formulaCalcul360zile1() {
		Double numarDeRotatii = 0.0;
		numarDeRotatii += indicatorFinanciar.getNumarDeRotatii();
		Double vitezaInZile = 360 / numarDeRotatii;
		return vitezaInZile;
	}

	public double formulaCalcul90zile2() {
		Double stocuriMedii = 0.0;
		stocuriMedii += indicatorFinanciar.getStocuriMedii();
		Double bazaDeCalcul = 0.0;
		bazaDeCalcul += indicatorFinanciar.getBazaDeCalcul();
		Double vitezaInZile = stocuriMedii * 90 / bazaDeCalcul;
		return vitezaInZile;
	}
	
	public double formulaCalcul360zile2() {
		Double stocuriMedii = 0.0;
		stocuriMedii += indicatorFinanciar.getStocuriMedii();
		Double bazaDeCalcul = 0.0;
		bazaDeCalcul += indicatorFinanciar.getBazaDeCalcul();
		Double vitezaInZile = stocuriMedii * 360 / bazaDeCalcul;
		return vitezaInZile;
	}

}
