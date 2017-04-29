//////////////////////////////////////////////////
// Problem 6.22 - Temperature Conversions       //
// Description - Create a program that converts //
//        temperatures in fahrenheit or celsius //
//        to the opposite temperature           //
// By. Nicole Anderson                          //
// Date - October 20, 2014                      //
//////////////////////////////////////////////////

import java.util.Scanner;

public class Temperature
{
   public void getInformation()
   {
      Scanner input = new Scanner( System.in ); // Allows user input
      
      System.out.print( "Please enter what type of degree you would like to," );
      System.out.print( " convert to:\n 1 - Celsius\n 2 - Fahrenheit\n" );
      int choice = input.nextInt(); // gets the users input choice
      System.out.println();
      
      System.out.print( "Enter the temperature in degrees you want to convert\n" );
      int degree = input.nextInt(); // gets the degrees from the user to convert
      System.out.println();
      
      if( choice == 1 )
      {
         System.out.printf( "%d Degrees Fahrenheit = %d Degrees Celsius\n", degree, celsius( degree ) );
      } // end celsius choice if statement 
      else if( choice == 2 )
      {
         System.out.printf( "%d Degrees Celsius = %d Degrees Fahrenheit\n", degree, fahrenheit( degree ) );
      } // end fahrenheit choice if statement
      else
         System.out.print( "Invalid Choice! Bye Bye!!!" );
       
   } // end getInformation
   
   public static int celsius( int fTemp )// method that calculates degrees celsius
   {
      return ( ( int ) ( 5.0 / 9.0 * ( fTemp - 32 ) ) );
   } // end method celsius
   
   public static int fahrenheit( int cTemp)// method that calculates degrees fahrenheit
   {
      return ( ( int ) ( 9.0 / 5.0 * cTemp + 32 ) );
   } // end method fahrenheit
} // end class Temperature