package MODEL;

public class Manager extends Dipendente{

	
	private String areaDiResponsabilita;
	
	public String getAreaDiResponsabilita()
	{
		return areaDiResponsabilita;
	}
	
	public void setAreaDiResponsabilita(String areaDiResponsabilita)
	{
		this.areaDiResponsabilita=areaDiResponsabilita;
	}
	
	
	//COSTRUTTORI
	
	public Manager()
	{
		super();
	}
	
	public Manager(int id, String first_name, String last_name, int age, String ruoloAziendale, String titoloDiStudio, double stipendio, String areaDiResponsabilita)
	{
		super(id, first_name, last_name, age, ruoloAziendale, titoloDiStudio, stipendio);
		this.areaDiResponsabilita=areaDiResponsabilita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((areaDiResponsabilita == null) ? 0 : areaDiResponsabilita.hashCode());
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
		Manager other = (Manager) obj;
		if (areaDiResponsabilita == null) {
			if (other.areaDiResponsabilita != null)
				return false;
		} else if (!areaDiResponsabilita.equals(other.areaDiResponsabilita))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"area di responsabilità: "+areaDiResponsabilita;
	}
}
