package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Dipendente;
import model.Dirigente;
import model.Manager;

public class View {
	
	Scanner tastiera=new Scanner(System.in);
	int n;
	int n1;
	double n2;
	
	
	public void stampa(ArrayList<Dipendente> a)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) instanceof Dirigente)
			{
				Dirigente other=(Dirigente)a.get(i);
				
				System.out.println("\nDirigente");
				System.out.println();
				System.out.println("ID: "+other.getId());
				System.out.println("Nome: "+other.getNome());
				System.out.println("Cognome: "+other.getCognome());
				System.out.println("Età: "+other.getEta());
				System.out.println("Ruolo aziendale: "+other.getRuoloAziendale());
				System.out.println("Titolo di studio: "+other.getTitoloDiStudio());
				System.out.println("Stipendio: "+other.getStipendio());
				System.out.println("Area di responsabilità: "+other.getAreaDiResponsabilita());
				System.out.println("Livello funzionale: "+other.getLivelloFunzionale());
			}
			else if(a.get(i) instanceof Manager)
			{
				Manager other=(Manager)a.get(i);
				
				System.out.println("\nManager");
				System.out.println();
				System.out.println("ID: "+other.getId());
				System.out.println("Nome: "+other.getNome());
				System.out.println("Cognome: "+other.getCognome());
				System.out.println("Età: "+other.getEta());
				System.out.println("Ruolo aziendale: "+other.getRuoloAziendale());
				System.out.println("Titolo di studio: "+other.getTitoloDiStudio());
				System.out.println("Stipendio: "+other.getStipendio());
				System.out.println("Area di responsabilità: "+other.getAreaDiResponsabilita());
			}
			
			else
			{
				System.out.println("\nDipendente");
				System.out.println();
				System.out.println("ID: "+a.get(i).getId());
				System.out.println("Nome: "+a.get(i).getNome());
				System.out.println("Cognome: "+a.get(i).getCognome());
				System.out.println("Età: "+a.get(i).getEta());
				System.out.println("Ruolo aziendale: "+a.get(i).getRuoloAziendale());
				System.out.println("Titolo di studio: "+a.get(i).getTitoloDiStudio());
			}
		}
	}
	
	
	public void mascheraDiInserimento(Dipendente d, int id)
	{
		if(d instanceof Dirigente)
		{
			Dirigente other=(Dirigente)d;

			System.out.println("\nDIRIGENTE");
			System.out.println();
			
			other.setId(id);
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
			
			System.out.println("\nMANAGER");
			System.out.println();
			
			other.setId(id);
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
			System.out.println("\nDIPENDENTE");
			System.out.println();
			
			d.setId(id);
			d.setNome(leggiStringa("Nome dipendente: "));
			d.setCognome(leggiStringa("Cognome dipendente: "));
			d.setEta(leggiIntero("Età dipendente: "));
			d.setRuoloAziendale(leggiStringa("Ruolo aziendale dipendente: "));
			d.setTitoloDiStudio(leggiStringa("Titolo di studio dipendente: "));
			d.setStipendio(leggiDouble("Stipendio dipendente: "));
		}
	}
	
	
	
	public Dipendente mascheraDiModifica(ArrayList<Dipendente> a, int i)
	{
		if(a.get(i) instanceof Dirigente)
		{
			Dirigente other=(Dirigente)a.get(i);
			
			System.out.println("\nDIRIGENTE");
			System.out.println();
			
			String nome=leggiStringa("Nome ["+other.getNome()+"]: ");
			if(!nome.equals(""))
				other.setNome(nome);
			
			String cognome=leggiStringa("Cognome ["+other.getCognome()+"]:");
			if(!cognome.equals(""))
				other.setCognome(cognome);
		
			int eta=leggiInteroSpecial("Età ["+other.getEta()+"]: ");
			if(eta!=0)
				other.setEta(eta);
		
			String titoloDiStudio=leggiStringa("Titolo di studio ["+other.getTitoloDiStudio()+"]: ");
			if(!titoloDiStudio.equals(""))
				other.setTitoloDiStudio(titoloDiStudio);
		
			String ruoloAziendale=leggiStringa("Ruolo aziendale ["+other.getRuoloAziendale()+"]: ");
			if(!ruoloAziendale.equals(""))
				other.setRuoloAziendale(ruoloAziendale);
			
			double stipendio=leggiDoubleSpecial("Stipendio ["+other.getStipendio()+"]: ");
			if(stipendio!=0)
				other.setStipendio(stipendio);
			
			String areaDiResponsabilita=leggiStringa("Area di responsabilità ["+other.getAreaDiResponsabilita()+"]: ");
			if(!areaDiResponsabilita.equals(""))
				other.setAreaDiResponsabilità(areaDiResponsabilita);
			
			String livelloFunzionale=leggiStringa("Livello funzionale ["+other.getLivelloFunzionale()+"]: ");
			if(!livelloFunzionale.equals(""))
				other.setLivelloFunzionale(livelloFunzionale);
			
			a.set(i, other);
		}
		
		else if(a.get(i) instanceof Manager)
		{
			Manager other=(Manager)a.get(i);
			
			System.out.println("\nMANAGER");
			System.out.println();

			String nome=leggiStringa("Nome ["+other.getNome()+"]: ");
			if(!nome.equals(""))
				other.setNome(nome);
			
			String cognome=leggiStringa("Cognome ["+other.getCognome()+"]:");
			if(!cognome.equals(""))
				other.setCognome(cognome);
		
			int eta=leggiInteroSpecial("Età ["+other.getEta()+"]: ");
			if(eta!=0)
				other.setEta(eta);
		
			String titoloDiStudio=leggiStringa("Titolo di studio ["+other.getTitoloDiStudio()+"]: ");
			if(!titoloDiStudio.equals(""))
				other.setTitoloDiStudio(titoloDiStudio);
		
			String ruoloAziendale=leggiStringa("Ruolo aziendale ["+other.getRuoloAziendale()+"]: ");
			if(!ruoloAziendale.equals(""))
				other.setRuoloAziendale(ruoloAziendale);
			
			double stipendio=leggiDoubleSpecial("Stipendio ["+other.getStipendio()+"]: ");
			if(stipendio!=0)
				other.setStipendio(stipendio);
			
			String areaDiResponsabilita=leggiStringa("Area di responsabilità ["+other.getAreaDiResponsabilita()+"]: ");
			if(!areaDiResponsabilita.equals(""))
				other.setAreaDiResponsabilità(areaDiResponsabilita);
			
			a.set(i, other);
		}
		
		else
		{
			String nome=leggiStringa("Nome ["+a.get(i).getNome()+"]: ");
			if(!nome.equals(""))
				a.get(i).setNome(nome);
			
			String cognome=leggiStringa("Cognome ["+a.get(i).getCognome()+"]:");
			if(!cognome.equals(""))
				a.get(i).setCognome(cognome);
		
			int eta=leggiInteroSpecial("Età ["+a.get(i).getEta()+"]: ");
			if(eta!=0)
				a.get(i).setEta(eta);
		
			String titoloDiStudio=leggiStringa("Titolo di studio ["+a.get(i).getTitoloDiStudio()+"]: ");
			if(!titoloDiStudio.equals(""))
				a.get(i).setTitoloDiStudio(titoloDiStudio);
		
			String ruoloAziendale=leggiStringa("Ruolo aziendale ["+a.get(i).getRuoloAziendale()+"]: ");
			if(!ruoloAziendale.equals(""))
				a.get(i).setRuoloAziendale(ruoloAziendale);
			
			double stipendio=leggiDoubleSpecial("Stipendio ["+a.get(i).getStipendio()+"]: ");
			if(stipendio!=0)
				a.get(i).setStipendio(stipendio);
	}
		
		return a.get(i);
	}
	
	public int trova(ArrayList<Dipendente> a)
	{
		boolean flag= false;
		int index=0;
		
		for (int i=0;i<a.size();i++)
		{
				if(a.get(i) instanceof Dirigente)
				{
					Dirigente other=(Dirigente)a.get(i);
					
					System.out.println("\nDirigente");
					System.out.println();
					System.out.println("ID: "+other.getId());
					System.out.println("Nome: "+other.getNome());
					System.out.println("Cognome: "+other.getCognome());
					System.out.println("Età: "+other.getEta());
					System.out.println("Ruolo aziendale: "+other.getRuoloAziendale());
					System.out.println("Titolo di studio: "+other.getTitoloDiStudio());
					System.out.println("Stipendio: "+other.getStipendio());
					System.out.println("Area di responsabilità: "+other.getAreaDiResponsabilita());
					System.out.println("Livello funzionale: "+other.getLivelloFunzionale());
				}
				else if(a.get(i) instanceof Manager)
				{
					Manager other=(Manager)a.get(i);
					
					System.out.println("\nManager");
					System.out.println();
					System.out.println("ID: "+other.getId());
					System.out.println("Nome: "+other.getNome());
					System.out.println("Cognome: "+other.getCognome());
					System.out.println("Età: "+other.getEta());
					System.out.println("Ruolo aziendale: "+other.getRuoloAziendale());
					System.out.println("Titolo di studio: "+other.getTitoloDiStudio());
					System.out.println("Stipendio: "+other.getStipendio());
					System.out.println("Area di responsabilità: "+other.getAreaDiResponsabilita());
				}
				
				else
				{
					System.out.println("\nDipendente");
					System.out.println();
					System.out.println("ID: "+a.get(i).getId());
					System.out.println("Nome: "+a.get(i).getNome());
					System.out.println("Cognome: "+a.get(i).getCognome());
					System.out.println("Età: "+a.get(i).getEta());
					System.out.println("Ruolo aziendale: "+a.get(i).getRuoloAziendale());
					System.out.println("Titolo di studio: "+a.get(i).getTitoloDiStudio());
					System.out.println("Stipendio: "+a.get(i).getStipendio());
				}
		}
		
		int ID=leggiIntero("\nInserire ID della persona da cancellare/modificare: ");
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getId()==ID)
			{
				index=i;
				flag=true;
			}
		}
		
		if(!flag)
		{
			System.out.println("\nL'elemento non è stato trovato :( ");
			return -1;
		}
		
		else
			return index;
			
	}
	
	public int nextId(ArrayList<Dipendente> a)
	{
		int maxIndex=0;
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getId()>maxIndex)
				maxIndex=a.get(i).getId();
		}
		
		++maxIndex;
		
		return maxIndex;
	}
	
	
	public int menuIniziale()
	{
		System.out.println("1) Inserisci");
		System.out.println("2) Modifica");
		System.out.println("3) Cancella");
		System.out.println("4) Stampa");
		System.out.println("5) Esci");
		
		int scelta=leggiIntero("\nInserire scelta: ");
		
		return scelta;
	}
	
	public int menuInserimento()
	{
		System.out.println("1) Inserisci dipendente");
		System.out.println("2) Inserisci manager");
		System.out.println("3) Inserisci dirigente");
		
		int scelta=leggiIntero("\nInserire scelta: ");
		
		return scelta;
	}
	
	public int menuModifica()
	{		
		int scelta=leggiIntero("\nDigitare ID dell'elemento da modificare: ");
		
		return scelta;
	}
	
	public void warning()
	{
		System.out.println("\nAttenzione! Inserire almeno un elemento!");
	}
	
	public void idNonTrovato()
	{
		System.out.println("ID non trovato!");
	}
	
	public void arrivederci()
	{
		System.out.println("Arrivederci e grazie!");
	}
	
// -------------------------------------------------
	
	public String leggiStringa(String s1)
	{		
		boolean flag;
	    String s=null;
		
	    do {
		System.out.print(s1);
		s=null;
		flag=false;
		try {
			flag=false;
			s=tastiera.nextLine();			
		} catch (Exception e) {
			flag=true;
			System.out.println("Inserire almeno un carattere");
		}
		}while(flag);
		
		return s;
	}
	
	
	public int leggiIntero(String s1)
	{
		boolean flag=false;
		do {
			flag=false;
		System.out.print(s1);
		
		try {
			n1=Integer.parseInt(tastiera.nextLine());
			
		} catch (NumberFormatException e) 
		{
			flag=true;
			System.out.println("\nInserire valore numerico!");
		}
		}while(flag);
		return n1;
	}
	
	
	public double leggiDouble(String s1)
	{
		boolean flag=false;
		do {
			flag=false;
		System.out.print(s1);
		
		try {
			n2=Double.parseDouble(tastiera.nextLine());
			
		} catch (NumberFormatException e) 
		{
			System.out.println("\nInserire valore numerico!");
			flag=true;
		}
	}while(flag);
		return n2;
	}
	
	
	public int leggiInteroSpecial(String s1)
	{
		System.out.print(s1);
		
		try {
			
			n=Integer.parseInt(tastiera.nextLine());
		
		} catch (NumberFormatException e) {
			
			n=0;
			
		}
		
		return n;
	}
	
	public double leggiDoubleSpecial(String s1)
	{
		System.out.print(s1);
		
		try {
			
			n2=Double.parseDouble(tastiera.nextLine());
		
		} catch (NumberFormatException e) {
			
			n2=0;
			
		}
		
		return n2;
	}
	
}