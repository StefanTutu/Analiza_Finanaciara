package main.java.VitezaDeRotatieActivelor;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class CoeficientDeRotatii {

	private IndicatorFinanciar indicatorFinanciar;
	private TipVitezaDeRotatieActivelor tip;
	private Double valoareCoeficientDeRotatii;

	public CoeficientDeRotatii() {

	}

	public CoeficientDeRotatii(IndicatorFinanciar indicatorFinanciar) {
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

	public Double getValoareCoeficientDeRotatii() {
		return valoareCoeficientDeRotatii;
	}

	public void setValoareCoeficientDeRotatii(Double valoareCoeficientDeRotatii) {
		this.valoareCoeficientDeRotatii = valoareCoeficientDeRotatii;
	}
	
	public double formulaCalcul() {
		Double cifraDeAfaceri = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCifraDeAfaceri()) {
			cifraDeAfaceri += c.getSuma();
		}
		
		Double capitaluriCirculante = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCapitaluriCirculante()) {
			capitaluriCirculante += c.getSuma();
		}
		
		Double valoareCoeficientDeRotatii = cifraDeAfaceri/capitaluriCirculante;
		return valoareCoeficientDeRotatii;
	}

}
