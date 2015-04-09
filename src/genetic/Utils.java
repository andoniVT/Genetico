package genetic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;
import java.lang.Math;

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
	
	public static ArrayList getIndices(int size)
	{
		ArrayList arrlist = new ArrayList();
		for(int i=0; i<size; i++)
		{
			arrlist.add(i);
		}		
		Collections.shuffle(arrlist);
		return arrlist;		
	}
	
	public static ArrayList getCruces(int nGeneraciones , int tCruces)
	{
		ArrayList arrlist = new ArrayList();
		for(int i=0; i<tCruces; i++)
		{
			arrlist.add(1);
		}
		for(int i=0; i<nGeneraciones-tCruces; i++)
		{
			arrlist.add(0);
		}
		Collections.shuffle(arrlist);
		return arrlist;
	}
	
	
	public static void main(String[] args) 
	{
		/*
		Pair par = new Pair("hola",1.0);
		Pair par2 = new Pair("hola",4.0);
		Pair par3 = new Pair("hola",2.0);
		Pair par4 = new Pair("hola",13.0);		
		Vector pares=new Vector();
		pares.add(par);
		pares.add(par2);
		pares.add(par3);
		pares.add(par4);
		System.out.println(promedio(pares));*/
		
		ArrayList l = getCruces(15,6);
		System.out.println(l.size());
		System.out.println(l);
		

		
		
	}

}
