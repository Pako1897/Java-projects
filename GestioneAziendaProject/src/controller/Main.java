package controller;

import java.util.ArrayList;

import model.CrudDipendente;
import model.CrudDirigente;
import model.CrudManager;
import model.Dipendente;
import model.Dirigente;
import model.Manager;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		View v=new View();
		CrudDipendente cd=new CrudDipendente();
		CrudManager cm=new CrudManager();
		CrudDirigente cdir=new CrudDirigente();
		
		Dipendente d;
		Manager m;
		Dirigente dir;
		
		String s;
		int id;
		ArrayList<Dipendente> a;
		boolean flag = false;
		
		do {
		
		switch(v.menuIniziale())
		{
		case 1:
			do {
				switch(v.menuInserimento())
				{
					case 1:
						d = new Dipendente();
						id = v.nextId(cd.leggi());
						v.mascheraDiInserimento(d, id);
						
						cd.add(cd.leggi(), d);

						break;
			
			
					case 2:	
						m = new Manager();
						id = v.nextId(cd.leggi());
						v.mascheraDiInserimento(m,id);
						
						cm.add(cm.leggi(), m);
				
						break;
			
			
					case 3:
						dir = new Dirigente();
						id = v.nextId(cd.leggi());
						v.mascheraDiInserimento(dir, id);
						
						cdir.add(cdir.leggi(), dir);
				
						break;
					}
					s=v.leggiStringa("\nRipetere l'inserimento?");
			   }while(s.equals("s")||s.equals("si"));
			
			break;
			
			
		case 2:
			do {
				if(!cd.leggi().isEmpty())
				{
						a = cd.leggi();
						int i = v.trova(a);
						if(i!=-1) 
						{
							Dipendente app = v.mascheraDiModifica(a,i);
							cd.edit(a, app, i);		
						}
						
						else
						{
							v.idNonTrovato();
						}
				}
				else {
					v.warning();
				}
				s=v.leggiStringa("\nRipetere la modifica?");
			}while(s.equals("s")||s.equals("si"));
			
			break;
			
			
		case 3:
			do {
				if(!cd.leggi().isEmpty())
				{
					a = cd.leggi();
					int i=v.trova(a);
					
					if(i!=-1)
						cd.delete(a,i);	
					else
						v.idNonTrovato();
				}
				else
				{
					v.warning();
				}
				s=v.leggiStringa("\nRipetere la cancellazione?");
			}while(s.equals("s")||s.equals("si"));
				break;
			
			
			case 4:
				do {
					if(!cd.leggi().isEmpty())
					{
						v.stampa(cd.leggi());
					}
					else
					{
						v.warning();
					}
					s=v.leggiStringa("\nRipetere la stampa?");
				}while(s.equals("s")||s.equals("si"));
			break;
			
			
		case 5:
			flag=true;
			v.arrivederci();
			break;
		}
		
		if(!flag)
			s=v.leggiStringa("Riproporre il menù?");
		else
			s="n";
		v.arrivederci();
	}while(s.equals("s")||s.equals("si"));

}
}



