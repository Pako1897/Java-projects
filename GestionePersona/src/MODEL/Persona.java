package MODEL;

public class Persona 
{

	private String nome;
	private String cognome;
	private int eta;
	public String cf;
	
	
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public void setCognome(String cognome)
	{
		this.cognome=cognome;
	}
	
	public void setEta(int eta)
	{
		this.eta=eta;
	}
	
	
	public String getNome()
	{
		return nome;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public int getEta()
	{
		return eta;
	}

}