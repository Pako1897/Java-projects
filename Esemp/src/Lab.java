import java.util.Scanner;

public class Lab {

	Scanner s=new Scanner(System.in);
	
	public void maxMin()
	{
		    int a=leggiIntero("Inserisci il primo numero");
			//System.out.println("Inserire primo numero: ");
			//double a= input.nextInt();
			
		
		    int b=leggiIntero("Inserisci il secondo numero");
			//System.out.println("Inserire secondo numero: ");
			//double b= input.nextInt();
		
		
			if(a>b)
			{
				System.out.println("il numero maggiore è: "+a);
			}
		
			else if(a<b)
			{
				System.out.println("il numero maggiore è: "+b);
			}
		
			else
			{
				System.out.println("i numeri sono uguali!");
			}
		}
	
	public void pariDispari()
	{
		System.out.println("Inserire primo numero: ");
		int n1=Integer.parseInt(s.nextLine());
		
		if(n1%2==0)
		{
			System.out.println("il numero è pari");
		}
		else
		{
			System.out.println("Il numero è dispari");
		}
		
	}
	
	public void stampaMenu()
	{
		System.out.println("1 - Max-Min");
		System.out.println("2 - Pari-Dispari");
		System.out.println("Scegli: ");
	}

	public int leggiIntero(String s1)
	{
		System.out.println(s1);
		int num1=0;
		num1=Integer.parseInt(s.nextLine());
		return num1;
	}
		
	public String leggiStringa(String s2)
	{
		System.out.println(s2);
		return s.nextLine();
	}

}










