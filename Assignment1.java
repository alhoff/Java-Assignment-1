/****************************************************************
 This program asks the user to enter 3 integers, then determines
 the following: the sum, average, product, smallest, largest, 
 range, and median of these integers. It then calculates the
 quotient and remainder of the largest divded by smallest. All
 results remain as integers and are thus sometimes approximate.
 Finally, the results are displayed to the user.
 ****************************************************************/


import java.util.Scanner; // program uses class Scanner

public class Assignment1
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int number1; // first number
      int number2; // second number
      int number3; // third number
      int sum, average, product, smallest, largest, range, median, quotient, remainder; // values to be calculated

      System.out.print( "\nEnter first integer: " ); // prompt
      number1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = input.nextInt(); // read second number from user

      System.out.print( "Enter third integer: " ); // prompt
      number3 = input.nextInt(); // read third number from user
      
      sum = number1 + number2 + number3; // sum calculation
      average = sum / 3; // average calculation
      product = number1 * number2 * number3; // product calculation
      
      largest = number1; // begin largest comparison
      if(number2 > largest) {
          largest = number2;
      }
      if (number3 > largest) {
          largest = number3;
      } // end largest comparison
       
      smallest = number1; // begin smallest comparison
      if(number2 < smallest) {
          smallest = number2;
      }
      if (number3 < smallest) {
          smallest = number3;
      } // end smallest comparison
       
      if (number1 != smallest && number1 != largest) { // begin median comparison
          median = number1;
      } else if (number2 != smallest && number2 != largest) {
          median = number2;
      } else {
          median = number3;
      } // end median comparison

      range = largest - smallest; // range calculation
       
      quotient = largest / smallest; // quotient calculation
       
      remainder = largest % smallest; //remainder calculation
       
      System.out.printf( "\nFor the numbers %d, %d, and %d\n", number1, number2, number3 ); //begin printing results
      System.out.printf( "The largest is %d.\nThe smallest is %d.\nThe median is %d.\nThe range is %d.\nSum is %d.\nProduct is %d.\nAverage is %d.\n\nQuotient of the largest divided by the smallest is %d.\n\nRemainder of the largest divided by the smallest is %d.\n\n ", largest, smallest, median, range, sum, product, average, quotient, remainder ); // end printing results
      

   } // end method main

} // end class Assignment1


