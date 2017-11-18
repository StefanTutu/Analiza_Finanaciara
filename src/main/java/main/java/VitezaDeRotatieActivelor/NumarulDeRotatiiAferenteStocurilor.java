package main.java.VitezaDeRotatieActivelor;

import com.sample.ContClient;
import com.sample.IndicatorFinanciar;

public class NumarulDeRotatiiAferenteStocurilor {

	private IndicatorFinanciar indicatorFinanciar;
	private TipVitezaDeRotatieActivelor tip;
	private Double valoareNumarulDeRotatiiAferenteStocurilor;
	
	public NumarulDeRotatiiAferenteStocurilor() {
		
	}
	public NumarulDeRotatiiAferenteStocurilor(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}
	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}
	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}
	public TipVitezaDeRotatieActivelor getTip() {
		return tip;
	}
	public void setTip(TipVitezaDeRotatieActivelor tip) {
		this.tip = tip;
	}
	public Double getValoareNumarulDeRotatiiAferenteStocurilor() {
		return valoareNumarulDeRotatiiAferenteStocurilor;
	}
	public void setValoareNumarulDeRotatiiAferenteStocurilor(Double valoareNumarulDeRotatiiAferenteStocurilor) {
		this.valoareNumarulDeRotatiiAferenteStocurilor = valoareNumarulDeRotatiiAferenteStocurilor;
	}
	
	public double formulaCalcul() {
		Double cifraDeAfaceri = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiCifraDeAfaceri()) {
			cifraDeAfaceri += c.getSuma();
		}
		
		Double stocGlobalMediu = 0.0;
		for (ContClient c : indicatorFinanciar.getConturiStocGlobalMediu()) {
			stocGlobalMediu += c.getSuma();
		}
		
		Double valoareNumarulDeRotatiiAferenteStocurilor = cifraDeAfaceri/stocGlobalMediu;
		return valoareNumarulDeRotatiiAferenteStocurilor;
	}
}
