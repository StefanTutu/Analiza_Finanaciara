<<<<<<< HEAD:Analiza_Finanaciara/src/main/java/com/sample/IndicatorFinanciar.java
package com.sample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import com.sample.ContClient;

@Entity
public class IndicatorFinanciar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name="denumire")
	private String denumire;
	
	//Lichiditate
	
	@OneToMany
	@AssociationOverrides({
		@AssociationOverride(name = "TipCont",
				joinColumns = @JoinColumn(name = "Tip_Cont"))	
	})
	@JoinTable(name = "Active_Circulante",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "id"))
	private List<ContClient> conturiActiveCirculante= new ArrayList<ContClient>();
	private List<ContClient> conturiDatoriiCurente = new ArrayList<ContClient>();
	private List<ContClient> conturiStocuri = new ArrayList<ContClient>();
	private List<ContClient> conturiInvestitiiFinanciarePeTermenScurt = new ArrayList<ContClient>();
	private List<ContClient> creante = new ArrayList<ContClient>();
	private List<ContClient> conturiDisponibilitatiBanestiDinCasierie = new ArrayList<ContClient>();
	private List<ContClient> conturiBancare = new ArrayList<ContClient>();
	private List<ContClient> conturiCrediteBancarePeTermenScurt = new ArrayList<ContClient>();
	

	// Solvabilitate
	private List<ContClient> conturiTotalDatorii = new ArrayList<ContClient>();
	private List<ContClient> conturiTotalActiv = new ArrayList<ContClient>();
	private List<ContClient> conturiCapitalPropriu = new ArrayList<ContClient>();
	private List<ContClient> conturiTotalCapitaluri = new ArrayList<ContClient>();
	private List<ContClient> rateScadenteRambursare = new ArrayList<ContClient>();
	private List<ContClient> dobanziRate = new ArrayList<ContClient>();
	private Double cashFlow;
	
	//Autonomie Financiara
	private List<ContClient> conturiCapitalPermanent = new ArrayList<ContClient>();
	private List<ContClient> conturiPasivTotal = new ArrayList<ContClient>();
	
	private List<ContClient> conturiDatoriiPeTermenLung = new ArrayList<ContClient>();
	
	//Viteza de rotatie a activelor
	private List<ContClient> conturiCifraDeAfaceri = new ArrayList<ContClient>();
	private List<ContClient> conturiCapitaluriCirculante = new ArrayList<ContClient>();
	private List<ContClient> conturiStocGlobalMediu = new ArrayList<ContClient>();
	private Double bazaDeCalcul;
	private Double numarDeRotatii;
	private Double stocuriMedii;
	
	public IndicatorFinanciar() {
	}
	
	//Constructor Lichiditate
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiActiveCirculante,
			List<ContClient> conturiDatoriiCurente, List<ContClient> conturiStocuri,
			List<ContClient> conturiInvestitiiFinanciarePeTermenScurt, List<ContClient> creante,
			List<ContClient> conturiDisponibilitatiBanestiDinCasierie, List<ContClient> conturiBancare,
			List<ContClient> conturiCrediteBancarePeTermenScurt) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiActiveCirculante = conturiActiveCirculante;
		this.conturiDatoriiCurente = conturiDatoriiCurente;
		this.conturiStocuri = conturiStocuri;
		this.conturiInvestitiiFinanciarePeTermenScurt = conturiInvestitiiFinanciarePeTermenScurt;
		this.creante = creante;
		this.conturiDisponibilitatiBanestiDinCasierie = conturiDisponibilitatiBanestiDinCasierie;
		this.conturiBancare = conturiBancare;
		this.conturiCrediteBancarePeTermenScurt = conturiCrediteBancarePeTermenScurt;
	}
	

	//Constructor Solvabilitate
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiTotalDatorii,
			List<ContClient> conturiTotalActiv, List<ContClient> conturiCapitalPropriu,
			List<ContClient> conturiTotalCapitaluri, List<ContClient> rateScadenteRambursare,
			List<ContClient> dobanziRate, Double cashFlow) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiTotalDatorii = conturiTotalDatorii;
		this.conturiTotalActiv = conturiTotalActiv;
		this.conturiCapitalPropriu = conturiCapitalPropriu;
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
		this.rateScadenteRambursare = rateScadenteRambursare;
		this.dobanziRate = dobanziRate;
		this.cashFlow = cashFlow;
	}
	

	//Constructor Autonomie
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiTotalDatorii,
			List<ContClient> conturiTotalActiv, List<ContClient> conturiCapitalPropriu,
			List<ContClient> conturiCapitalPermanent, List<ContClient> conturiPasivTotal,
			List<ContClient> conturiDatoriiPeTermenLung) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiTotalDatorii = conturiTotalDatorii;
		this.conturiTotalActiv = conturiTotalActiv;
		this.conturiCapitalPropriu = conturiCapitalPropriu;
		this.conturiCapitalPermanent = conturiCapitalPermanent;
		this.conturiPasivTotal = conturiPasivTotal;
		this.conturiDatoriiPeTermenLung = conturiDatoriiPeTermenLung;
	}
	
	//Constructor Viteza de rotatie a activelor
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiCifraDeAfaceri,
			List<ContClient> conturiCapitaluriCirculante, List<ContClient> conturiStocGlobalMediu) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiCifraDeAfaceri = conturiCifraDeAfaceri;
		this.conturiCapitaluriCirculante = conturiCapitaluriCirculante;
		this.conturiStocGlobalMediu = conturiStocGlobalMediu;
	}
	
	//Constructor ALL
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiActiveCirculante,
			List<ContClient> conturiDatoriiCurente, List<ContClient> conturiStocuri,
			List<ContClient> conturiInvestitiiFinanciarePeTermenScurt, List<ContClient> creante,
			List<ContClient> conturiDisponibilitatiBanestiDinCasierie, List<ContClient> conturiBancare,
			List<ContClient> conturiCrediteBancarePeTermenScurt, 
			 List<ContClient> conturiTotalDatorii,
				List<ContClient> conturiTotalActiv, List<ContClient> conturiCapitalPropriu,
				List<ContClient> conturiTotalCapitaluri, List<ContClient> rateScadenteRambursare,
				List<ContClient> dobanziRate, Double cashFlow, 
				//List<ContClient> conturiTotalDatorii,
				//List<ContClient> conturiTotalActiv, 
				//List<ContClient> conturiCapitalPropriu,
				List<ContClient> conturiCapitalPermanent, List<ContClient> conturiPasivTotal,
				List<ContClient> conturiDatoriiPeTermenLung, List<ContClient> conturiCifraDeAfaceri,
				List<ContClient> conturiCapitaluriCirculante, List<ContClient> conturiStocGlobalMediu) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiActiveCirculante = conturiActiveCirculante;
		this.conturiDatoriiCurente = conturiDatoriiCurente;
		this.conturiStocuri = conturiStocuri;
		this.conturiInvestitiiFinanciarePeTermenScurt = conturiInvestitiiFinanciarePeTermenScurt;
		this.creante = creante;
		this.conturiDisponibilitatiBanestiDinCasierie = conturiDisponibilitatiBanestiDinCasierie;
		this.conturiBancare = conturiBancare;
		this.conturiCrediteBancarePeTermenScurt = conturiCrediteBancarePeTermenScurt;
		this.conturiTotalDatorii = conturiTotalDatorii;
		this.conturiTotalActiv = conturiTotalActiv;
		this.conturiCapitalPropriu = conturiCapitalPropriu;
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
		this.rateScadenteRambursare = rateScadenteRambursare;
		this.dobanziRate = dobanziRate;
		this.cashFlow = cashFlow;
		this.conturiCapitalPermanent = conturiCapitalPermanent;
		this.conturiPasivTotal = conturiPasivTotal;
		this.conturiDatoriiPeTermenLung = conturiDatoriiPeTermenLung;
		this.conturiCifraDeAfaceri = conturiCifraDeAfaceri;
		this.conturiCapitaluriCirculante = conturiCapitaluriCirculante;
		this.conturiStocGlobalMediu = conturiStocGlobalMediu;
	}
	
	
	
	
	
	public Double getNumarDeRotatii() {
		return numarDeRotatii;
	}

	public void setNumarDeRotatii(Double numarDeRotatii) {
		this.numarDeRotatii = numarDeRotatii;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public List<ContClient> getConturiActiveCirculante() {
		return conturiActiveCirculante;
	}

	public void setConturiActiveCirculante(List<ContClient> conturiActiveCirculante) {
		this.conturiActiveCirculante = conturiActiveCirculante;
	}

	public List<ContClient> getConturiDatoriiCurente() {
		return conturiDatoriiCurente;
	}

	public void setConturiDatoriiCurente(List<ContClient> conturiDatoriiCurente) {
		this.conturiDatoriiCurente = conturiDatoriiCurente;
	}

	public List<ContClient> getConturiStocuri() {
		return conturiStocuri;
	}

	public void setConturiStocuri(List<ContClient> conturiStocuri) {
		this.conturiStocuri = conturiStocuri;
	}

	public List<ContClient> getConturiInvestitiiFinanciarePeTermenScurt() {
		return conturiInvestitiiFinanciarePeTermenScurt;
	}

	public void setConturiInvestitiiFinanciarePeTermenScurt(List<ContClient> conturiInvestitiiFinanciarePeTermenScurt) {
		this.conturiInvestitiiFinanciarePeTermenScurt = conturiInvestitiiFinanciarePeTermenScurt;
	}

	public List<ContClient> getCreante() {
		return creante;
	}

	public void setCreante(List<ContClient> creante) {
		this.creante = creante;
	}

	public List<ContClient> getConturiDisponibilitatiBanestiDinCasierie() {
		return conturiDisponibilitatiBanestiDinCasierie;
	}

	public void setConturiDisponibilitatiBanestiDinCasierie(List<ContClient> conturiDisponibilitatiBanestiDinCasierie) {
		this.conturiDisponibilitatiBanestiDinCasierie = conturiDisponibilitatiBanestiDinCasierie;
	}

	public List<ContClient> getConturiBancare() {
		return conturiBancare;
	}

	public void setConturiBancare(List<ContClient> conturiBancare) {
		this.conturiBancare = conturiBancare;
	}

	public List<ContClient> getConturiCrediteBancarePeTermenScurt() {
		return conturiCrediteBancarePeTermenScurt;
	}

	public void setConturiCrediteBancarePeTermenScurt(List<ContClient> conturiCrediteBancarePeTermenScurt) {
		this.conturiCrediteBancarePeTermenScurt = conturiCrediteBancarePeTermenScurt;
	}

	public List<ContClient> getConturiTotalDatorii() {
		return conturiTotalDatorii;
	}

	public void setConturiTotalDatorii(List<ContClient> conturiTotalDatorii) {
		this.conturiTotalDatorii = conturiTotalDatorii;
	}

	public List<ContClient> getConturiTotalActiv() {
		return conturiTotalActiv;
	}

	public void setConturiTotalActiv(List<ContClient> conturiTotalActiv) {
		this.conturiTotalActiv = conturiTotalActiv;
	}

	public List<ContClient> getConturiCapitalPropriu() {
		return conturiCapitalPropriu;
	}

	public void setConturiCapitalPropriu(List<ContClient> conturiCapitalPropriu) {
		this.conturiCapitalPropriu = conturiCapitalPropriu;
	}

	public List<ContClient> getConturiTotalCapitaluri() {
		return conturiTotalCapitaluri;
	}

	public void setConturiTotalCapitaluri(List<ContClient> conturiTotalCapitaluri) {
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
	}

	public List<ContClient> getRateScadenteRambursare() {
		return rateScadenteRambursare;
	}

	public void setRateScadenteRambursare(List<ContClient> rateScadenteRambursare) {
		this.rateScadenteRambursare = rateScadenteRambursare;
	}

	public List<ContClient> getDobanziRate() {
		return dobanziRate;
	}

	public void setDobanziRate(List<ContClient> dobanziRate) {
		this.dobanziRate = dobanziRate;
	}

	public Double getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(Double cashFlow) {
		this.cashFlow = cashFlow;
	}

	public List<ContClient> getConturiCapitalPermanent() {
		return conturiCapitalPermanent;
	}

	public void setConturiCapitalPermanent(List<ContClient> conturiCapitalPermanent) {
		this.conturiCapitalPermanent = conturiCapitalPermanent;
	}

	public List<ContClient> getConturiPasivTotal() {
		return conturiPasivTotal;
	}

	public void setConturiPasivTotal(List<ContClient> conturiPasivTotal) {
		this.conturiPasivTotal = conturiPasivTotal;
	}

	public List<ContClient> getConturiDatoriiPeTermenLung() {
		return conturiDatoriiPeTermenLung;
	}

	public void setConturiDatoriiPeTermenLung(List<ContClient> conturiDatoriiPeTermenLung) {
		this.conturiDatoriiPeTermenLung = conturiDatoriiPeTermenLung;
	}

	public List<ContClient> getConturiCifraDeAfaceri() {
		return conturiCifraDeAfaceri;
	}

	public void setConturiCifraDeAfaceri(List<ContClient> conturiCifraDeAfaceri) {
		this.conturiCifraDeAfaceri = conturiCifraDeAfaceri;
	}

	public List<ContClient> getConturiCapitaluriCirculante() {
		return conturiCapitaluriCirculante;
	}

	public void setConturiCapitaluriCirculante(List<ContClient> conturiCapitaluriCirculante) {
		this.conturiCapitaluriCirculante = conturiCapitaluriCirculante;
	}

	public List<ContClient> getConturiStocGlobalMediu() {
		return conturiStocGlobalMediu;
	}

	public void setConturiStocGlobalMediu(List<ContClient> conturiStocGlobalMediu) {
		this.conturiStocGlobalMediu = conturiStocGlobalMediu;
	}


	public Double getBazaDeCalcul() {
		return bazaDeCalcul;
	}

	public void setBazaDeCalcul(Double bazaDeCalcul) {
		this.bazaDeCalcul = bazaDeCalcul;
	}

	public Double getStocuriMedii() {
		return stocuriMedii;
	}

	public void setStocuriMedii(Double stocuriMedii) {
		this.stocuriMedii = stocuriMedii;
	}

}
=======
package com.sample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sample.ContClient;

@Entity
@Table(name="indicator_financiar")
public class IndicatorFinanciar {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="indicator_financiar_id_seq")
    @SequenceGenerator(name="indicator_financiar_id_seq", sequenceName="indicator_financiar_id_seq", allocationSize=1)
	@Column(name = "id")
	private Long id;
	
	@Column(name="denumire")
	private String denumire;
	
	//Lichiditate
	@OneToMany
	@JoinTable(name = "active_circulante",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "activ_circulant_id"))
	private List<ContClient> conturiActiveCirculante= new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "datorii_curente",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "datorii_curente_id"))
	private List<ContClient> conturiDatoriiCurente = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "stocuri",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "stocuri_id"))
	private List<ContClient> conturiStocuri = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "investitii_termen_scurt",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "investitii_termen_scurt_id"))
	private List<ContClient> conturiInvestitiiFinanciarePeTermenScurt = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "creante",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "creante_id"))
	private List<ContClient> creante = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "disponibilitati_banesti_casierie",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "disponibilitati_banesti_casierie_id"))
	private List<ContClient> conturiDisponibilitatiBanestiDinCasierie = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "conturi_bancare",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "conturi_bancare_id"))
	private List<ContClient> conturiBancare = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "credite_bancare_termen_scurt",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "credite_bancare_termen_scurt_id"))
	private List<ContClient> conturiCrediteBancarePeTermenScurt = new ArrayList<ContClient>();
	

	// Solvabilitate
	
	@OneToMany
	@JoinTable(name = "total_datorii",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "total_datorii_id"))
	private List<ContClient> conturiTotalDatorii = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "total_activ",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "total_activ_id"))
	private List<ContClient> conturiTotalActiv = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "capital_propriu",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "capital_propriu_id"))
	private List<ContClient> conturiCapitalPropriu = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "total_capitaluri",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "total_capitaluri_id"))
	private List<ContClient> conturiTotalCapitaluri = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "scadente_rambursare",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "scadente_rambursare_id"))
	private List<ContClient> rateScadenteRambursare = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "dobanzi_rate",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "dobanzi_rate_id"))
	private List<ContClient> dobanziRate = new ArrayList<ContClient>();
	private Double cashFlow;
	
	//Autonomie Financiara
	@OneToMany
	@JoinTable(name = "capital_permanent",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "capital_permanent_id"))
	private List<ContClient> conturiCapitalPermanent = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "pasiv_total",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "pasiv_total_id"))
	private List<ContClient> conturiPasivTotal = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "datorii_termen_lung",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "datorii_termen_lung_id"))
	private List<ContClient> conturiDatoriiPeTermenLung = new ArrayList<ContClient>();
	
	//Viteza de rotatie a activelor
	@OneToMany
	@JoinTable(name = "cifra_de_afaceri",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "cifra_de_afaceri_id"))
	private List<ContClient> conturiCifraDeAfaceri = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "capitaluri_circulante",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "capitaluri_circulante_id"))
	private List<ContClient> conturiCapitaluriCirculante = new ArrayList<ContClient>();
	
	@OneToMany
	@JoinTable(name = "stoc_global_mediu",
				joinColumns = @JoinColumn(name = "cont_id"),
				inverseJoinColumns = @JoinColumn(name = "stoc_global_mediu_id"))
	private List<ContClient> conturiStocGlobalMediu = new ArrayList<ContClient>();
	

	private Double bazaDeCalcul;
	private Double numarDeRotatii;
	private Double stocuriMedii;
	
	public IndicatorFinanciar() {
	}
	
	//Constructor Lichiditate
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiActiveCirculante,
			List<ContClient> conturiDatoriiCurente, List<ContClient> conturiStocuri,
			List<ContClient> conturiInvestitiiFinanciarePeTermenScurt, List<ContClient> creante,
			List<ContClient> conturiDisponibilitatiBanestiDinCasierie, List<ContClient> conturiBancare,
			List<ContClient> conturiCrediteBancarePeTermenScurt) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiActiveCirculante = conturiActiveCirculante;
		this.conturiDatoriiCurente = conturiDatoriiCurente;
		this.conturiStocuri = conturiStocuri;
		this.conturiInvestitiiFinanciarePeTermenScurt = conturiInvestitiiFinanciarePeTermenScurt;
		this.creante = creante;
		this.conturiDisponibilitatiBanestiDinCasierie = conturiDisponibilitatiBanestiDinCasierie;
		this.conturiBancare = conturiBancare;
		this.conturiCrediteBancarePeTermenScurt = conturiCrediteBancarePeTermenScurt;
	}
	

	//Constructor Solvabilitate
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiTotalDatorii,
			List<ContClient> conturiTotalActiv, List<ContClient> conturiCapitalPropriu,
			List<ContClient> conturiTotalCapitaluri, List<ContClient> rateScadenteRambursare,
			List<ContClient> dobanziRate, Double cashFlow) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiTotalDatorii = conturiTotalDatorii;
		this.conturiTotalActiv = conturiTotalActiv;
		this.conturiCapitalPropriu = conturiCapitalPropriu;
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
		this.rateScadenteRambursare = rateScadenteRambursare;
		this.dobanziRate = dobanziRate;
		this.cashFlow = cashFlow;
	}
	

	//Constructor Autonomie
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiTotalDatorii,
			List<ContClient> conturiTotalActiv, List<ContClient> conturiCapitalPropriu,
			List<ContClient> conturiCapitalPermanent, List<ContClient> conturiPasivTotal,
			List<ContClient> conturiDatoriiPeTermenLung) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiTotalDatorii = conturiTotalDatorii;
		this.conturiTotalActiv = conturiTotalActiv;
		this.conturiCapitalPropriu = conturiCapitalPropriu;
		this.conturiCapitalPermanent = conturiCapitalPermanent;
		this.conturiPasivTotal = conturiPasivTotal;
		this.conturiDatoriiPeTermenLung = conturiDatoriiPeTermenLung;
	}
	
	//Constructor Viteza de rotatie a activelor
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiCifraDeAfaceri,
			List<ContClient> conturiCapitaluriCirculante, List<ContClient> conturiStocGlobalMediu) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiCifraDeAfaceri = conturiCifraDeAfaceri;
		this.conturiCapitaluriCirculante = conturiCapitaluriCirculante;
		this.conturiStocGlobalMediu = conturiStocGlobalMediu;
	}
	
	//Constructor ALL
	public IndicatorFinanciar(Long id, String denumire, List<ContClient> conturiActiveCirculante,
			List<ContClient> conturiDatoriiCurente, List<ContClient> conturiStocuri,
			List<ContClient> conturiInvestitiiFinanciarePeTermenScurt, List<ContClient> creante,
			List<ContClient> conturiDisponibilitatiBanestiDinCasierie, List<ContClient> conturiBancare,
			List<ContClient> conturiCrediteBancarePeTermenScurt, 
			 List<ContClient> conturiTotalDatorii,
				List<ContClient> conturiTotalActiv, List<ContClient> conturiCapitalPropriu,
				List<ContClient> conturiTotalCapitaluri, List<ContClient> rateScadenteRambursare,
				List<ContClient> dobanziRate, Double cashFlow, 
				//List<ContClient> conturiTotalDatorii,
				//List<ContClient> conturiTotalActiv, 
				//List<ContClient> conturiCapitalPropriu,
				List<ContClient> conturiCapitalPermanent, List<ContClient> conturiPasivTotal,
				List<ContClient> conturiDatoriiPeTermenLung, List<ContClient> conturiCifraDeAfaceri,
				List<ContClient> conturiCapitaluriCirculante, List<ContClient> conturiStocGlobalMediu) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.conturiActiveCirculante = conturiActiveCirculante;
		this.conturiDatoriiCurente = conturiDatoriiCurente;
		this.conturiStocuri = conturiStocuri;
		this.conturiInvestitiiFinanciarePeTermenScurt = conturiInvestitiiFinanciarePeTermenScurt;
		this.creante = creante;
		this.conturiDisponibilitatiBanestiDinCasierie = conturiDisponibilitatiBanestiDinCasierie;
		this.conturiBancare = conturiBancare;
		this.conturiCrediteBancarePeTermenScurt = conturiCrediteBancarePeTermenScurt;
		this.conturiTotalDatorii = conturiTotalDatorii;
		this.conturiTotalActiv = conturiTotalActiv;
		this.conturiCapitalPropriu = conturiCapitalPropriu;
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
		this.rateScadenteRambursare = rateScadenteRambursare;
		this.dobanziRate = dobanziRate;
		this.cashFlow = cashFlow;
		this.conturiCapitalPermanent = conturiCapitalPermanent;
		this.conturiPasivTotal = conturiPasivTotal;
		this.conturiDatoriiPeTermenLung = conturiDatoriiPeTermenLung;
		this.conturiCifraDeAfaceri = conturiCifraDeAfaceri;
		this.conturiCapitaluriCirculante = conturiCapitaluriCirculante;
		this.conturiStocGlobalMediu = conturiStocGlobalMediu;
	}
	
	
	
	
	
	public Double getNumarDeRotatii() {
		return numarDeRotatii;
	}

	public void setNumarDeRotatii(Double numarDeRotatii) {
		this.numarDeRotatii = numarDeRotatii;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public List<ContClient> getConturiActiveCirculante() {
		return conturiActiveCirculante;
	}

	public void setConturiActiveCirculante(List<ContClient> conturiActiveCirculante) {
		this.conturiActiveCirculante = conturiActiveCirculante;
	}

	public List<ContClient> getConturiDatoriiCurente() {
		return conturiDatoriiCurente;
	}

	public void setConturiDatoriiCurente(List<ContClient> conturiDatoriiCurente) {
		this.conturiDatoriiCurente = conturiDatoriiCurente;
	}

	public List<ContClient> getConturiStocuri() {
		return conturiStocuri;
	}

	public void setConturiStocuri(List<ContClient> conturiStocuri) {
		this.conturiStocuri = conturiStocuri;
	}

	public List<ContClient> getConturiInvestitiiFinanciarePeTermenScurt() {
		return conturiInvestitiiFinanciarePeTermenScurt;
	}

	public void setConturiInvestitiiFinanciarePeTermenScurt(List<ContClient> conturiInvestitiiFinanciarePeTermenScurt) {
		this.conturiInvestitiiFinanciarePeTermenScurt = conturiInvestitiiFinanciarePeTermenScurt;
	}

	public List<ContClient> getCreante() {
		return creante;
	}

	public void setCreante(List<ContClient> creante) {
		this.creante = creante;
	}

	public List<ContClient> getConturiDisponibilitatiBanestiDinCasierie() {
		return conturiDisponibilitatiBanestiDinCasierie;
	}

	public void setConturiDisponibilitatiBanestiDinCasierie(List<ContClient> conturiDisponibilitatiBanestiDinCasierie) {
		this.conturiDisponibilitatiBanestiDinCasierie = conturiDisponibilitatiBanestiDinCasierie;
	}

	public List<ContClient> getConturiBancare() {
		return conturiBancare;
	}

	public void setConturiBancare(List<ContClient> conturiBancare) {
		this.conturiBancare = conturiBancare;
	}

	public List<ContClient> getConturiCrediteBancarePeTermenScurt() {
		return conturiCrediteBancarePeTermenScurt;
	}

	public void setConturiCrediteBancarePeTermenScurt(List<ContClient> conturiCrediteBancarePeTermenScurt) {
		this.conturiCrediteBancarePeTermenScurt = conturiCrediteBancarePeTermenScurt;
	}

	public List<ContClient> getConturiTotalDatorii() {
		return conturiTotalDatorii;
	}

	public void setConturiTotalDatorii(List<ContClient> conturiTotalDatorii) {
		this.conturiTotalDatorii = conturiTotalDatorii;
	}

	public List<ContClient> getConturiTotalActiv() {
		return conturiTotalActiv;
	}

	public void setConturiTotalActiv(List<ContClient> conturiTotalActiv) {
		this.conturiTotalActiv = conturiTotalActiv;
	}

	public List<ContClient> getConturiCapitalPropriu() {
		return conturiCapitalPropriu;
	}

	public void setConturiCapitalPropriu(List<ContClient> conturiCapitalPropriu) {
		this.conturiCapitalPropriu = conturiCapitalPropriu;
	}

	public List<ContClient> getConturiTotalCapitaluri() {
		return conturiTotalCapitaluri;
	}

	public void setConturiTotalCapitaluri(List<ContClient> conturiTotalCapitaluri) {
		this.conturiTotalCapitaluri = conturiTotalCapitaluri;
	}

	public List<ContClient> getRateScadenteRambursare() {
		return rateScadenteRambursare;
	}

	public void setRateScadenteRambursare(List<ContClient> rateScadenteRambursare) {
		this.rateScadenteRambursare = rateScadenteRambursare;
	}

	public List<ContClient> getDobanziRate() {
		return dobanziRate;
	}

	public void setDobanziRate(List<ContClient> dobanziRate) {
		this.dobanziRate = dobanziRate;
	}

	public Double getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(Double cashFlow) {
		this.cashFlow = cashFlow;
	}

	public List<ContClient> getConturiCapitalPermanent() {
		return conturiCapitalPermanent;
	}

	public void setConturiCapitalPermanent(List<ContClient> conturiCapitalPermanent) {
		this.conturiCapitalPermanent = conturiCapitalPermanent;
	}

	public List<ContClient> getConturiPasivTotal() {
		return conturiPasivTotal;
	}

	public void setConturiPasivTotal(List<ContClient> conturiPasivTotal) {
		this.conturiPasivTotal = conturiPasivTotal;
	}

	public List<ContClient> getConturiDatoriiPeTermenLung() {
		return conturiDatoriiPeTermenLung;
	}

	public void setConturiDatoriiPeTermenLung(List<ContClient> conturiDatoriiPeTermenLung) {
		this.conturiDatoriiPeTermenLung = conturiDatoriiPeTermenLung;
	}

	public List<ContClient> getConturiCifraDeAfaceri() {
		return conturiCifraDeAfaceri;
	}

	public void setConturiCifraDeAfaceri(List<ContClient> conturiCifraDeAfaceri) {
		this.conturiCifraDeAfaceri = conturiCifraDeAfaceri;
	}

	public List<ContClient> getConturiCapitaluriCirculante() {
		return conturiCapitaluriCirculante;
	}

	public void setConturiCapitaluriCirculante(List<ContClient> conturiCapitaluriCirculante) {
		this.conturiCapitaluriCirculante = conturiCapitaluriCirculante;
	}

	public List<ContClient> getConturiStocGlobalMediu() {
		return conturiStocGlobalMediu;
	}

	public void setConturiStocGlobalMediu(List<ContClient> conturiStocGlobalMediu) {
		this.conturiStocGlobalMediu = conturiStocGlobalMediu;
	}


	public Double getBazaDeCalcul() {
		return bazaDeCalcul;
	}

	public void setBazaDeCalcul(Double bazaDeCalcul) {
		this.bazaDeCalcul = bazaDeCalcul;
	}

	public Double getStocuriMedii() {
		return stocuriMedii;
	}

	public void setStocuriMedii(Double stocuriMedii) {
		this.stocuriMedii = stocuriMedii;
	}

}
>>>>>>> andreeaBranch:src/main/java/com/sample/IndicatorFinanciar.java
