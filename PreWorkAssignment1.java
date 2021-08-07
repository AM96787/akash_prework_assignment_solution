//This Program is created by Akash Mankotia
//Great Learning Pre Work Assignment 1
import java.util.Scanner;
public class PreWorkAssignment1 
{
  public static void main(String[] args) 
  {
    for (int i = 1;; i++) 
    {
      PreWorkAssignment1 p1 = new PreWorkAssignment1(); // creating object of the class
      Scanner in = new Scanner(System.in);  // creating object of the Scanner class
      System.out.println("Enter the Number or Press 0 to Exit the program");
      int num = in.nextInt();  // taking the input from user
      if (num == 0) 
      {
        System.out.println("Exit the Program "); // exiting the program is user selects 0
        break;
      } 
      else 
      {
        System.out.println(
            "Press 1 to check for Palindrome, Press 2 to Print Pattern, Press 3 to check for Prime Number, Press 4 to create Fibonacci series and Press 0 to Exit the process");

        int opt = in.nextInt();
        switch (opt) 
        {
        case 0:
          System.out.println("Exit the Current Process and Enter a New Number"); // exit the current process if user wants to enter a new number
          break;
        case 1:
          System.out.println(" ");
          p1.palindrome(num); // calling palindrome function
          break;
        case 2:
          System.out.println(" ");
          p1.printPattern(num); // calling pattern printing function
          break;
        case 3:
          System.out.println(" ");
          p1.checkPrimeNumber(num); // calling prime number check function
          break;
        case 4:
          System.out.println(" ");
          p1.printFibonacciSeries(num); // calling fibonacci series printing function
          break;
        default:
          System.out.println("Not a Valid Selection "); // printing message if the selected option is invalid
        }
      }
      System.out.println(" ");
      System.out.println("--------------");
      System.out.println(" ");
    }
  }

  public void palindrome(int x) 
  {
    int rem, rev = 0, temp;
    temp = x; // initializing the temp variable with the number
    while (x > 0) {
      rem = x % 10; // getting remainder
      rev = (rev * 10) + rem; // reversing the number
      x = x / 10;
    }
    if (temp == rev) // checking if the actual number and reversed number is same or not
      System.out.println(temp+ " is a palindrome.");
    else
      System.out.println(temp+ " is not a palindrome");
  }

  public void printPattern(int y) 
  {
    if(y>=1)
    {
    for (int i = y; i >= 1; i--) // decrementing the level
    {
      for (int j = i; j >= 1; j--) // calculating the number of * at each level
      {
        System.out.print('*'); // printing the *
      }
      System.out.println(' '); // printing new line
    }
  }
    else
      System.out.println("Not a Valid Selection for Printing Pattern"); // printing new line
  }

  public void checkPrimeNumber(int z) 
  {
    boolean flag = false; // flag variable if the number is divisible by any other number
    if (z <= 1)
      System.out.println(z + " is not a Prime Number."); // 0 & 1 are not prime numbers
    else if (z > 3) // 2 & 3 are prime numbers
    {
      for (int i = 2; i < z; i++)                        // start the loop from 2 and traverse till n-1
        if (z % i == 0) {
          flag = true;                                   // change flag value to true if the number is divisible by any number and come out of the loop
          break;
        }
      if (flag)
        System.out.println(z + " is not a Prime Number.");
      else
        System.out.println(z + " is a Prime Number.");
    } else
      System.out.println(z + " is a Prime Number.");
  }

  public void printFibonacciSeries(int a) 
  {
    int first = 0, second = 1, temp;
      System.out.println("Fibonacci Series for "+a);      
      System.out.println(" ");
      System.out.print(first+","+second); // printing the first 2 numbers by default
    for (int i=2;i<=a;i++)
    {  
      temp = first + second;              // saving the sum of first 2 number to a temp variable
      System.out.print(","+temp);         // print the temp variable
      first = second;                     // assign value of 2nd variable to first variable
      second = temp;                      // assign temp variable value to second variable
    }         
      System.out.println(" ");
  }

}