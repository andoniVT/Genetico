package genetic;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Vector;

import genetic.Utils;

public class AGenetico 
{
	public Vector poblacion;
	public int nGenerations;
	public double pCruce;
	public int tCruce;
	public Vector populationFitness;
	public int sizePoblacion;
	
	public AGenetico(Vector pob ,int nG, double pC, int tC)
	{
		poblacion = pob;
		nGenerations = nG;
		pCruce = pC;
		tCruce = tC;
		populationFitness = new Vector();
		sizePoblacion = poblacion.size();
		for(int i=0; i<sizePoblacion; i++)
		{
			populationFitness.add(0.0);
		}
	}
	
	public void hallarFitnessIndividuo(int index)
	{
		double fitness = Utils.promedio((Vector)poblacion.elementAt(index));
		populationFitness.set(index, fitness);						
	}
	
	public void hallarFitnessPoblacion()
	{
		for(int i=0; i<sizePoblacion; i++)
		{			
			hallarFitnessIndividuo(i);
		}
	}
	
	public void showFitness()
	{
		System.out.println(populationFitness);
	}
		
	public void seleccionTorneo()
	{
		ArrayList indices = Utils.getIndices(sizePoblacion);
		System.out.println(indices);
		Vector nueva_poblacion = new Vector();
		
		for(int i=0; i<indices.size(); i=i+2)
		{
			int position = (int)indices.get(i);
			int position2 = (int)indices.get(i+1);
			double fitness1 = (double)populationFitness.elementAt(position);
			double fitness2 = (double)populationFitness.elementAt(position2);
			if(fitness1>fitness2)
			{
				Vector ganador = (Vector)poblacion.elementAt(position);
				nueva_poblacion.add(ganador);
				nueva_poblacion.add(ganador);
			}
			else
			{
				Vector ganador = (Vector)poblacion.elementAt(position2);
				nueva_poblacion.add(ganador);
				nueva_poblacion.add(ganador);
			}
		}
		poblacion = nueva_poblacion;		
	}
	
	public void cruce1Punto(int index , int index2)
	{
		Vector individuo = (Vector)poblacion.elementAt(index);
		Vector individuo2 = (Vector)poblacion.elementAt(index2);
		Vector hijo = new Vector() , hijo2 = new Vector();
		int corte = (int) (Math.random() *(individuo.size()));
		int i=0;
		while(i<individuo.size())
		{
		  int j=0;
		  while(j<corte)
		  {
			  hijo.add(individuo.elementAt(j));
			  hijo2.add(individuo2.elementAt(j));
			  j+=1;
			  i+=1;
		  }
		  int k = corte;
		  while(k<individuo.size())
		  {
			  hijo.add(individuo2.elementAt(k));
			  hijo2.add(individuo.elementAt(k));
			  k+=1;
			  i+=1;
		  }
		  i+=1;
		}
		poblacion.set(index, hijo);
		poblacion.set(index2, hijo2);		
	}
	
	public void cruce2Punto()
	{
		
	}
	
	
	public void execute()
	{
		
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
	}
	
	
	public static void main(String[] args) 
	{				
		Vector poblacion = new Vector();
		Vector ind1 = new Vector(), ind2 = new Vector();
		Vector ind3 = new Vector(), ind4 = new Vector();
		
		Pair p = new Pair("jorge" , 2.4), p2 = new Pair("andoni" , 2.2);
		Pair p3 = new Pair("valverde" , 0.5), p4 = new Pair("tohalino" , 3.0);
		ind1.add(p); ind1.add(p2); ind1.add(p3); ind1.add(p4);
		
		Pair p5 = new Pair("juan" , 1.4), p6 = new Pair("jose" , 1.2);
		Pair p7 = new Pair("vera" , 3.5), p8 = new Pair("lala" , 5.0);		
		ind2.add(p5); ind2.add(p6); ind2.add(p7); ind2.add(p8);
		
		Pair p9 = new Pair("p1" , 5.4), p10 = new Pair("p5" , 4.2);
		Pair p11 = new Pair("p8" , 8.5), p12 = new Pair("p45" , 6.0);		
		ind3.add(p9); ind3.add(p10); ind3.add(p11); ind3.add(p12);
		
		Pair p13 = new Pair("p77" , 4.0), p14 = new Pair("p7" , 6.8);
		Pair p15 = new Pair("p8" , 10.8), p16 = new Pair("p5" , 8.0);		
		ind4.add(p13); ind4.add(p14); ind4.add(p15); ind4.add(p16);
				
		poblacion.add(ind1); poblacion.add(ind2);
		poblacion.add(ind3); poblacion.add(ind4);
				
		AGenetico genetic = new AGenetico(poblacion, 12, 12.4, 3);
		genetic.cruce1Punto(0, 1);
		/*System.out.println("Poblacion Inicial");
		genetic.print();
		genetic.hallarFitnessPoblacion();
		System.out.println("Fitness de la Poblacion");
		genetic.showFitness();		
		genetic.seleccionTorneo();		
		System.out.println("Poblacion despues del torneo");
		genetic.print();
		genetic.hallarFitnessPoblacion();
		System.out.println("Nuevo fitness");
		genetic.showFitness();*/
	}

}
