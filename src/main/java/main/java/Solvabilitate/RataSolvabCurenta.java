package main.java.Solvabilitate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataSolvabCurenta {

	private IndicatorFinanciar indicatorFinanciar;
	private TipRataSolvabCurenta tip;
	private Double valoareRataSolvabCurenta;

	public RataSolvabCurenta() {
	}

	public RataSolvabCurenta(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipRataSolvabCurenta getTip() {
		return tip;
	}

	public void setTip(TipRataSolvabCurenta tip) {
		this.tip = tip;
	}

	public double formulaCalcul() {
		Double soldTotalRate = 0.0;
		for (ContClient c : indicatorFinanciar.getRateScadenteRambursare()) {
			soldTotalRate += c.getSuma();
		}

		Double soldTotalDobanzi = 0.0;
		for (ContClient c : indicatorFinanciar.getDobanziRate()) {
			soldTotalDobanzi += c.getSuma();
		}

		Double cashFlow = indicatorFinanciar.getCashFlow();
		Double valoareRataSolvabCurenta = cashFlow / (soldTotalRate + soldTotalDobanzi);
		return valoareRataSolvabCurenta;

	}

	public Double getValoareRataSolvabCurenta() {
		return valoareRataSolvabCurenta;
	}

	public void setValoareRataSolvabCurenta() {
		this.valoareRataSolvabCurenta = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

}
