public class Esegui {
		
	public static void main(String[] args) {
		String rip;
				
		Lab ex=new Lab();
		
	do {	
		ex.stampaMenu();
		
		int scelta= ex.leggiIntero("Inserire scelta da 1 a 2");
		
		switch(scelta)
		{
		case 1:
			ex.maxMin();
			break;
		case 2:
			ex.pariDispari();
			break;
		default:
			break;
		}
		
		rip=ex.leggiStringa("Vuoi ripetere? s/n");
	}while(rip.equals("s")||rip.equals("S"));
		
	}


}
