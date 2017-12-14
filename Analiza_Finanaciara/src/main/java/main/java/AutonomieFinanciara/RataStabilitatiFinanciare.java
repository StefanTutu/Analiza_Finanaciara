package main.java.AutonomieFinanciara;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataStabilitatiFinanciare {

	private IndicatorFinanciar indicatorFinanciar;
	private TipAutonomie tip;
	private Double valoareRataStabilitatiiFinanciare;

	public RataStabilitatiFinanciare() {

	}

	public RataStabilitatiFinanciare(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipAutonomie getTip() {
		return tip;
	}

	public void setTip(TipAutonomie tip) {
		this.tip = tip;
	}

	public Double getValoareRataStabilitatiiFinanciare() {
		return valoareRataStabilitatiiFinanciare;
	}

	public void setValoareRataStabilitatiiFinanciare() {
		this.valoareRataStabilitatiiFinanciare = formulaCalcul();
	}

	public double formulaCalcul() {
		Double capitalPermanent = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCapitalPermanent()) {
			capitalPermanent += c.getSuma();
		}

		Double pasivTotal = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiPasivTotal()) {
			pasivTotal += c.getSuma();
		}
		Double valoareRataStabilitatiiFinanciare = capitalPermanent / pasivTotal;
		return valoareRataStabilitatiiFinanciare;
	}

}
