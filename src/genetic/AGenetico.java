package genetic;

public class AGenetico 
{
	public int nGenerations;
	public double pCruce;
	public int tCruce;
	
	public AGenetico(int nG, double pC, int tC)
	{
		nGenerations = nG;
		pCruce = pC;
		tCruce = tC;
	}
	
	public void print()
	{
		System.out.println(nGenerations);
		System.out.println(pCruce);
		System.out.println(tCruce);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		AGenetico genetic = new AGenetico(12, 12.4, 3);
		genetic.print();		

	}

}
