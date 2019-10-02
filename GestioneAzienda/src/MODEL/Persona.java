package MODEL;

public class Persona {
	
	private int id;
	private String first_name;
	private String last_name;
	private int age;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	
	public String getFirstName()
	{
		return first_name;
	}
	
	public void setFirstName(String first_name)
	{
		this.first_name=first_name;
	}
	
	
	public String getLastName()
	{
		return last_name;
	}
	
	public void setLastName(String last_name)
	{
		this.last_name=last_name;
	}
	
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	//COSTRUTTORI 
	
	public Persona()
	{
		
	}
	
	public Persona(int id, String first_name, String last_name, int age)
	{
		this.id=id;
		this.first_name=first_name;
		this.last_name=last_name;
		this.age=age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + id;
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //controlla se l'indirizzo dell'oggetto corrente è uguale a quello dell'oggetto passato
			return true;
		if (obj == null) //controlla se l'oggetto esiste o meno
			return false;
		if (getClass() != obj.getClass()) //controlla se i due oggetti sono dello stesso tipo
			return false;
		Persona other = (Persona) obj;
		if (age != other.age)
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (id != other.id)
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "ID: "+id + "\n" + "Nome: "+ first_name +"\n" + "cognome:  " + last_name + "\n"+ "età: " + age+ "";
	}
	
	
	
	

}