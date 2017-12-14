package main.java.AutonomieFinanciara;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataDeIndatorareGobale {

	private IndicatorFinanciar indicatorFinanciar;
	private TipAutonomie tip;
	private Double valaoreRataDeIndatorareGobale;
	
	public RataDeIndatorareGobale() {
		
	}
	
	public RataDeIndatorareGobale(IndicatorFinanciar indicatorFinanciar) {
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

	public Double getValaoreRataDeIndatorareGobale() {
		return valaoreRataDeIndatorareGobale;
	}

	public void setValaoreRataDeIndatorareGobale() {
		this.valaoreRataDeIndatorareGobale = formulaCalcul();
	}
	
	public double formulaCalcul() {
		Double datoriiTotale = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiTotalDatorii()) {
			datoriiTotale += c.getSuma();
		}

		Double pasivTotal = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiPasivTotal()) {
			pasivTotal += c.getSuma();
		}
		Double valaoreRataDeIndatorareGobale = datoriiTotale / pasivTotal;
		return valaoreRataDeIndatorareGobale;
	}
	
	
}
