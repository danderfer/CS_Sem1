import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
	
	System.out.println("What's your name?"); 
	
	String name = sc.nextLine();
	
	System.out.println("Age?");
	
	String age = sc.nextLine();
	
	System.out.println("Birth Month?");
	
	String month = sc.nextLine();
	
	System.out.println("Day?");
	
	String day = sc.nextLine();
	
	System.out.println("Year?");
	
	String year = sc.nextLine();
	
	System.out.println("By the way, how much is a buck fifty?");
	
	String buck = sc.nextLine();
	
	System.out.print("So you said your name is "+name+" and your age is "+age+" with you being born on "+month+day+year);
		
	}
}





//1. First Name
//2. Age
//3. Birthday Month
//4. Birthday Day
//5. Birthday Year
//6. How much is a buck fifty