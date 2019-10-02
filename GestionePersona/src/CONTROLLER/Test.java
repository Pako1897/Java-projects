package CONTROLLER;

import MODEL.Persona;
import VIEW.View;

public class Test {

	public static void main(String[] args) {
		
		Persona p=new Persona();
		View v=new View();
		
	
		p.setNome(v.leggiStringa("Inserire nome: "));
		p.setCognome(v.leggiStringa("Inserire cognome: "));
		p.setEta(v.leggiIntero("Inserire età: "));
		
		
		v.stampaPersona(p);
		
	}

}
