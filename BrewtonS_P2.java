//Name: Sia Brewton
//Number Guessing Game

import java.util.Scanner;
import java.util.Random;
public class BrewtonS_P2
{
  public static void main (String [] args)
  {
  //Introduction of the game
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Let’s play a number guessing game!");
  
  //Choosing a random number
  int highest = 20;
  Random randomNumbers = new Random();
  int answer = randomNumbers.nextInt (highest);
  keyboard.nextLine ();
  System.out.println("I've chosen a random number between 0 and " + highest );
 
  
  //First Guess 
  System.out.print("Guess an integer between and including 0 and 20:");
  int guess ;
  guess = keyboard.nextInt ();
  //(Nested if statement)
  
     if (guess == answer)
     {  
         if (guess > answer)
         {
          System.out.println(guess + " is too high.");
     return;
          }
        else 
          {
           System.out.println(guess + " is correct!");
          }
         }
         else
         {       
           System.out.println(guess + " is too low.");
          }
            
   //Second guess
   System.out.print("Guess again:");
   guess = keyboard.nextInt ();
   //No nested if statements
   
      if (guess == answer)
      {
          System.out.println(guess + " is correct!");
         return;
      }
         if (guess > answer)
         { 
          System.out.println(guess + " is too high.");
         }
            if (guess < answer)
            {
           System.out.println(guess + " is too low.");
            }
           
    //Thrid guess   
    System.out.print("Last Guess:");
    guess = keyboard.nextInt ();
    String direction = keyboard.nextLine(); 
    //if-else-is statements
    
       if (guess == answer)
       {
          System.out.println(guess + " is correct!");
       return;
       }
       else if (guess > answer)
          {
          direction = "high";
          }
       else if(guess < answer)
              {
           direction = "low";
              }
 
     System.out.println(guess + " is too " + direction + ".The number was " + answer + " .");


 
   
   


    
      

     
  
  
  
  
  
  
  
  
  



  
  
  
  
  
  
  
  
  
  
  
  
  }//end of main method
      }//end of class