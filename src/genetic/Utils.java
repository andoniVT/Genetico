package genetic;

import java.util.Vector;

public class Utils 
{		
	
	public static double promedio(Vector pares)
	{
		int size = pares.size();
		double sumatoria = 0.0;
		
		for(int i=0; i<size; i++)
		{
			double valor = ((Pair)pares.elementAt(i)).getSecond();
			sumatoria = sumatoria + valor;
		}
		
		return sumatoria/size;		
	}
	
	
	public static void main(String[] args) 
	{
		Pair par = new Pair("hola",1.0);
		Pair par2 = new Pair("hola",4.0);
		Pair par3 = new Pair("hola",2.0);
		Pair par4 = new Pair("hola",13.0);
		
		Vector pares=new Vector();
		pares.add(par);
		pares.add(par2);
		pares.add(par3);
		pares.add(par4);
		System.out.println(promedio(pares));
		
		
		
	}

}
