package genetic;

public class Pair 
{
	
	public String word;
	   public double value;
	   
	   public Pair(String _word, double _value)
	   {
		   word = _word;
		   value = _value;
	   }
	   
	   public String getFirst()
	   {
		   return word;
	   }
	   
	   public double getSecond()
	   {
		   return value;
	   }

	void print()
	   {
		   System.out.println("(" + word + "," + value + ")");
	   }

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
