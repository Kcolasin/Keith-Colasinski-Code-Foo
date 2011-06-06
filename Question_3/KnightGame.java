/**
 * Code-Foo Question 3
 * 
 * @author Keith Colasinski 
 * @version 1.0
 */

public class KnightGame
	{
		public static void main(String [] args)
		{
			int count = 1;
			int squares = 2;
			while (count < 64)
			{
				System.out.println("Knight Move: " + count);
				System.out.println("Squares Covered: " + squares);
				System.out.println("___________________");   
				count = count +1;                      
				squares = squares +1;
			}
		}
	}
