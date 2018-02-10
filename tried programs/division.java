/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 class Division {
  public static void main(String[] args) {
 
  int a, b, result;
 
    System.out.println("Input two integers");
 Scanner input=new Scanner(System.in);
  a = input.nextInt();
  b = input.nextInt();
 try{
 
  result = a / b;
  System.out.println("Result = " + result);
 }
 catch(Exception e)
  {
  System.out.println("divided by zero");
 }

 }
}
