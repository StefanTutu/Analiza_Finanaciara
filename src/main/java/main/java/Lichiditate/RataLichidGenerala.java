package main.java.Lichiditate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;


public class RataLichidGenerala {
	private IndicatorFinanciar indicatorFinanciar;
	private TipLichiditate tip;
	private Double valoareRataLichidGenerala;

	public RataLichidGenerala() {
	}

	public RataLichidGenerala(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipLichiditate getTip() {
		return tip;
	}

	public void setTip(TipLichiditate tip) {
		this.tip = tip;
	}

	

	public Double getValoareRataLichidGenerala() {
		return valoareRataLichidGenerala;
	}

	public void setValoareRataLichidGenerala() {
		this.valoareRataLichidGenerala = formulaCalcul();
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

		Double datoriiCurente = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDatoriiCurente()) {
			datoriiCurente += c.getSuma();
		}

		Double valoareRataLichidGenerala = activeCirculante / datoriiCurente;
		return valoareRataLichidGenerala;

	}

}
