package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import main.java.VitezaDeRotatieActivelor.CoeficientDeRotatii;

public class TestVitezaDeRotatie {

	public static void main(String[] args) {
		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContClientainer = ks.getKieClasspathContainer();
		KieSession kSession = kContClientainer.newKieSession("ksession-rules");

		// TEST Viteza de rotatie a activelor

		// Cifra de afaceri
		ContClient cifraDeAfaceri1 = new ContClient(3000L, "Cifra de afaceri", 8.0);
		List<ContClient> conturiCifraDeAfaceri = new ArrayList<ContClient>();
		conturiCifraDeAfaceri.add(cifraDeAfaceri1);
				
		ContClient cifraDeAfaceri2 = new ContClient(3001L, "Cifra de afaceri", 9.0);
		conturiCifraDeAfaceri.add(cifraDeAfaceri2);
				
		// Capitaluri circulante
		ContClient capitaluriCirculante1 = new ContClient(3002L, "Datorii Curente1", 3.0);
		List<ContClient> conturiCapitaluriCirculante = new ArrayList<ContClient>();
		conturiCapitaluriCirculante.add(capitaluriCirculante1);
				
		ContClient capitaluriCirculante2 = new ContClient(3003L, "Datorii Curente2", 4.0);
		conturiCapitaluriCirculante.add(capitaluriCirculante2);
				
		ContClient capitaluriCirculante3 = new ContClient(3004L, "Datorii Curente3", 2.0);
		conturiCapitaluriCirculante.add(capitaluriCirculante3);
				
		ContClient capitaluriCirculante4 = new ContClient(3005L, "Datorii Curente4", 1.0);
		conturiCapitaluriCirculante.add(capitaluriCirculante4);
		
		// Stocuri globale medii
		ContClient stocuriGlobaleMedii1 = new ContClient(3006L, "Stoc global mediu 1", 7.0);
		List<ContClient> conturiStocGlobalMediu = new ArrayList<ContClient>();
		conturiStocGlobalMediu.add(stocuriGlobaleMedii1);
				
		ContClient stocuriGlobaleMedii2 = new ContClient(3007L, "Stoc global mediu 2", 9.0);
		conturiStocGlobalMediu.add(stocuriGlobaleMedii2);

		IndicatorFinanciar vitezaDeRotatie= new IndicatorFinanciar(4001L, "Viteza de rotatie a activelor",
				conturiCifraDeAfaceri,
				conturiCapitaluriCirculante,
				conturiStocGlobalMediu);
		
		CoeficientDeRotatii coef = new CoeficientDeRotatii(vitezaDeRotatie);
		double numarDeRotatii = coef.formulaCalcul();
		vitezaDeRotatie.setNumarDeRotatii(numarDeRotatii);

		kSession.insert(vitezaDeRotatie);
		kSession.fireAllRules();

	}

}
