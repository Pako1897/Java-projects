package view;



import java.util.*;

import model.Dipendente;
import model.Dirigente;
import model.Manager;

public class View {
	
	Scanner tastiera=new Scanner(System.in);
	int x;
	
	public void stampa(ArrayList<Dipendente> a)
	{
		for(int i=0;i<a.size();i++) 
		{	
			System.out.println(a.get(i));
		}
	}
	
	public void stampaSchede(ArrayList<Dipendente> a)
	{
		for(int i=0;i<a.size();i++) 
		{		
			x=i+1;
			System.out.println("Posizione "+x);
			System.out.println();
			if(a.get(i) instanceof Dirigente)
			{
				Dirigente other=(Dirigente)a.get(i) ;

				System.out.println("DIRIGENTE");
				System.out.println();
				
				System.out.println("ID DIRIGENTE: "+other.getId());
				System.out.println("Nome DIRIGENTE: "+other.getNome());
				System.out.println("Cognome DIRIGENTE: "+other.getCognome());
				System.out.println("Età DIRIGENTE: "+other.getEta());
				System.out.println("Ruolo aziendale DIRIGENTE:"+other.getRuoloAziendale());
				System.out.println("Titolo di studio DIRIGENTE: "+other.getTitoloDiStudio());
				System.out.println("Stipendio DIRIGENTE: "+other.getStipendio());
				System.out.println("Area di responsabilità DIRIGENTE: "+other.getAreaDiResponsabilita());
				System.out.println("Livelo funzionale DIRIGENTE: "+other.getLivelloFunzionale());
				
			}
			
			else if(a.get(i) instanceof Manager)
			{
				Manager other=(Manager)a.get(i);
				
				System.out.println("MANAGER");
				System.out.println();
				
				System.out.println("ID MANAGER: "+other.getId());
				System.out.println("Nome MANAGER: "+other.getNome());
				System.out.println("Cognome MANAGER: "+other.getCognome());
				System.out.println("Età MANAGER: "+other.getEta());
				System.out.println("Ruolo aziendale MANAGER:"+other.getRuoloAziendale());
				System.out.println("Titolo di studio MANAGER: "+other.getTitoloDiStudio());
				System.out.println("Stipendio MANAGER: "+other.getStipendio());
				System.out.println("Area di responsabilità MANAGER: "+other.getAreaDiResponsabilita());
			}
			
			else 
			{
				System.out.println("DIPENDENTE");
				System.out.println();
				
				System.out.println("ID DIPENDENTE: "+a.get(i).getId());
				System.out.println("Nome DIPENDENTE: "+a.get(i).getNome());
				System.out.println("Cognome DIPENDENTE: "+a.get(i).getCognome());
				System.out.println("Età DIPENDENTE: "+a.get(i).getEta());
				System.out.println("Ruolo aziendale DIPENDENTE:"+a.get(i).getRuoloAziendale());
				System.out.println("Titolo di studio DIPENDENTE: "+a.get(i).getTitoloDiStudio());
				System.out.println("Stipendio DIPENDENTE: "+a.get(i).getStipendio());
			}
		}
	}
	
	public void mascheraDiInserimento(Dipendente d)
	{
		if(d instanceof Dirigente)
		{
			Dirigente other=(Dirigente)d;

			System.out.println("DIRIGENTE");
			System.out.println();
			
			other.setId(leggiIntero("ID dirigente: "));
			other.setNome(leggiStringa("Nome dirigente: "));
			other.setCognome(leggiStringa("Cognome dirigente: "));
			other.setEta(leggiIntero("Età dipendente: "));
			other.setRuoloAziendale(leggiStringa("Ruolo aziendale dirigente: "));
			other.setTitoloDiStudio(leggiStringa("Titolo di studio dirigente: "));
			other.setStipendio(leggiDouble("Stipendio dirigente: "));
			other.setAreaDiResponsabilità(leggiStringa("Area di responsabilità dirigente: "));
			other.setLivelloFunzionale(leggiStringa("Livello funzionale dirigente: "));
			
		}
		
		else if(d instanceof Manager)
		{
			Manager other=(Manager)d;
			
			System.out.println("MANAGER");
			System.out.println();
			
			other.setId(leggiIntero("ID Manager: "));
			other.setNome(leggiStringa("Nome Manager: "));
			other.setCognome(leggiStringa("Cognome Manager: "));
			other.setEta(leggiIntero("Età dipendente: "));
			other.setRuoloAziendale(leggiStringa("Ruolo aziendale manager: "));
			other.setTitoloDiStudio(leggiStringa("Titolo di studio manager: "));
			other.setStipendio(leggiDouble("Stipendio manager: "));
			other.setAreaDiResponsabilità(leggiStringa("Area di responsabilità: "));
		}
		
		else 
		{
			System.out.println("DIPENDENTE");
			System.out.println();
			
			d.setId(leggiIntero("ID dipendente: "));
			d.setNome(leggiStringa("Nome dipendente: "));
			d.setCognome(leggiStringa("Cognome dipendente: "));
			d.setEta(leggiIntero("Età dipendente: "));
			d.setRuoloAziendale(leggiStringa("Ruolo aziendale dipendente: "));
			d.setTitoloDiStudio(leggiStringa("Titolo di studio dipendente: "));
			d.setStipendio(leggiDouble("Stipendio dipendente: "));
		}
	}
	
	public int stampaMenu()
	{
		System.out.println("1)Aggiungi dipendente");
		System.out.println("2)Aggiungi Manager");
		System.out.println("3)Aggiungi Dirigente");
		
		int scelta=leggiIntero("Inserire scelta: ");		
		
		return scelta;
	}
	
	
	
	public int leggiIntero(String s1)
	{
		System.out.println(s1);
		return Integer.parseInt(tastiera.nextLine());
	}

	public double leggiDouble(String s1)
	{
		System.out.println(s1);
		return Double.parseDouble(tastiera.nextLine());
	}
	
	public String leggiStringa(String s1)
	{
		System.out.println(s1);
		return tastiera.nextLine();
	}


}
