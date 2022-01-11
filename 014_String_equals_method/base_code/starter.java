import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	String role = new String();
	
	System.out.println("What role do you want to play?  WI for Wizard   WA for Warrior  RO for Rogue");
	String cleec = sc.nextLine(); 
	
	if(cleec.equals("WI"))
	{
		System.out.println("You're a Wizard now");
	}
	else if(cleec.equals("WA"))
	{
		System.out.println("You're a Warrior now");
	}
	else if(cleec.equals("RO"))
	{
		System.out.println("You're a Rogue now");
	}
	else if(!cleec.equals("RO"))
	{
		System.out.println("Invalid imput mate, try again.");
	}
	
	
	
	}
}
