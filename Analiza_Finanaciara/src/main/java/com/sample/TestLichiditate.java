package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestLichiditate {
	public static void main(String[] args) {

		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContClientainer = ks.getKieClasspathContainer();
		KieSession kSession = kContClientainer.newKieSession("ksession-rules");

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
		
		//Stocuri
		ContClient stocuri = new ContClient(900L, "Stocuri", 500.0);
		List<ContClient> conturiStocuri = new ArrayList<ContClient>();
		conturiStocuri.add(stocuri);

		//Investitii financiare pe termen scurt
		ContClient investitiiFinanciare = new ContClient(1000L, "Investitii financare pe termen scurt", 500.0);
		List<ContClient> conturiInvestitiiFinanciarePeTermenScurt = new ArrayList<ContClient>();
		conturiInvestitiiFinanciarePeTermenScurt.add(investitiiFinanciare);
	
		//Creante
		ContClient creante1 = new ContClient(1100L, "Creante", 400.0);
		List<ContClient> creante = new ArrayList<ContClient>();
		creante.add(creante1);
	
		//DisponibilitatiBanesti
		ContClient disponibilitatiBanesti = new ContClient(2000L, "Disponibilitati Banesti", 400.0);
		List<ContClient> conturiDisponibilitatiBanesti = new ArrayList<ContClient>();
		conturiDisponibilitatiBanesti.add(disponibilitatiBanesti);
		
		
		//DisponibilitatiBanesti
		ContClient disponibilitatiBanestiDinCasierie = new ContClient(3000L, "Disponibilitati din casierie", 300.0);
		List<ContClient> conturiDisponibilitatiBanestiDinCasierie = new ArrayList<ContClient>();
		conturiDisponibilitatiBanestiDinCasierie.add(disponibilitatiBanestiDinCasierie);
		
		//Conturi Bancare Lichiditate
		ContClient conturiBancare1 = new ContClient(4000L, "Conturi Bancare", 400.0);
		List<ContClient> conturiBancare = new ArrayList<ContClient>();
		conturiBancare.add(conturiBancare1);	
		
		//Credite Bancare pe Ter Scurt
		ContClient crediteBancarePeTermenScurt = new ContClient(5000L, "Credite Bancare pe Termen Scurt", 400.0);
		List<ContClient> conturiCrediteBancarePeTermenScurt = new ArrayList<ContClient>();
		conturiCrediteBancarePeTermenScurt.add(crediteBancarePeTermenScurt);	
				

		IndicatorFinanciar lichiditate= new IndicatorFinanciar(1003L, "Lichiditate",
				conturiActiveCirculante,
				conturiDatoriiCurente,
				conturiStocuri,
				conturiInvestitiiFinanciarePeTermenScurt,
				creante,
				conturiDisponibilitatiBanestiDinCasierie,
				conturiBancare,
				conturiCrediteBancarePeTermenScurt);

		kSession.insert(lichiditate);
		kSession.fireAllRules();
	}


}
