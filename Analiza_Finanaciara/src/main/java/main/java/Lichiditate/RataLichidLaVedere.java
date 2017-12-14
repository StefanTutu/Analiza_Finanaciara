package main.java.Lichiditate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataLichidLaVedere {
	private IndicatorFinanciar indicatorFinanciar;
	private TipLichiditate tip;
	private Double valoareRataLichidLaVedere;

	public RataLichidLaVedere() {
	}

	public RataLichidLaVedere(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipLichiditate getTip() {
		return tip;
	}

	public void setTip(TipLichiditate tip) {
		this.tip = tip;
	}

	

	public Double getValoareRataLichidLaVedere() {
		return valoareRataLichidLaVedere;
	}

	public void setValoareRataLichidLaVedere() {
		this.valoareRataLichidLaVedere = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	
	public double formulaCalcul() {
		Double disponibilitatiBanestiDinCasierie = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDisponibilitatiBanestiDinCasierie()) {
			disponibilitatiBanestiDinCasierie+= c.getSuma();
		}
		
		Double conturiBancare = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiBancare()) {
			conturiBancare+= c.getSuma();
		}

		Double crediteBancarePeTermenScurt = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCrediteBancarePeTermenScurt()) {
			crediteBancarePeTermenScurt += c.getSuma();
		}

		Double valoareRataLichidLaVedere = (disponibilitatiBanestiDinCasierie+conturiBancare) / crediteBancarePeTermenScurt;
		return valoareRataLichidLaVedere;

	}

}
