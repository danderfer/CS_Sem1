import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int num = rand.nextInt(1000+1);
	System.out.println(num);
	System.out.println("HaHa, try to guess my number, bet you'll get it wrong. It's out of 1000 :D");
	int gNum= sc.nextInt();
	if(num==gNum)
	{
		System.out.println("I don't know how, but you got it right. \n \n \n cheater.");
	}
	else if(gNum>num)
	{
		System.out.println("Your number is too big, HaHa");
	}
	else
	{
		System.out.println("Your number is tiny compared to my mega good number");
	}
	}
}
