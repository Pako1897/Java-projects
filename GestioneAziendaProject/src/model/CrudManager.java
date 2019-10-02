package model;

import java.util.ArrayList;

public class CrudManager {
	Repository r= Repository.getInstance();
	
	public void add(ArrayList<Dipendente> a, Dipendente d)
	{
		a.add(d);
	}
	
	public void edit(ArrayList<Dipendente> a, Dipendente d, int i)
	{
		a.set(i, d);
	}
		
	public void delete(ArrayList<Dipendente> a, int index)
	{
		a.remove(index);
	}
	
	public ArrayList<Dipendente> leggi()
	{
		return r.getArrayList();
	}

	public void leggi(ArrayList<Dipendente> a, int ID)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getId()==ID)
				System.out.println(a.get(i));
		}
	}	
}
