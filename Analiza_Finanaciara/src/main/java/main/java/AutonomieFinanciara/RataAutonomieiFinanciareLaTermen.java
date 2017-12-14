package main.java.AutonomieFinanciara;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataAutonomieiFinanciareLaTermen {

	private IndicatorFinanciar indicatorFinanciar;
	private TipAutonomie tip;
	private Double valaoreRataAutomieiFinanciareLaTermen;

	public RataAutonomieiFinanciareLaTermen() {

	}

	public RataAutonomieiFinanciareLaTermen(IndicatorFinanciar indicatorFinanciar) {
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

	public Double getValaoreRataAutomieiFinanciareLaTermen() {
		return valaoreRataAutomieiFinanciareLaTermen;
	}

	public void setValaoreRataAutomieiFinanciareLaTermen1() {
		this.valaoreRataAutomieiFinanciareLaTermen = formulaCalcul1();
	}
	
	public void setValaoreRataAutomieiFinanciareLaTermen2() {
		this.valaoreRataAutomieiFinanciareLaTermen = formulaCalcul2();
	}

	public double formulaCalcul1() {
		Double capitalPropriu = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCapitalPropriu()) {
			capitalPropriu += c.getSuma();
		}

		Double capitalPermanent = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCapitalPermanent()) {
			capitalPermanent += c.getSuma();
		}

		Double valaoreRataAutomieiFinanciareLaTermen = capitalPropriu / capitalPermanent;
		return valaoreRataAutomieiFinanciareLaTermen;
	}

	public double formulaCalcul2() {
		Double capitalPropriu = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCapitalPropriu()) {
			capitalPropriu += c.getSuma();
		}

		Double datoriiPeTermenLung = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDatoriiPeTermenLung()) {
			datoriiPeTermenLung += c.getSuma();
		}
		Double valaoreRataAutomieiFinanciareLaTermen = capitalPropriu / datoriiPeTermenLung;
		return valaoreRataAutomieiFinanciareLaTermen;
	}

}
