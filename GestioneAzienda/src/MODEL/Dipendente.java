package MODEL;

public class Dipendente extends Persona{

	private String ruoloAziendale;
	private String titoloDiStudio;
	private double stipendio;
	
	public String getRuoloAziendale()
	{
		return ruoloAziendale;
	}
	
	public void setRuoloAziendale(String ruoloAziendale)
	{
		this.ruoloAziendale=ruoloAziendale;
	}
	
	
	public String getTitoloDiStudio()
	{
		return titoloDiStudio;
	}
	
	public void setTitoloDiStudio(String titoloDiStudio)
	{
		this.titoloDiStudio=titoloDiStudio;
	}
	
	
	public double getStipendio()
	{
		return stipendio;
	}
	
	public void setStipendio(double stipendio)
	{
		this.stipendio=stipendio;
	}
	
	
	//COSTRUTTORI
	
	public Dipendente()
	{
		super();
	}
	
	public Dipendente(int id, String first_name, String last_name, int age, String ruoloAziendale, String titoloDiStudio, double stipendio)
	{
		super(id, first_name, last_name, age);
		this.ruoloAziendale=ruoloAziendale;
		this.titoloDiStudio=titoloDiStudio;
		this.stipendio=stipendio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
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

	@Override
	public String toString() {
		return   super.toString() + "\n"+"ruolo aziendale: "+ ruoloAziendale + "\n"+"titolo di studio: "+ titoloDiStudio + "\n"+"stipendio: "+ stipendio;
	}	
}