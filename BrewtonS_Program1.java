/* 
Author: Sia Brewton
Class: Dr. Muhammad and D. Boothunum
Date:6/21/24
Description: 
*/
import java.util.Scanner;
public class BrewtonS_Program1 //header
{
   public static void main (String[] args)
    {

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter first name:" ); // Enter First name
String firstName = keyboard.nextLine ();
System.out.print("Enter last name:" ); //Enter last name
String lastName = keyboard.nextLine ();
System.out.print("Enter your age:" ); //Enter age
int age = keyboard.nextInt();
keyboard.nextLine();
System.out.print("Enter your hometown:"); //Enter hometown
String hometown = keyboard.nextLine();
System.out.print("Enter your gpa: "); //Enter gpa
double gpa = keyboard.nextDouble();
//clear buffer (add keyboardnextline after reading a number to print next line)
keyboard.nextLine();
System.out.print("Enter your major:"); //Enter Major
String major = keyboard.nextLine();
System.out.print("Enter diameter of a circle:"); //Enter diameter of circle 
int diameter = keyboard.nextInt();
keyboard.nextLine();
System.out.print ("Enter the length:"); //Enter length
int length = keyboard.nextInt ();
keyboard.nextLine();
System.out.print("Enter the height:"); //Enter height
int height = keyboard.nextInt();
System.out.print("Enter the width:"); //Enter width
int width = keyboard.nextInt ();
keyboard.nextLine();


//String manipulation (Chars)
String fullname = "Sia Brewton"; // fullname
String lastname = "Brewton"; //Last name
String firstname = "Sia"; //First name 
int nameLen = fullname.length();//number of characters for fullname
int hometownLen = hometown.length (); //length of hometown 
String upper = hometown.toUpperCase(); //Uppercase hometown
int majorLen = major.length (); //length of major
String lower = major.toLowerCase(); //lowercase major
char firstchar = lastname.charAt(0); // first char of lastname
char lastchar = firstname.charAt(firstname.length() -1); //last char of firstname


//Basic Calculations
 
double areaofCir = Math.PI * Math.pow (diameter/2,2);
int areaofRec = length*height;
int areaofCub = length*height*width;

System.out.println("Your first name is: "+firstName); 
System.out.println("Your last name is: "+lastName);
System.out.println("Your age is: "+age);
System.out.println("You are from: "+hometown);
System.out.println("Your gpa is:"+gpa);
System.out.println("Your major is:"+major);
System.out.println("The diameter of a circle is: "+diameter);
System.out.println("The length is:"+length);
System.out.println("The height is:"+height);
System.out.println("Your fullname is:" +fullname);
//print String manipulation (Chars)
System.out.println("Uppercase of hometown: "+upper);
System.out.println("Lowercase of Major:  "+lower);
System.out.println("No chars: " +nameLen);
System.out.println("First Character of last name: "+firstchar);
System.out.println("Last Character of first name: "+lastchar);
System.out.println("Number of Characters:" +nameLen); 
//print  basic calculations
System.out.println("Area of circle:"+areaofCir);
System.out.println("Area of rectangle:"+areaofRec);
System.out.println ("Area of cube:"+areaofCub);


}//end of public class
    }//end main mehtod