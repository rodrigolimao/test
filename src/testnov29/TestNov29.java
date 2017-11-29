/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testnov29;
import java.util.Scanner;
/**
 *
 * @author rodrigolima
 */
public class TestNov29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /**
          * This is test #2 for the Programming Fundamentals course (COMP1030).
          * 
          * For this test, insert the code under each comment.  If code is not
          * directly under the comment, it will not be marked.  For this test,
          * you are allowed to use anything that you bring into the test, but you 
          * are not allowed any communication with others or online research.
          */
         
         /**
          * Question 1 - Print your name to the screen followed by the phrase 
          * "-I'm going to do great on this test"
          * 1 Mark
          */
         System.out.println("Question 1 - 1 Mark");
         System.out.println("Rodrigo Lima - I'm going to do great on this test");
         
         /**
          * Question 2 - using the flow chart provided in class, build the program
          * here.  For the method, define it below (after the main method)                     
          * 4 Marks
          */
        System.out.println("\nQuestion 2 - 4 Marks");
        System.out.println("Enter meal cost before tax:");
           Scanner keyboard = new Scanner(System.in);
            double meal = keyboard.nextInt();
            
            System.out.printf("Your meal is %.2f %n", meal);
            System.out.printf("Your tip is %.2f %n", getTip(meal));
            System.out.printf("Your tax is %f", meal*0.13);
            System.out.printf("Your total cost will be: %f" + meal*0.13 + "%f", meal + getTip(meal));
    }  
    
    public static double getTip(double meal)
    {
        System.out.println("What's the tip?");
      Scanner rod = new Scanner(System.in);
       int tip = rod.nextInt();
       return tip;
       }
//        
    
//         
         /**
          * Question 3 - Prompt the user to enter a whole number.  Based on 
          * the number entered by the user, create the pattern below.
          *
            Enter the number of rows: 5
            *****
            ****
            ***
            **
            *
          * 3 Marks
          */
        
         {
        
        System.out.print("Enter the number of rows: ");
        Scanner keyboard = new Scanner(System.in);
        int rowsAsked = keyboard.nextInt();
        
        
        for (int row=1; row <= rowsAsked; row++)
        {
            for (int col=1; col<=row; col++)
            {
                System.out.print("*");    
            }
            System.out.println();
        }
    }



         
         /**
          * Question 4 - Continously ask the user to enter a number.  When
          * they enter a number that is evenly divisible by 7, end the loop and 
          * print "aced it" to the screen. 
          * 3 Marks 
          */
    
       Scanner rod = new Scanner(System.in);
        Boolean stopnumber = false;
        while (stopnumber == false) 
        {
                    System.out.printf("Please enter another number:");
            int usernumber = rod.nextInt();
            if (usernumber % 7 == 0)
                stopnumber = true;
        }
                
        }
            
    
    /**
     * Question 2 - Put the method header here
     */
    

     
        
}
        
    
    
}
