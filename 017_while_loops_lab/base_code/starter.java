import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Waht is your name?");
	String name = sc.nextLine();
	System.out.println("How many times do you want me to say it?");
	int nameNum = sc.nextInt();
	int numNum = (0);
	while(numNum<nameNum)
	{
		System.out.println(name);
		
	numNum = numNum + 1;
	}





		
	}
}
