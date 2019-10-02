package model;

import java.util.ArrayList;

public class Repository {
	
	private static Repository instance;
	private ArrayList<Dipendente> a; 

	public static Repository getInstance()
	{
		
		if(instance==null)
		{
			instance=new Repository();
		}
		
		return instance;
		
	}
	
	public ArrayList<Dipendente> getArrayList()
	{
		return a;
	}

	private Repository()
	{
		a=new ArrayList<Dipendente>();
	}
	
}
