/* 
Team members Amya Brooks, Brennen Saine, Nia Dove, Sia Brewton
Team name: One of ones 
Class: summer preCollge 24
Instructor: Dr. Muhmmad and Dr. Boothum-Denecke
Program: Project_Cyber_Cases
Date: July 18, 2024
Description: final project
*/

import java.util.Scanner; // Scanner class
public class Project_Cyber_Cases // class header 
{ 
   public static void main(String[] args) // main header 
   {
   
      Scanner keyboard = new Scanner(System.in);
      double count = 3;
      double hearts = 3;
   ///////////////////////////// Brennen Saine ////////////////////////////////////
      // provide description about this program
      System.out.println("Welcome to case study 01: Jane and John Doe?");
      System.out.println("Here's how the game works, \nthere will be 5 clues for "
         + "you to solve in order to find the hackers, \nnyou have 3 hearts to do so, " +
         "each wrong answer is a missing heart. \nCan you find Jane and John Doe?");
      System.out.println("What is your name, agent?");
      String name = keyboard.nextLine();
      String upper = name.toUpperCase();
      System.out.println("Hello Agent " + upper + ", let's begin!");
      
      //  Hampton University
      System.out.println();
      System.out.println("July 18th, 1:00pm");
      System.out.println("Hello Agent " + upper + ", we have been expecting you and your team.");
      System.out.println("Hampton is under attack, /nhackers have infiltrated and stole data from us and major companies who help us!");
      System.out.println("Can you find the location with the weak security so, we can stop the hacker from hacking us?");
      System.out.println();
      while (count != 0){
         System.out.println("What is the name of the building with the coordinates: 37.021033 (lat) and -76.336061 (long)?");
         System.out.println("Answer structure: (______ and _____ building)");
         String building = keyboard.nextLine();
         if (building.toLowerCase().equals("science and technology building")){
            System.out.println("Correct!");
            count = 0.0;
         }
         else{
            System.out.println("Incorrect, Please try again.");
            count-= 0.5;
            hearts-= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
      }
      if (hearts != 0){
         System.out.println("Thank you for helping save Hampton, but it looks like we are too late.");
         System.out.println("The hackers got the information of some major companies and we need you to protect them.");
         System.out.println();
         System.out.println("The next day ");
         System.out.println("Are you the Investigator?! Leidos need your help!\nhackers were able to get past a pro passage " +
            "\nclear scan at Norfolk International Airport \nand pass with three bags.These luggages \nmay have hard drives " +
            "containing a virus \nto break into our firewall.Find which \nluggage contains a hard drive before \nthe company is hacked! "); //Sia Brewton
         System.out.println("*Solve the equations to find the weight of each luggage."); //Sia Brewton
      }
      count = hearts;
   /////////////////////////////////// Sia Brewton /////////////////////////////////////////////
   
   
   //Challenge equations (find out how heavy each suitcase is )
   //loop
   //if the answer is not true then the code will run until it is
      while (count != 0.0)
      {
         System.out.print("Luggage 1: 2(4 + 12)/8 + 12 = ");
         int one = keyboard.nextInt();
         if (one != 16)  //weight of luggage 1
         {
            System.out.println("This is wrong, please try again");
            hearts -= 0.5; //if the answer is incorrect there will be 1/2 of the life taken away
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct!"); //if the answer is correct
            count = 0.0; //if the answer is correct the lives will not change
         }
      }
      count = hearts;
      while (count != 0.0)
      {
         System.out.print(" Luggage 2 : 7 + 6(9 - 8) + 12 = ");
         int two = keyboard.nextInt();
         if (two != 25)  //weight of luggage 2
         {
            System.out.println("This is wrong, please try again");
            hearts -= 0.5; //if the answer is incorrect there will be 1/2 of the life taken away
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct");  //if the answer is correct
            count = 0.0;
         }
      }
      count = hearts;  
      while (count != 0.0)
      {
         System.out.print(" Luggage 3 : 1/2(7 + 65) + 12 = ");
         int three = keyboard.nextInt();
         if (three != 48) //weight of luggage 3
         {
            System.out.println("This is wrong, please try again");
            hearts -= 0.5;  //if the answer is incorrect there will be 1/2 of the life taken away
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct!");
            count = 0.0;
         }
      }
      count = hearts;
      while (count != 0.0)
      {
         System.out.print("If luggage 1 is origanlly 12lbs, how many pounds is the hard drive?: ");
         int four = keyboard.nextInt();
         if (four != 13)   //weight of hard drive in luggage 1
         {
            System.out.println("This is wrong, please try again");
            hearts -= 0.5;
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct!");
            count = 0.0;
         }
      }
      count = hearts;
      while (count != 0.0)
      {
         System.out.print("If luggage 2 is origanlly 7 lbs, how many pounds is the hard drive?: ");
         int five = keyboard.nextInt();
         if (five != 41)  //weight of hard drive in luggage 2
         {
            System.out.println("This is wrong, please try again");
            hearts -= 0.5;
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct!");
            count = 0.0;
         }
      }
      count = hearts;
      while (count != 0.0)
      {
         System.out.print("If luggage 3 is origanlly 23lbs, how many pounds is the hard drive?: ");
         int five = keyboard.nextInt();
         if (five != 30 )   //weight of hard drive in luggage 3
         {
            System.out.println("This is wrong, please try again");
            hearts -= 0.5;
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct!");
            count = 0.0;
         }
      }
      count = hearts;
      if (hearts != 0)
      {
         System.out.println("Great Job! The luggages have been confiscated and Leidos is saved!!");
         System.out.println();
         System.out.println("The next day");
         System.out.println("Lockheed Martin was recently hacked into, \nthe hacker is getting all of our top secrect information which could corrupt our governemnt. \nYou need to to secure the database and find out who the hacker is, \nif you dont you will not be able to move on to the next clue. \nYou will be considered USELESS!! \nTo secure the database you need to solve two mathematical equations."); //Amya Brooks       
         System.out.println("Once you solve the two equations you will enter num1 and num2 down below. \nThe first equation is 2 * ( 4 - num1 ) - 3 *( num1 + 3 )\n The answer to the first eqaution is -11\nYou need to find the answer to num1"); //Amya Brooks
      }
   
   // =====================   Amya  Brooks  ====================
   // Lockheed 
   // You've now made it to solving clue three !! - Amya Brooks   
   // conditioning statements 
      while (count != 0.0)
      {
         System.out.print("num1 = ");
         int one = keyboard.nextInt();
         if (one != 2)
         {
            System.out.println("This is wrong, please try again ");
            hearts -= 0.5;
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("correct");
            count = 0.0;
         }
      }
      if (hearts != 0)
      {
         System.out.println("Move on to the next clue!");
         System.out.println("Now answer the second equation. \nThe equation is 10 + 5 * num2 - 4 * ( num2 - 2 ) \nThe answer to the second equation is 31. \nNow find num2 ");
         System.out.print("num2 = ");
      }
      count = hearts;
      while (count != 0.0)
      {
         int one = keyboard.nextInt();
         if (one != 13)
         {
            System.out.println("This is wrong, please try again ");
            hearts -= 0.5;
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct");
            count = 0.0;
         }
      }
      if (hearts != 0)
      {
         System.out.println("Lockheed Martin is saved, great job!!!");
         System.out.println();
         System.out.println("The next day");
         System.out.print("Hackers have gotten into our drones at amazon, \nthey are malfunctioning flying south \nwhen they should be going north to Hampton University. \nUnscramble the code to reroutre the drones!"); //Nia Dove
      }
      count = hearts;
     
   ///////////////////////////// Nia Dove  ///////////////////////////////////
   //  Amazon
      while (count != 0.0){
         System.out.print("FIRSTCLUE What is our compay name : ");
         String one = keyboard.nextLine();
         if (!(one.equalsIgnoreCase("Amazon")))
         {
            System.out.println("This is wrong, please try again");
            hearts-=0.5;
            count-= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct");
            count = 0.0;
         }
      }
      count = hearts;
      while (count != 0.0)
      {
         System.out.print("SECONDCLUE what is the name of the drone: ");
         String two = keyboard.nextLine();
         if (!(two.equalsIgnoreCase("BwineF7GPS")))
         {
            System.out.println("This is wrong, please try again");
            hearts -=0.5;
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
         else
         {
            System.out.println("Correct");
            count = 0.0;
         }
      }
      count = hearts;
      while (count != 0.0)
      
      {
         System.out.print("THIRDCLUE What is the location our drones should be going: ");
         String three = keyboard.nextLine();
         if (!(three.equalsIgnoreCase("Hampton University")))
         {
            System.out.println("This is wrong, please try again");
            hearts -= 0.5;
            count -= 0.5;
            System.out.println("You have " + hearts + " lives left");
         }
         else
         {
            System.out.println("Correct");
            count = 0.0;
         }
      }
      count = hearts;
      if (hearts != 0)
      {
         System.out.println("Amazon is saved!");
         System.out.println();
         System.out.println("The next day");
         System.out.println("AGENT " + upper + ", THERE HAS BEEN A MAJOR BREAKTHROUGH"); //Brennen
         System.out.println("The hackers tried to hack google overnight leaving fragments of their identity after the failed attempt"); //Brennen
         System.out.println("We now know that the culprits are a male and female and they belong to the CSC department at Hampton University"); //Brennen
         System.out.println("We now have a list of suspects and it appears to be either the computer science instructors \nn or the computer science TAs"); //Brennen
         System.out.println("It is now up to you to unscramble the names and figure out the culprits of this hacking spree");//Brennen
      }
      
      ///////////////////////////// Brennen Saine ////////////////////////////////////////////
      while (count != 0){
         System.out.println("Please unscramble the first suspects name: Liar Silh");
         String sus1 = keyboard.nextLine();
         if (sus1.toLowerCase().equals("aris hill")){
            System.out.println("Hacker Identified");
            count = 0;
         }
         else{
            System.out.println("Wrong suspect, please try again.");
            count -= 0.5;
            hearts -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
      }
      count = hearts;
      while (count != 0){
         System.out.println("Please unscramble the second suspects name: Moniads Ickrimn");
         String sus2 = keyboard.nextLine();
         if (sus2.toLowerCase().equals("madison rickmin")){
            System.out.println("Hacker Identified");
            count = 0;
         }
         else{
            System.out.println("Wrong suspect, please try again.");
            count -= 0.5;
            hearts -= 0.5;
            System.out.println("You have " + hearts + " lives left.");
         }
      }
      if (hearts != 0){
         System.out.println("Madison Rickmin and Aris Hill are now under arrest.");
         System.out.println("Congratulations Agent " + upper + ", you have saved many companies/n today. We hope to work with you again in the future.");
         System.out.println("Mission: Completed");
      }
      else{
         System.out.println("You have no more hearts left");
         System.out.println("Mission: Failed");
      }
      
   } // end of main method 
} // end of class