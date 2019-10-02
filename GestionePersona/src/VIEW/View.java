package VIEW;

import MODEL.Persona;
import java.util.*;

public class View {
	
	Scanner tastiera=new Scanner(System.in);
	
	
	public String leggiStringa(String s1)
	{
		System.out.println(s1);
		return tastiera.nextLine();
	}

	
	public int leggiIntero(String s1)
	{
		boolean flag;
		int n=0;

		do {
		flag=false;
		System.out.println(s1);
		
		try 
		{	
			n=Integer.parseInt(tastiera.nextLine());	
		}
		catch(NumberFormatException e)
		{
			System.out.println("ERRORE! Inserisci solo dei numeri!");
			flag=true;
		}
		
		}while(flag);
		
		return n;
	}

	
	public void stampaPersona(Persona p)
	{
		System.out.println("Nome: "+p.getNome()+", Cognome: "+p.getCognome()+", età: "+p.getEta());
	}
	
}
