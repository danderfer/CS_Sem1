import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random (); 
	
	System.out.println(rand.nextInt(10));
	System.out.println(rand.nextInt(100)+1);
	System.out.println(rand.nextDouble()+2.5);
	System.out.println(rand.nextDouble()+14+rand.nextInt(575));	
	}
}
