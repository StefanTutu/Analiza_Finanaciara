package main.java.AutonomieFinanciara;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataDatoriilorPeTermenScurt {

	private IndicatorFinanciar indicatorFinanciar;
	private TipAutonomie tip;
	private Double valaoreRataDatoriilorPeTermenScurt;

	public RataDatoriilorPeTermenScurt() {

	}

	public RataDatoriilorPeTermenScurt(IndicatorFinanciar indicatorFinanciar) {
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

	public Double getValaoreRataDatoriilorPeTermenScurt() {
		return valaoreRataDatoriilorPeTermenScurt;
	}

	public void setValaoreRataDatoriilorPeTermenScurt(Double valaoreRataDatoriilorPeTermenScurt) {
		this.valaoreRataDatoriilorPeTermenScurt = valaoreRataDatoriilorPeTermenScurt;
	}

	public double formulaCalcul() {
		Double datoriiPeTermenLung = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDatoriiPeTermenLung()) {
			datoriiPeTermenLung += c.getSuma();
		}

		Double pasivTotal = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiPasivTotal()) {
			pasivTotal += c.getSuma();
		}
		Double valaoreRataDatoriilorPeTermenScurt = datoriiPeTermenLung / pasivTotal;
		return valaoreRataDatoriilorPeTermenScurt;
	}

}
