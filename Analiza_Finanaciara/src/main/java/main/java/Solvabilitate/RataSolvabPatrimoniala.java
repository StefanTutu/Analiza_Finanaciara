package main.java.Solvabilitate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataSolvabPatrimoniala {

	private IndicatorFinanciar indicatorFinanciar;
	private TipRataSolvabPatrimoniala tip;
	private Double valoareRataSolvabPatrimoniala;

	public RataSolvabPatrimoniala() {

	}

	public RataSolvabPatrimoniala(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipRataSolvabPatrimoniala getTip() {
		return tip;
	}

	public void setTip(TipRataSolvabPatrimoniala tip) {
		this.tip = tip;
	}

	public double formulaCalcul() {
		Double soldTotalCapitalPropriu = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCapitalPropriu()) {
			soldTotalCapitalPropriu += c.getSuma();
		}

		Double soldTotalCapitaluri = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiTotalCapitaluri()) {
			soldTotalCapitaluri += c.getSuma();
		}

		Double valoareRataSolvabPatrimoniala = soldTotalCapitalPropriu / soldTotalCapitaluri;
		return valoareRataSolvabPatrimoniala;

	}

	public Double getValoareRataSolvabPatrimoniala() {
		return valoareRataSolvabPatrimoniala;
	}

	public void setValoareRataSolvabPatrimoniala() {
		this.valoareRataSolvabPatrimoniala = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

}
