package main.java.Solvabilitate;

import com.sample.IndicatorFinanciar;

public class Solvabilitate {
	private IndicatorFinanciar indicatorFinanciar;
	private TipSolvabilitate tipSolvabilitate;

	public Solvabilitate() {
	}

	public Solvabilitate(IndicatorFinanciar indicatorFinanciar) {
		super();
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipSolvabilitate getTipSolvabilitate() {
		return tipSolvabilitate;
	}

	public void setTipSolvabilitate(TipSolvabilitate tipSolvabilitate) {
		this.tipSolvabilitate = tipSolvabilitate;
	}

}
