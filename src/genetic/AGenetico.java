package genetic;

import java.util.Vector;

public class AGenetico 
{
	public Vector poblacion;
	public int nGenerations;
	public double pCruce;
	public int tCruce;
	
	public AGenetico(Vector pob ,int nG, double pC, int tC)
	{
		poblacion = pob;
		nGenerations = nG;
		pCruce = pC;
		tCruce = tC;
	}
	
	public void print()
	{
		for(int i=0; i<poblacion.size(); i++)
		{
			int tam = ((Vector) poblacion.elementAt(i)).size();
			System.out.println("Individuo " + Integer.toString(i+1));
			for(int j=0; j<tam; j++)
			{
				String key = ((Pair)((Vector)poblacion.elementAt(i)).elementAt(j)).getFirst();
				double value = ((Pair)((Vector)poblacion.elementAt(i)).elementAt(j)).getSecond();
				Pair p = new Pair(key,value);
				p.print();
			}
			System.out.println();
		}
			
		System.out.println(nGenerations);
		System.out.println(pCruce);
		System.out.println(tCruce);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
			
		Vector poblacion = new Vector();
		Vector ind1 = new Vector();
		Vector ind2 = new Vector();
		
		
		Pair p = new Pair("jorge" , 2.4); 
		Pair p2 = new Pair("andoni" , 2.2);
		Pair p3 = new Pair("valverde" , 0.5);
		Pair p4 = new Pair("tohalino" , 3.0);

		ind1.add(p);
		ind1.add(p2);
		ind1.add(p3);
		ind1.add(p4);
		
		Pair p5 = new Pair("juan" , 1.4); 
		Pair p6 = new Pair("jose" , 1.2);
		Pair p7 = new Pair("vera" , 3.5);
		Pair p8 = new Pair("lala" , 5.0);
		
		ind2.add(p5);
		ind2.add(p6);
		ind2.add(p7);
		ind2.add(p8);
		
		poblacion.add(ind1);
		poblacion.add(ind2);
		
		
		AGenetico genetic = new AGenetico(poblacion, 12, 12.4, 3);
		genetic.print();
		
		
		
		

	}

}
