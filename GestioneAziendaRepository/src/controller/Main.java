package controller;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import model.Repository;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		View v=new View();
		
		int scelta;
		
		Dipendente d;
		Manager m;
		Dirigente dir;
		
		Repository i=Repository.getInstance();
		
	do {
		switch(v.stampaMenu())
		{
		case 1:
			d=new Dipendente();
			v.mascheraDiInserimento(d);
			i.setDipendente(d);	
			
			break;
			
			
		case 2:
			m=new Manager();
			v.mascheraDiInserimento(m);
			i.setDipendente(m);
			
			break;
			
			
		case 3:
			dir=new Dirigente();
			v.mascheraDiInserimento(dir);
			i.setDipendente(dir);
			
			
			break;
			
			
		default:
	
			break;
		}
		
		scelta=v.leggiIntero("1- Stampa |2-aggiungi un altro elemento ");
		
	  }while(scelta==2);
	
	
	v.stampaSchede(i.getDipendenti());
	
	
	
	
	
	
	
	}
}