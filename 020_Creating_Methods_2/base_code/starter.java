import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow( int a, int b)	{
		int x = a;
		int y = b;
		while(y>1)
		{
			x=x*a;
			y=y-1;
		}
		
		return x ; 
	}	
	public static void main(String args[]) {
		// Your code goes below here


System.out.println(pow(3,7));
		
	}
}
