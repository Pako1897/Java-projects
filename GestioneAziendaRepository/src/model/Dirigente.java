package model;

public class Dirigente extends Manager{

	private String livelloFunzionale;

	public String getLivelloFunzionale() 
	{
		return livelloFunzionale;
	}

	public void setLivelloFunzionale(String livelloFunzionale) 
	{
		this.livelloFunzionale = livelloFunzionale;
	}

	public Dirigente(int id, String nome, String cognome, int eta, String ruoloAziendale, String titoloDiStudio, double stipendio, String areaDiResponsabilita, String livelloFunzionale) {
		super(id, nome, cognome, eta, ruoloAziendale, titoloDiStudio, stipendio, areaDiResponsabilita);
		this.livelloFunzionale = livelloFunzionale;
	}
	
	public Dirigente()
	{
		
	}

	@Override
	public String toString() {
		return "\n\nDIRIGENTE\n\n"+
				"\nArea Di Responsabilita="+ getAreaDiResponsabilita() + 
				//", toString()=" + super.toString() + 
				"\nId=" + getId()+ 
				"\nNome=" + getNome() + 
				"\nCognome=" + getCognome() + 
				"\nEta=" + getEta()+ 
				"\nRuolo Aziendale=" + getRuoloAziendale() + 
				"\nTitolo Di Studio=" + getTitoloDiStudio()+
				"\nStipendio=" + getStipendio()+
				"Livello funzionale=" + livelloFunzionale;
	}
	
	
}
