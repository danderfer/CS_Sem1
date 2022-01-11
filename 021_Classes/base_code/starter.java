import java.util.Scanner;
import java.util.Random;
class character
{
	Scanner sc =  new Scanner(System.in);
  	 String role = sc.nextLine();
	 int Str = sc.nextInt();
	 int Dex = sc.nextInt();
	 int Inte = sc.nextInt();
	 int Con = sc.nextInt();
	 int Cha = sc.nextInt();
	 
	 String charStat = ("You are a "+role+"\n"+"Strength = "+Str+"\n"+"Dexterity = "+Dex+"\n"+"Intelligence = "+Inte+"\n"+"Constitution = "+Con+"\n"+"Charisma = "+Cha );
	
}
class starter {
	public static void main(String args[]) {

System.out.println("Please type your role and stats \n Your roles can be Wizard, Warrior, or Rogue \n The stats you are filling in are Strength, Dexterity, Intelligence, Constitution, and Charisma, in that order \n        (press enter between inputs) ");
 character per1 = new character();

System.out.println(per1.charStat);
		
	}
}
