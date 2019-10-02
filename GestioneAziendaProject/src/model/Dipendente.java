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
		return id + ", " + nome +", " + cognome +", " + eta +", "+ ruoloAziendale +	", " + titoloDiStudio +", " + stipendio ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + eta;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ruoloAziendale == null) ? 0 : ruoloAziendale.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stipendio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titoloDiStudio == null) ? 0 : titoloDiStudio.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (eta != other.eta)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ruoloAziendale == null) {
			if (other.ruoloAziendale != null)
				return false;
		} else if (!ruoloAziendale.equals(other.ruoloAziendale))
			return false;
		if (Double.doubleToLongBits(stipendio) != Double.doubleToLongBits(other.stipendio))
			return false;
		if (titoloDiStudio == null) {
			if (other.titoloDiStudio != null)
				return false;
		} else if (!titoloDiStudio.equals(other.titoloDiStudio))
			return false;
		return true;
	}
}
