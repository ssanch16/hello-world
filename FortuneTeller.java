package projectProject;
import java.util.Scanner;
public class FortuneTeller {
	 
	public static void main(String[] args) {
		 
		 
		  String fortune1a = "People underestimate you ";
	        String fortune1b = ", but there is more to you than meets the eye.";
	       
	        String fortune2 = ", you will get some extra money from an unexpected source.";
	       
	        String fortune3a = "I see difficult times ahead for you, ";
	        String fortune3b = ". Remember that not all of the people close to you have your best interests at heart";
	        
	        String name = "";
	        int age = 0; 
	        String color = "";
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Welcome, I've been expecting you...");
	        System.out.println("You wish to have your fortune told.");
	        System.out.println("Then, be prepared and keep an open mind.");
	       
	        System.out.println("What is your name?");
	        
	        name = scan.nextLine();
	        System.out.println("And how old are you, " + name + "?");
	        age = Integer.parseInt(scan.nextLine());
	        System.out.println("Now I want you to close your eyes for a moment "
	                + name + ", and think of a color. What color do you see? ");
	        color = scan.nextLine();
	        
	        
	        System.out.println("\nI have seen your fortune:");
	        System.out.println("*********************************************");
	        
	        if(age % 2 == 0)
	        {
	            System.out.println(fortune1a + name + fortune1b);
	        }
	        else
	        {
	        	
	        	if(color.contains("r") || color.contains("R"))
	        	{
	                System.out.println(name + fortune2);
	            }
	            else
	            {
	                System.out.println(fortune3a + name + fortune3b);
	            }
	        }
	        System.out.println("*********************************************");
	        System.out.println("Heed these words, but remember this: you are master of your own destiny");
	       
	    }
	{
	 }
}
