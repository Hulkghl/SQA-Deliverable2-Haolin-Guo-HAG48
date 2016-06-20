/**
 * @author Haolin Guo 
 *
 */
//import java.util.*;
/*
 * Define the main class of this deliverable 2, which is the java program CitySim9002
 * as the requirements describe
 * 
 */
public class CitySim9002 
{
	public static void main(String[] args) 
	{
		//If the program is passed in any number of arguments other than 1, including 0, 
		//or the passed-in argument is not a valid integer, the program shall display the message
		//"Please enter one integer argument, seed" and immediately cease execution (exit).
		//if(args.length > 1 || args.length <= 0)
		//{
		//	System.out.println("Please enter one integer argument, seed");
		//	System.exit(0);
		//}
		//FUN-DISPLAY
		/* @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String str2 = line.substring(line.length()-1, line.length());
        */
		//FUN-DISPLAY
		System.out.println("Welcome to CitySim! Your seed is " + 3 + ".");
		//FUN-FIVE-VISITORS. Five visitors, numbered 1 through 5
		FunVisitor[] v = new FunVisitor[5];
		//Shall traverse the City, one after the other
		for(int i = 0; i < 5; i++)
		{
			v[i] = new FunVisitor();
			v[i].Visitor(i);
			if(i <= 4)
				//three asterisks
			System.out.println(" *** ");
		}
	
	}
	
}
