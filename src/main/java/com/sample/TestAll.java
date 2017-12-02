package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestAll {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContClientainer = ks.getKieClasspathContainer();
		KieSession kSession = kContClientainer.newKieSession("ksession-rules");

		// TEST SOLVABILITATE

		// datorii
		ContClient datorii1 = new ContClient(100L, "Datorii 1", 1000.0);
		ContClient datorii2 = new ContClient(101L, "Datorii 2", 3000.0);
		List<ContClient> conturiTotalDatorii = new ArrayList<ContClient>();
		conturiTotalDatorii.add(datorii1);
		conturiTotalDatorii.add(datorii2);

		// solduri
		ContClient sold1 = new ContClient(200L, "Sold 1", 40000.0);
		List<ContClient> conturiTotalActiv = new ArrayList<ContClient>();
		conturiTotalActiv.add(sold1);

		// capitalPropriu
		ContClient capitalPropriu1 = new ContClient(300L, "Capital propriu 1", 10000.0);
		ContClient capitalPropriu2 = new ContClient(301L, "Capital propriu 2", 15000.0);
		List<ContClient> conturiCapitalPropriu = new ArrayList<ContClient>();
		conturiCapitalPropriu.add(capitalPropriu1);
		conturiCapitalPropriu.add(capitalPropriu2);

		// totalCapitaluri
		ContClient totalCapital = new ContClient(400L, "Total capitaluri firma", 80000.0);
		List<ContClient> conturiTotalCapitaluri = new ArrayList<ContClient>();
		conturiTotalCapitaluri.add(totalCapital);

		// rateScadente
		ContClient rate = new ContClient(500L, "Rate 1", 800.0);
		List<ContClient> rateScadenteRambursare = new ArrayList<ContClient>();
		rateScadenteRambursare.add(rate);

		// dobanzi
		ContClient dobanda = new ContClient(600L, "Dobanda 1", 400.0);
		List<ContClient> dobanziRate = new ArrayList<ContClient>();
		dobanziRate.add(dobanda);
		// cashFlow
		Double cashFlow = 4000.0;

		IndicatorFinanciar solvabilitate = new IndicatorFinanciar(1001L, "Solvabilitate", conturiTotalDatorii,
				conturiTotalActiv, conturiCapitalPropriu, conturiTotalCapitaluri, rateScadenteRambursare, dobanziRate,
				cashFlow);
		// ActivNetContabil act= new ActivNetContabil();
		// act.setTip(TipActivNetContabil.POZITIV);
		// System.out.println("AAAAAAAAAAAA"+act.getTip().equals(TipActivNetContabil.POZITIV));
		//

		// TEST AUTONOMIE FINANCIARA

		// Capital permanent
		ContClient capitalPermanent1 = new ContClient(700L, "Capital Permanent 1", 1000.0);
		List<ContClient> conturiCapitalPermanent = new ArrayList<ContClient>();
		conturiCapitalPermanent.add(capitalPermanent1);
		// Pasiv total

		ContClient pasivTotal1 = new ContClient(800L, "Pasiv Total 1", 1000.0);
		List<ContClient> conturiPasivTotal = new ArrayList<ContClient>();
		conturiPasivTotal.add(pasivTotal1);

		// Capital propriu
		ContClient capitalPropriu3 = new ContClient(810L, "Capital propriu 3", 1000.0);
		List<ContClient> conturiCapitalPropriuAutonomie = new ArrayList<ContClient>();
		conturiCapitalPropriuAutonomie.add(capitalPropriu3);
		// Pasiv total
		ContClient pasivTotal2 = new ContClient(820L, "Pasiv total 2", 1000.0);
		conturiPasivTotal.add(pasivTotal2);

		// Capital propriu
		ContClient capitalPropriu4 = new ContClient(830L, "Capital propriu 4", 1000.0);
		conturiCapitalPropriuAutonomie.add(capitalPropriu4);
		// Capital permanent
		ContClient capitalPermanent2 = new ContClient(840L, "Capital Permanent 2", 1000.0);
		conturiCapitalPermanent.add(capitalPermanent2);

		// Capital propriu
		ContClient capitalPropriu5 = new ContClient(850L, "Capital propriu 5", 1000.0);
		conturiCapitalPropriuAutonomie.add(capitalPropriu5);
		// Datorii pe termen lung
		ContClient datoriiPeTermenLung1 = new ContClient(860L, "Datorii pe termen lung 3", 1000.0);
		List<ContClient> conturiDatoriiPeTermenLungAutonomie = new ArrayList<ContClient>();
		conturiDatoriiPeTermenLungAutonomie.add(datoriiPeTermenLung1);

		// Datorii pe termen lung
		ContClient datoriiPeTermenLung2 = new ContClient(870L, "Datorii pe termen lung 3", 1000.0);
		conturiDatoriiPeTermenLungAutonomie.add(datoriiPeTermenLung2);
		// Pasiv total
		ContClient pasivTotal3 = new ContClient(880L, "Pasiv total 3", 1000.0);
		conturiPasivTotal.add(pasivTotal3);

		// Datorii totale
		ContClient datoriiTotale1 = new ContClient(890L, "Datorii totale 1", 1000.0);
		List<ContClient> conturiDatoriiTotaleAutonomie = new ArrayList<ContClient>();
		conturiDatoriiTotaleAutonomie.add(datoriiTotale1);
		// Pasiv total
		ContClient pasivTotal4 = new ContClient(900L, "Pasiv total 4", 1000.0);
		conturiPasivTotal.add(pasivTotal4);

		IndicatorFinanciar autonomie = new IndicatorFinanciar(1002L, "Autonomie Financiara",
				conturiDatoriiTotaleAutonomie, null, conturiCapitalPropriuAutonomie, conturiCapitalPermanent,
				conturiDatoriiTotaleAutonomie, conturiDatoriiPeTermenLungAutonomie);

		// TEST Lichiditate

		// ACTIVE CIRCULANTE
		ContClient activeCirculante = new ContClient(710L, "Active Circulante", 2000.0);
		List<ContClient> conturiActiveCirculante = new ArrayList<ContClient>();
		conturiActiveCirculante.add(activeCirculante);

		ContClient activeCirculante2 = new ContClient(720L, "Active Circulante", 2000.0);
		conturiActiveCirculante.add(activeCirculante2);

		// DATORII CURENTE
		ContClient datoriiCurente1 = new ContClient(810L, "Datorii Curente1", 1000.0);
		List<ContClient> conturiDatoriiCurente = new ArrayList<ContClient>();
		conturiDatoriiCurente.add(datoriiCurente1);

		ContClient datoriiCurente2 = new ContClient(820L, "Datorii Curente2", 1000.0);
		conturiDatoriiCurente.add(datoriiCurente2);

		ContClient datoriiCurente3 = new ContClient(830L, "Datorii Curente3", 1000.0);
		conturiDatoriiCurente.add(datoriiCurente3);

		ContClient datoriiCurente4 = new ContClient(840L, "Datorii Curente4", 1000.0);
		conturiDatoriiCurente.add(datoriiCurente4);

		// Stocuri
		ContClient stocuri = new ContClient(900L, "Stocuri", 500.0);
		List<ContClient> conturiStocuri = new ArrayList<ContClient>();
		conturiStocuri.add(stocuri);

		// Investitii financiare pe termen scurt
		ContClient investitiiFinanciare = new ContClient(1000L, "Investitii financare pe termen scurt", 500.0);
		List<ContClient> conturiInvestitiiFinanciarePeTermenScurt = new ArrayList<ContClient>();
		conturiInvestitiiFinanciarePeTermenScurt.add(investitiiFinanciare);

		// Creante
		ContClient creante1 = new ContClient(1100L, "Creante", 400.0);
		List<ContClient> creante = new ArrayList<ContClient>();
		creante.add(creante1);

		// DisponibilitatiBanesti
		ContClient disponibilitatiBanesti = new ContClient(2000L, "Disponibilitati Banesti", 400.0);
		List<ContClient> conturiDisponibilitatiBanesti = new ArrayList<ContClient>();
		conturiDisponibilitatiBanesti.add(disponibilitatiBanesti);

		// DisponibilitatiBanesti
		ContClient disponibilitatiBanestiDinCasierie = new ContClient(3000L, "Disponibilitati din casierie", 300.0);
		List<ContClient> conturiDisponibilitatiBanestiDinCasierie = new ArrayList<ContClient>();
		conturiDisponibilitatiBanestiDinCasierie.add(disponibilitatiBanestiDinCasierie);

		// Conturi Bancare Lichiditate
		ContClient conturiBancare1 = new ContClient(4000L, "Conturi Bancare", 400.0);
		List<ContClient> conturiBancare = new ArrayList<ContClient>();
		conturiBancare.add(conturiBancare1);

		// Credite Bancare pe Ter Scurt
		ContClient crediteBancarePeTermenScurt = new ContClient(5000L, "Credite Bancare pe Termen Scurt", 400.0);
		List<ContClient> conturiCrediteBancarePeTermenScurt = new ArrayList<ContClient>();
		conturiCrediteBancarePeTermenScurt.add(crediteBancarePeTermenScurt);

		IndicatorFinanciar test = new IndicatorFinanciar(1003L, "Autonomie Financiara si Solvabilitate si Lichidate",
				conturiActiveCirculante, conturiDatoriiCurente, conturiStocuri,
				conturiInvestitiiFinanciarePeTermenScurt, creante, conturiDisponibilitatiBanestiDinCasierie,
				conturiBancare, conturiCrediteBancarePeTermenScurt, conturiTotalDatorii, conturiTotalActiv,
				conturiCapitalPropriu, conturiTotalCapitaluri, rateScadenteRambursare, dobanziRate, cashFlow,
				conturiCapitalPermanent, conturiDatoriiTotaleAutonomie, conturiDatoriiPeTermenLungAutonomie);

		kSession.insert(test);
		kSession.fireAllRules();

	}

}
