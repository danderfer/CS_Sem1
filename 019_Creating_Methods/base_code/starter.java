import java.util.Scanner;
import java.util.Random;

class starter {
	public static String method(String a, String b){
String x = a;
String y = b;
return (x+" "+y);	
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

	String hi = ("Hi you");
	String looken = ("looken like a dog");

System.out.println(method(hi,looken));



		
	}
}
