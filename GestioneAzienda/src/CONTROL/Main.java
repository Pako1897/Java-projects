package CONTROL;

import MODEL.Dipendente;
import MODEL.Direttore;
import MODEL.Manager;
import MODEL.Persona;
import VIEW.View;

public class Main {

	public static void main(String[] args) {

		String risp;
		boolean uscita=false;
		
		Persona p;
		Dipendente d;
		Manager m;
		Direttore dir;
		
		View v=new View();


		do {

		switch(v.stampaMenu())
		{
//CASE 1		
		case 1:
			
				p=new Persona();
				v.mascheraDiInserimento(p);
				
				do {
					
					switch(v.menuModifica())
					{
					case 1:
						v.modifica(p);
						break;
					case 2:
						v.delete(p);
						break;
					case 3:
						v.print(p);
						break;
					default:
						
						break;
					}

					risp=v.leggiStringa("Vuoi modificare/cancellare/stampare?");
					risp=risp.toLowerCase();
					
				}while(risp.equals("s")||risp.equals("si"));

		  break;
		
//CASE 2		
		case 2:
			
			d=new Dipendente();
			v.mascheraDiInserimento(d);
			
				do {
				
					switch(v.menuModifica())
					{
					case 1:
						v.modifica(d);
						break;
					case 2:
						v.delete(d);
						break;
					case 3:
						v.print(d);
						break;
					default:
				
						break;
					}
					risp=v.leggiStringa("Vuoi modificare/cancellare/stampare?");
					risp=risp.toLowerCase();
			
				}while(risp.equals("s")||risp.equals("si"));

			
		  break;
		
//CASE 3
		case 3:
			
			m=new Manager();
			v.mascheraDiInserimento(m);
			
				do {
					switch(v.menuModifica())
					{
					case 1:
						v.modifica(m);
						break;
					case 2:
						v.delete(m);
						break;
					case 3:
						v.print(m);
						break;
						
					default:
						break;
					}
					risp=v.leggiStringa("Vuoi modificare/cancellare/stampare?");
					risp=risp.toLowerCase();
			
				}while(risp.equals("s")||risp.equals("si"));
			

			
		  break;
			
//CASE 4
		case 4:
			
				
			dir=new Direttore();
			v.mascheraDiInserimento(dir);
			
				do {
					switch(v.menuModifica())
					{
					case 1:
						v.modifica(dir);
						break;
					case 2:
						v.delete(dir);
						break;
					case 3:
						v.print(dir);
						break;
				
					}
					risp=v.leggiStringa("Vuoi modificare/cancellare/stampare?");
					risp=risp.toLowerCase();
			
				}while(risp.equals("s")||risp.equals("si"));

			
	      break;
		
//CASE 5		
		case 5:
			
			uscita=true;
			v.esci();
			
		  break;
			
		default:
		  break;
		}		
		
		
		if(!uscita)
		{
			risp=v.leggiStringa("Vuoi riproporre il menù?");
		}
		
		else
			risp="no";
		
		}while(risp.equals("s")||risp.equals("si"));
	}
}
