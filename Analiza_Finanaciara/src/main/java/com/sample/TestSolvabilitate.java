package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestSolvabilitate {

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
		
		kSession.insert(solvabilitate);
		kSession.fireAllRules();
	}
}
