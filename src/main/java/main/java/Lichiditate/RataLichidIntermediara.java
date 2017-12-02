package main.java.Lichiditate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataLichidIntermediara {

	private IndicatorFinanciar indicatorFinanciar;
	private TipLichiditate tip;
	private Double valoareRataLichidIntermediara;

	public RataLichidIntermediara() {
	}

	public RataLichidIntermediara(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipLichiditate getTip() {
		return tip;
	}

	public void setTip(TipLichiditate tip) {
		this.tip = tip;
	}


	public Double getValoareRataLichidIntermediara() {
		return valoareRataLichidIntermediara;
	}

	public void setValoareRataLichidIntermediara() {
		this.valoareRataLichidIntermediara = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	
	public double formulaCalcul() {
		Double activeCirculante = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiActiveCirculante()) {
			activeCirculante+= c.getSuma();
		}

		Double stocuri = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiStocuri()) {
			stocuri+= c.getSuma();
		}
		
		Double datoriiCurente = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDatoriiCurente()) {
			datoriiCurente += c.getSuma();
		}

		Double valoareRataLichidIntermediara = (activeCirculante-stocuri) / datoriiCurente;
		return valoareRataLichidIntermediara;

	}


}
