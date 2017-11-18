package main.java.Solvabilitate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class ActivNetContabil {

	private IndicatorFinanciar indicatorFinanciar;
	private TipActivNetContabil tip;
	private Double valoareActivNetContabil;

	public ActivNetContabil() {
	}

	public ActivNetContabil(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipActivNetContabil getTip() {

		return tip;
	}

	public void setTip(TipActivNetContabil tip) {
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

		Double valoareActivNetContabil = soldTotalActiv - soldTotalDatorii;
		return valoareActivNetContabil;

	}

	public Double getValoareActivNetContabil() {
		return valoareActivNetContabil;
	}

	public void setValoareActivNetContabil() {
		this.valoareActivNetContabil = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

}
