package main.java.Lichiditate;

import com.sample.IndicatorFinanciar;

public class Lichiditate {
	private IndicatorFinanciar indicatorFinanciar;
	private TipLichiditate tipLichiditate;
	
	public Lichiditate(){}
	
	public Lichiditate(IndicatorFinanciar indicatorFinanciar)
	{
		super();
		this.indicatorFinanciar=indicatorFinanciar;
	}
	
	public IndicatorFinanciar getIndicatorFinanciar() {
		return indicatorFinanciar;
	}

	public void setIndicatorFinanciar(IndicatorFinanciar indicatorFinanciar) {
		this.indicatorFinanciar = indicatorFinanciar;
	}

	public TipLichiditate getTipLichiditate() {
		return tipLichiditate;
	}

	public void setTipLichiditate(TipLichiditate tipLichiditate) {
		this.tipLichiditate = tipLichiditate;
	}
		
}
