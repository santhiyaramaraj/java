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
		int num,sum=0;
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
	
		while(a!=0)
		{
			num=a;
			a=a%10;
		
			sum=sum+a;
			a=num/10;
		}
		System.out.println("sum:"+sum);
		
	}
}
