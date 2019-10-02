package MODEL;

public class Direttore extends Manager{
	
	private String livelloFunzionale;
	
	

	public String getLivelloFunzionale() {
		return livelloFunzionale;
	}

	public void setLivelloFunzionale(String livelloFunzionale) {
		this.livelloFunzionale=livelloFunzionale;
	}

	public Direttore() 
	{
		super();
	}

	public Direttore(int id, String first_name, String last_name, int age, String ruoloAziendale, String titoloDiStudio, double stipendio, String areaDiResponsabilita, String livelloFunzionale) {
		
		super(id, first_name, last_name, age, ruoloAziendale, titoloDiStudio, stipendio, areaDiResponsabilita);
		this.livelloFunzionale=livelloFunzionale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((livelloFunzionale == null) ? 0 : livelloFunzionale.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direttore other = (Direttore) obj;
		if (livelloFunzionale == null) {
			if (other.livelloFunzionale != null)
				return false;
		} else if (!livelloFunzionale.equals(other.livelloFunzionale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  super.toString()+ "\n"+"livello funzionale: "+ livelloFunzionale;
	}
	

}
