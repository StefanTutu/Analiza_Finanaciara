package main.java.Lichiditate;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class RataLichidRapida {
	private IndicatorFinanciar indicatorFinanciar;
	private TipLichiditate tip;
	private Double valoareRataLichidRapida;

	public RataLichidRapida() {
	}

	public RataLichidRapida(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipLichiditate getTip() {
		return tip;
	}

	public void setTip(TipLichiditate tip) {
		this.tip = tip;
	}

	

	public Double getValoareRataLichidRapida() {
		return valoareRataLichidRapida;
	}

	public void setValoareRataLichidRapida() {
		this.valoareRataLichidRapida = formulaCalcul();
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	
	public double formulaCalcul() {
		Double creante = 0.0;
		for (ContClient c : indicatorFinanciar.getCreante()) {
			creante+= c.getSuma();
		}
		
		Double disponibilitatiBanestiDinCasierie = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDisponibilitatiBanestiDinCasierie()) {
			disponibilitatiBanestiDinCasierie+= c.getSuma();
		}

		Double datoriiCurente = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiDatoriiCurente()) {
			datoriiCurente += c.getSuma();
		}

		Double valoareRataLichidRapida = (creante+disponibilitatiBanestiDinCasierie) / datoriiCurente;
		return valoareRataLichidRapida;

	}

}
