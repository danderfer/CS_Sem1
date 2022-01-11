import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
Random rand = new Random();

System.out.println("Hey you, try and guess my secret number! It is from 0 to 1000! \n \n Now... \n What is your numbeerererer!!!!");
int guessNum=(0);
int secNum = rand.nextInt(1000);

while(guessNum!=secNum)
{
guessNum = sc.nextInt();
if(guessNum==69){System.out.println("Bad child! NO \ntry again");}
else if(guessNum<secNum)
{
System.out.println("Nope, your number is tooo small, try again");
}
else if(guessNum>secNum)
{
	System.out.println("Whoa, your number is tooo big, try again");

}
}
System.out.println("Nice, you got it    Yeeeeeeeeeeee!!!!!!!!!!!!!!!!!");
		
	}
}
