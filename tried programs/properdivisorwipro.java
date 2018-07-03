package wiprojuly3;

import java.util.Scanner;

public class divisor {
	private static Scanner p1;
	private static int number;

	public static void main(String[] args)
	{
		int sum=0;
		p1 = new Scanner(System.in);
		number = p1.nextInt();
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				//System.out.println( +i);
				sum=sum+i;
			}
		}
		System.out.println( +sum);
	}

}
