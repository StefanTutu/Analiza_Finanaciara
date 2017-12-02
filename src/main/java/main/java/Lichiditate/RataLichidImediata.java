package main.java.Lichiditate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataLichidImediata {
	
	private IndicatorFinanciar indicatorFinanciar;
	private TipLichiditate tip;
	private Double valoareRataLichidImediata;

	public RataLichidImediata() {
	}

	public RataLichidImediata(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipLichiditate getTip() {
		return tip;
	}

	public void setTip(TipLichiditate tip) {
		this.tip = tip;
	}

	

	public Double getValoareRataLichidImediata() {
		return valoareRataLichidImediata;
	}

	public void setValoareRataLichidImediata() {
		this.valoareRataLichidImediata = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	
	public double formulaCalcul() {
		Double investitiiFinanciarePeTermenScurt = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiInvestitiiFinanciarePeTermenScurt()) {
			investitiiFinanciarePeTermenScurt+= c.getSuma();
		}

		Double datoriiCurente = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDatoriiCurente()) {
			datoriiCurente += c.getSuma();
		}

		Double valoareRataLichidImediata = investitiiFinanciarePeTermenScurt / datoriiCurente;
		return valoareRataLichidImediata;

	}

}
