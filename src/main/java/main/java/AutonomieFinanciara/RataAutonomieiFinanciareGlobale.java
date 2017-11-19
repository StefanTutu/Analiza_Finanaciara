package main.java.AutonomieFinanciara;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataAutonomieiFinanciareGlobale {

	private IndicatorFinanciar indicatorFinanciar;
	private TipAutonomie tip;
	private Double valoareRataAutonomieiFinanciareGlobale;

	public RataAutonomieiFinanciareGlobale() {

	}

	public RataAutonomieiFinanciareGlobale(IndicatorFinanciar indicatorFinanciar) {
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

	public Double getValoareRataAutonomieiFinanciareGlobale() {
		return valoareRataAutonomieiFinanciareGlobale;
	}

	public void setValoareRataAutonomieiFinanciareGlobale() {
		this.valoareRataAutonomieiFinanciareGlobale = formulaCalcul();
	}

	public double formulaCalcul() {
		Double capitalPropriu = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCapitalPropriu()) {
			capitalPropriu += c.getSuma();
		}

		Double pasivTotal = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiPasivTotal()) {
			pasivTotal += c.getSuma();
		}
		Double valoareRataAutonomieiFinanciareGlobale = capitalPropriu / pasivTotal;
		return valoareRataAutonomieiFinanciareGlobale;
	}

}
