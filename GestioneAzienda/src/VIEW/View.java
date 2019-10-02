package VIEW;

import java.util.*;

import MODEL.Dipendente;
import MODEL.Direttore;
import MODEL.Manager;
import MODEL.Persona;

public class View {

	Scanner tastiera=new Scanner(System.in);
	int n;
	double n1;
	int sceltaModifica;
	
	public void mascheraDiInserimento(Persona p)
	{
		p.setId(leggiIntero("ID: "));
		p.setFirstName(leggiStringa("Nome: "));
		p.setLastName(leggiStringa("Cognome: "));
		p.setAge(leggiIntero("Età: "));
		
		if(p instanceof Direttore)
		{
			Direttore other=(Direttore)p;

			other.setRuoloAziendale(leggiStringa("Ruolo aziendale del direttore: "));
			other.setTitoloDiStudio(leggiStringa("Titolo di studio del direttore: "));
			other.setStipendio(leggiDouble("Stipendio del direttore: "));
			other.setAreaDiResponsabilita(leggiStringa("Area di responsabilità del direttore: "));
			other.setLivelloFunzionale(leggiStringa("Livello funzionale del direttore: "));
		}
		
		else if(p instanceof Manager)
		{
			Manager other=(Manager)p;
			
			other.setRuoloAziendale(leggiStringa("Inserire ruolo aziendale del manager: "));
			other.setTitoloDiStudio(leggiStringa("Inserire titolo di studio del manager: "));
			other.setStipendio(leggiDouble("Inserire stipendio del manager: "));
			other.setAreaDiResponsabilita(leggiStringa("Inserire area di responsabilità del manager: "));
		}
		
		else if(p instanceof Dipendente)
		{
			Dipendente other=(Dipendente)p;
			
			other.setRuoloAziendale(leggiStringa("Inserire ruolo aziendale del dipendente: "));
			other.setTitoloDiStudio(leggiStringa("Inserire titolo di studio del dipendente: "));
			other.setStipendio(leggiIntero("Inserire stipendio del dipendente: "));
		}
	}

//STAMPA		
	public void print(Persona p)
	{
		System.out.println(p.toString());

	}
	
	
//MODIFYCA
	public void modifica(Persona p)
	{
		
		if(p instanceof Direttore)
		{
  			Direttore other=(Direttore)p;
  			
  			int id=leggiInteroSpecial("ID ["+other.getId()+"]: ");
  			if(id!=-1)
  				other.setId(id);
  			
  			String nome=leggiStringa("Nome ["+other.getFirstName()+"]: ");
  			if(!nome.isEmpty())
  				other.setFirstName(nome);
  			
  			String cognome=leggiStringa("Cognome ["+other.getLastName()+"]: ");
  			if(!cognome.isEmpty())
  				other.setLastName(cognome);
  			
  			int eta=leggiInteroSpecial("Età ["+other.getAge()+"]: ");
  			if(eta!=-1)
  				other.setAge(eta);
  			
  			String ruoloAziendale=leggiStringa("Ruolo aziendale ["+other.getRuoloAziendale()+"]: ");
  			if(!ruoloAziendale.isEmpty())
  				other.setRuoloAziendale(ruoloAziendale);
  			  			
  			String titoloDiStudio=leggiStringa("Titolo di studio ["+other.getTitoloDiStudio()+"]: ");
  			if(!titoloDiStudio.isEmpty())
  				other.setTitoloDiStudio(titoloDiStudio);
  		  			
  			double stipendio=leggiDoubleSpecial("Stipendio ["+other.getStipendio()+"]: ");
  			if(stipendio!=-1)
  				other.setStipendio(stipendio);
  			 			
  			String areaDiResponsabilita=leggiStringa("Area di responsabilità ["+other.getAreaDiResponsabilita()+"]: ");
  			if(!areaDiResponsabilita.isEmpty())
  				other.setAreaDiResponsabilita(areaDiResponsabilita);
  				
  			String livelloFunzionale=leggiStringa("Livello funzionale ["+other.getLivelloFunzionale()+"]: ");
  			if(!livelloFunzionale.isEmpty())
  				other.setLivelloFunzionale(livelloFunzionale);
		}
		
		else if(p instanceof Manager)
		{
			Manager other=(Manager)p;
			
  			int id=leggiInteroSpecial("ID ["+other.getId()+"]: ");
  			if(id!=-1)
  				other.setId(id);
  			
  			String nome=leggiStringa("Nome ["+other.getFirstName()+"]: ");
  			if(!nome.isEmpty())
  				other.setFirstName(nome);
  			
  			String cognome=leggiStringa("Cognome ["+other.getLastName()+"]: ");
  			if(!cognome.isEmpty())
  				other.setLastName(cognome);
  			
  			int eta=leggiInteroSpecial("Età ["+other.getAge()+"]: ");
  			if(eta!=-1)
  				other.setAge(eta);
  			
  			String ruoloAziendale=leggiStringa("Ruolo aziendale ["+other.getRuoloAziendale()+"]: ");
  			if(!ruoloAziendale.isEmpty())
  				other.setRuoloAziendale(ruoloAziendale);
  			  			
  			String titoloDiStudio=leggiStringa("Titolo di studio ["+other.getTitoloDiStudio()+"]: ");
  			if(!titoloDiStudio.isEmpty())
  				other.setTitoloDiStudio(titoloDiStudio);
  		  			
  			double stipendio=leggiDoubleSpecial("Stipendio ["+other.getStipendio()+"]: ");
  			if(stipendio!=-1)
  				other.setStipendio(stipendio);
  			 			
  			String areaDiResponsabilita=leggiStringa("Area di responsabilità ["+other.getAreaDiResponsabilita()+"]: ");
  			if(!areaDiResponsabilita.isEmpty())
  				other.setAreaDiResponsabilita(areaDiResponsabilita);
		}
		
		else if(p instanceof Dipendente)
		{
			Dipendente other=(Dipendente)p;
			
  			int id=leggiInteroSpecial("ID ["+other.getId()+"]: ");
  			if(id!=-1)
  				other.setId(id);
  			
  			String nome=leggiStringa("Nome ["+other.getFirstName()+"]: ");
  			if(!nome.isEmpty())
  				other.setFirstName(nome);
  			
  			String cognome=leggiStringa("Cognome ["+other.getLastName()+"]: ");
  			if(!cognome.isEmpty())
  				other.setLastName(cognome);
  			
  			int eta=leggiInteroSpecial("Età ["+other.getAge()+"]: ");
  			if(eta!=-1)
  				other.setAge(eta);
  			
  			String ruoloAziendale=leggiStringa("Ruolo aziendale ["+other.getRuoloAziendale()+"]: ");
  			if(!ruoloAziendale.isEmpty())
  				other.setRuoloAziendale(ruoloAziendale);
  			  			
  			String titoloDiStudio=leggiStringa("Titolo di studio ["+other.getTitoloDiStudio()+"]: ");
  			if(!titoloDiStudio.isEmpty())
  				other.setTitoloDiStudio(titoloDiStudio);
  			
  			double stipendio=leggiDoubleSpecial("Stipendio ["+other.getStipendio()+"]: ");
  			if(stipendio!=-1)
  				other.setStipendio(stipendio);
		}
		
		else
		{
  			int id=leggiInteroSpecial("ID ["+p.getId()+"]: ");
  			if(id!=-1)
  				p.setId(id);
  			
  			String nome=leggiStringa("Nome ["+p.getFirstName()+"]: ");
  			if(!nome.isEmpty())
  				p.setFirstName(nome);
  			
  			String cognome=leggiStringa("Cognome ["+p.getLastName()+"]: ");
  			if(!cognome.isEmpty())
  				p.setLastName(cognome);
  			
  			int eta=leggiInteroSpecial("Età ["+p.getAge()+"]: ");
  			if(eta!=-1)
  				p.setAge(eta);
		}
	}
	
	public void delete(Persona p)
	{
		if(p instanceof Direttore)
		{
  			Direttore other=(Direttore)p;
  			
  				other.setId(0);
  				other.setFirstName(null);
  				other.setLastName(null);
  				other.setAge(0);
  				other.setRuoloAziendale(null);
  				other.setTitoloDiStudio(null);
  				other.setStipendio(0);
  				other.setAreaDiResponsabilita(null);
  				other.setLivelloFunzionale(null);
  		}
		
		else if(p instanceof Manager)
		{
			Manager other=(Manager)p;
			
				other.setId(0);
				other.setFirstName(null);
				other.setLastName(null);
				other.setAge(0);
				other.setRuoloAziendale(null);
				other.setTitoloDiStudio(null);
				other.setStipendio(0);
				other.setAreaDiResponsabilita(null);
		}
		
		if(p instanceof Dipendente)
		{
			Dipendente other=(Dipendente)p;
			
				other.setId(0);
				other.setFirstName(null);
				other.setLastName(null);
				other.setAge(0);
				other.setRuoloAziendale(null);
				other.setTitoloDiStudio(null);
				other.setStipendio(0);
		}
		
		else
		{
				p.setId(0);
				p.setFirstName(null);
				p.setLastName(null);
				p.setAge(0);

		}
	}
		
	
	
	//INPUT/OUTPUT
	
	public int leggiInteroSpecial(String s1)
	{
		System.out.println(s1);
		int n;
		try {
			n=Integer.parseInt(tastiera.nextLine());
			
		} catch (NumberFormatException e) {
			n=-1;
		}
		return n;
		
	}
	
	public double leggiDoubleSpecial(String s1)
	{
		System.out.println(s1);
		double n;
		try {
			n=Double.parseDouble(tastiera.nextLine());
			
		} catch (NumberFormatException e) {
			n=-1;
		}
		return n;
		
	}
	
	public int leggiIntero(String s1)
	
	{
		System.out.print(s1);
		
		boolean flag=false;

		do {
		try {
			flag=false;
			n=Integer.parseInt(tastiera.nextLine());
		} catch (NumberFormatException e) {	
			System.out.print("Attenzione! inserire valore numerico!");
			flag=true;
		}
		}while(flag);
		
		return n;
	}
	
	public String leggiStringa(String s1)
	{
		System.out.print(s1);
		return tastiera.nextLine();
	}
	
	public double leggiDouble(String s1)
	{
		System.out.print(s1);
		boolean flag;
		do {
			try {
				flag=false;
				n1=Double.parseDouble(tastiera.nextLine());
			} catch (NumberFormatException e) {	
				System.out.println("Attenzione! inserire valore numerico!");
				flag=true;
			}
			}while(flag);
			
			return n1;
	}
	
	
	public int stampaMenu()
	{
		System.out.println("1) Crea persona");
		System.out.println("2) Crea dipendente");
		System.out.println("3) Crea Manager");
		System.out.println("4) Crea Direttore");
		System.out.println("5) Esci");
		
		int scelta=leggiIntero("Inserire scelta: ");
		return scelta;
	}
	
	public int menuModifica()
	{
		System.out.println("1) Modifica");
		System.out.println("2) Cancella");
		System.out.println("3) Stampa");
		
		sceltaModifica=leggiIntero("Inserire scelta: ");
		
		return sceltaModifica;
		
	}
	
	public void esci()
	{
		System.out.println("Arrivederci e grazie!");
	}
}