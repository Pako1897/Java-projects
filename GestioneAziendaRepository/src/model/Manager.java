package model;

public class Manager extends Dipendente {
	
	private String areaDiResponsabilita;
	
	
	public void setAreaDiResponsabilità(String areaDiResponsabilità)
	{
		this.areaDiResponsabilita=areaDiResponsabilità;
	}
	
	public String getAreaDiResponsabilita()
	{
		return areaDiResponsabilita;
	}
	
	
	public Manager()
	{
		
	}
	
	public Manager(int id, String nome, String cognome, int eta, String ruoloAziendale, String titoloDiStudio, double stipendio, String areaDiResponsabilita)
	{
		super(id, nome, cognome, eta, ruoloAziendale, titoloDiStudio, stipendio);
		this.areaDiResponsabilita=areaDiResponsabilita;
	}

	@Override
	public String toString() {
		return "\n\nMANAGER\n\n" +
				"Id=" + getId() + 
				"\nNome="+ getNome() + 
				"\nCognome=" + getCognome() + 
				"\nEta=" + getEta() + 
				"\nRuoloAziendale="+ getRuoloAziendale() + 
				"\nTitoloDiStudio=" + getTitoloDiStudio() + 
				"\nStipendio="+ getStipendio()+
				"Area di responsabilità=" + areaDiResponsabilita ;
	}
	
	

	
	
}
