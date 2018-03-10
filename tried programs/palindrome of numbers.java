/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num,rev=0,n;
		Scanner obj= new Scanner(System.in);
		int a=obj.nextInt();
		n=a;
		while(a!=0)
		{
			num=a;
			a=a%10;
			rev=rev*10+a;
			a=num/10;
		}
		if(n==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
