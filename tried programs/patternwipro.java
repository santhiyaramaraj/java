package wiprojuly3;
/**
*
* @author sandy
*/
import java.util.Scanner;

public class pattern {
	private static Scanner p1;

	public static void main(String[] args)
    {
        p1 = new Scanner(System.in);
        int n=p1.nextInt();
        int i,j,k;
        int n1=n;
        
        for(i=1;i<=n1;i++)
        {
        	int add = n1;
        	k=i;
           System.out.print(i+" ");
            for(j=n;j>1;j--)
            { 
                k+=add;
                System.out.print(k+" ");
                add--;
             }
            n--;
            System.out.println( );
        }
        
    }

}
