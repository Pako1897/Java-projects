package model;

public class Dipendente{

	private int id;
	private String nome;
	private String cognome;
	private int eta;
	private String ruoloAziendale;
	private String titoloDiStudio;
	private double stipendio;
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	
	public String getCognome()
	{
		return cognome;
	}
	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}
	
	
	public int getEta()
	{
		return eta;
	}
	public void setEta(int eta) 
	{
		this.eta = eta;
	}
	
	
	public String getRuoloAziendale() 
	{
		return ruoloAziendale;
	}
	
	public void setRuoloAziendale(String ruoloAziendale) 
	{
		this.ruoloAziendale = ruoloAziendale;
	}
	
	
	public String getTitoloDiStudio()
	{
		return titoloDiStudio;
	}
	
	public void setTitoloDiStudio(String titoloDiStudio) 
	{
		this.titoloDiStudio = titoloDiStudio;
	}
	
	
	public double getStipendio()
	{
		return stipendio;
	}
	
	public void setStipendio(double stipendio)
	{
		this.stipendio = stipendio;
	}
	
	
	public Dipendente()
	{
		
	}
	
	public Dipendente(int id, String nome, String cognome, int eta, String ruoloAziendale, String TitoloDiStudio, double stipendio)
	{
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.ruoloAziendale=ruoloAziendale;
		this.titoloDiStudio=TitoloDiStudio;
		this.stipendio=stipendio;
	}
	@Override
	public String toString() {
		return "\n\nDIPENDENTE:\n\n" + 
				"ID: "+ id + 
				"\nnome: " + nome + 
				"\ncognome: " + cognome + 
				"\neta: " + eta + 
				"\nruoloAziendale: "+ ruoloAziendale + 
				"\ntitoloDiStudio: " + titoloDiStudio + 
				"\nstipendio: " + stipendio ;
	}

	
	
	
}
