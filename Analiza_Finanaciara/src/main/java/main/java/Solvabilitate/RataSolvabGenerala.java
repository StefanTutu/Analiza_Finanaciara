package main.java.Solvabilitate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataSolvabGenerala {
	private IndicatorFinanciar indicatorFinanciar;
	private TipRataSolvabGenerala tip;
	private Double valoareRataSolvabGenerala;

	public RataSolvabGenerala() {
	}

	public RataSolvabGenerala(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipRataSolvabGenerala getTip() {
		return tip;
	}

	public void setTip(TipRataSolvabGenerala tip) {
		this.tip = tip;
	}

	public double formulaCalcul() {
		Double soldTotalActiv = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiTotalActiv()) {
			soldTotalActiv += c.getSuma();
		}

		Double soldTotalDatorii = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiTotalDatorii()) {
			soldTotalDatorii += c.getSuma();
		}

		Double valoareRataSolvabGenerala = soldTotalActiv / soldTotalDatorii;
		return valoareRataSolvabGenerala;

	}

	public Double getValoareRataSolvabGenerala() {
		return valoareRataSolvabGenerala;
	}

	public void setValoareRataSolvabGenerala() {
		this.valoareRataSolvabGenerala = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

}
