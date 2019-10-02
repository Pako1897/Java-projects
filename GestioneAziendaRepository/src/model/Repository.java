package model;

import java.util.ArrayList;

public class Repository {
	
//Dichiarazione ArrayList
	private ArrayList<Dipendente> a;
	
//Dichiarazione istanza
	private static Repository instance;
	
//Controllo dell'esistenza dell'istanza
	public static Repository getInstance()
	{
		if(instance==null)
		{
			//Eventuale creazione istanza
			instance=new Repository();
		}
		
		return instance;
	}
	
//Aggiunta dipendente
	public void setDipendente(Dipendente d)
	{
		a.add(d);
	}
	
//Stampa dipendente
	public Dipendente getDipendente(int i)
	{
		return a.get(i);
	}
	
//ArrayList
	public ArrayList<Dipendente> getDipendenti()
	{
		return a;
	}
	
//Costruttore
	private Repository()
	{	
		a=new ArrayList<Dipendente>();
	}
}