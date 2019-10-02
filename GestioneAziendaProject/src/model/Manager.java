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
	   return getId() + ", "+ getNome() +", " + getCognome() +", " + getEta() +", " + getRuoloAziendale() +", " + getTitoloDiStudio() +", "+ getStipendio()+", "+ areaDiResponsabilita;
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
	
	
	

	
	
}
