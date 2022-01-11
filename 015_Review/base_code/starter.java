import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("What is your name");
	String name = sc.nextLine();
	
	System.out.println("What family do you hail from (title)");
	String title = sc.nextLine();
	
	System.out.println("What role do you want to play?  WI for Wizard   WA for Warrior  RO for Rogue");
	String role = sc.nextLine(); 
	
	if(role.equals("WI"))
	{
		System.out.println("You're a Wizard now \n");
		System.out.println("Now you need stats. You have 25 stat points to spend, and 5 catagories to sepnd them in: \n Strength - Buff and able to carry larger items \n Dexterity - Agile and moves quick \n Intelligence - Better at magic spells! \n Constitution - How much health \n Charisma - How personable \n");
	System.out.println("You can put a max of 10 points on a stat. \n What do you want your Strength to be? \n (Remember, numbers only!)");
	int str = sc.nextInt();
	System.out.println("("+(25-str)+" Points left )\n"+"Dexterity?");
	int dex = sc.nextInt();
	System.out.println("("+(25-(str+dex))+" Points left )\n"+"Intelligence?");
	int intel = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel))+" Points left )\n"+"Constitution?");
	int con = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel+con))+" Points left )\n"+"Charisma");
	int cha = sc.nextInt();
	int totalUsed = (str+dex+intel+con+cha);
	if(totalUsed<25)
	{
		System.out.println("You used "+totalUsed+" of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else if(totalUsed==25)
	{
		System.out.println("You used all 25 of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" you are a "+role+"and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else
	{
		System.out.println("You used points you did not have, you have to retart now ;D");
	}
	
	}
	else if(role.equals("WA"))
	{
		System.out.println("You're a Warrior now \n");
			System.out.println("Now you need stats. You have 25 stat points to spend, and 5 catagories to sepnd them in: \n Strength - Buff and able to carry larger items \n Dexterity - Agile and moves quick \n Intelligence - Better at magic spells! \n Constitution - How much health \n Charisma - How personable \n");
	System.out.println("You can put a max of 10 points on a stat. \n What do you want your Strength to be? \n (Remember, numbers only!)");
	int str = sc.nextInt();
	System.out.println("("+(25-str)+" Points left )\n"+"Dexterity?");
	int dex = sc.nextInt();
	System.out.println("("+(25-(str+dex))+" Points left )\n"+"Intelligence?");
	int intel = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel))+" Points left )\n"+"Constitution?");
	int con = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel+con))+" Points left )\n"+"Charisma");
	int cha = sc.nextInt();
	int totalUsed = (str+dex+intel+con+cha);
	if(totalUsed<25)
	{
		System.out.println("You used "+totalUsed+" of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else if(totalUsed==25)
	{
		System.out.println("You used all 25 of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" you are a "+role+"and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else
	{
		System.out.println("You used points you did not have, you have to retart now ;D");
	}
	
	}
	else if(role.equals("RO"))
	{
		System.out.println("You're a Rogue now \n");
			System.out.println("Now you need stats. You have 25 stat points to spend, and 5 catagories to sepnd them in: \n Strength - Buff and able to carry larger items \n Dexterity - Agile and moves quick \n Intelligence - Better at magic spells! \n Constitution - How much health \n Charisma - How personable \n");
	System.out.println("You can put a max of 10 points on a stat. \n What do you want your Strength to be? \n (Remember, numbers only!)");
	int str = sc.nextInt();
	System.out.println("("+(25-str)+" Points left )\n"+"Dexterity?");
	int dex = sc.nextInt();
	System.out.println("("+(25-(str+dex))+" Points left )\n"+"Intelligence?");
	int intel = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel))+" Points left )\n"+"Constitution?");
	int con = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel+con))+" Points left )\n"+"Charisma");
	int cha = sc.nextInt();
	int totalUsed = (str+dex+intel+con+cha);
	if(totalUsed<25)
	{
		System.out.println("You used "+totalUsed+" of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else if(totalUsed==25)
	{
		System.out.println("You used all 25 of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" you are a "+role+"and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else
	{
		System.out.println("You used points you did not have, you have to retart now ;D");
	}
	
		
	}
	else if(!role.equals("RO"))
	{
		System.out.println("Invalid imput mate, try again. \n");
		
	}
	
	
	
	
	
	
	
	
	
	
		System.out.println("Now you need stats. You have 25 stat points to spend, and 5 catagories to sepnd them in: \n Strength - Buff and able to carry larger items \n Dexterity - Agile and moves quick \n Intelligence - Better at magic spells! \n Constitution - How much health \n Charisma - How personable \n");
	System.out.println("You can put a max of 10 points on a stat. \n What do you want your Strength to be? \n (Remember, numbers only!)");
	int str = sc.nextInt();
	if(str>10)
	System.out.println("("+(25-str)+" Points left )\n"+"Dexterity?");
	int dex = sc.nextInt();
	System.out.println("("+(25-(str+dex))+" Points left )\n"+"Intelligence?");
	int intel = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel))+" Points left )\n"+"Constitution?");
	int con = sc.nextInt();
	System.out.println("("+(25-(str+dex+intel+con))+" Points left )\n"+"Charisma");
	int cha = sc.nextInt();
	int totalUsed = (str+dex+intel+con+cha);
	if(totalUsed<25)
	{
		System.out.println("You used "+totalUsed+" of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else if(totalUsed==25)
	{
		System.out.println("You used all 25 of your points");
		System.out.println("If I'm not mistaken, you are "+name+" "+title+" you are a "+role+"and you stats are: \n Strength: "+str+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Constitution: "+con+"\n Charisma: "+cha);
	}
	else
	{
		System.out.println("You used points you did not have, you have to retart now ;D");
	}
	
	
	
	
	
	
	
	
	
	
	
	

	}
}
