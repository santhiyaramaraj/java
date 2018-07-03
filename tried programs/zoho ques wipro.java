R.SANTHIYA
15EUIT123
ZOHO   QUESTION:
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wipro;
import java.util.Scanner;
/**
 *
 * @author sandy
 */
public class zoho {
   public static void main(String[] args)
   {
       Scanner p1=new Scanner(System.in);
       String str=p1.next();
       char[] s= str.toCharArray();
       int len=s.length,i,u=0,l=0,c=0,d=0;
       for(i=0;i<len;i++)
       {
R.SANTHIYA
15EUIT123
           if(s[i]>=97&&s[i]<=122)
           {
               l++;
           }
           else if(s[i]>=65&&s[i]<=90)
           {
               u++;
           }
           else 
if(s[i]=='!'||s[i]=='"'||s[i]=='@'||s[i]=='#'||s[i]=='$'||s[i]=='%'||s[i]=='^'||s[i]=='&'||s[i]=='*'||s[i]=='('||s
[i]==')'||s[i]=='-'||s[i]=='+')
           {
               c++;
           }
           else //(s[i]>=0&&s[i]<=9)
           {
               d++;
           }
       }
       System.out.println( "u" +u);
       System.out.println("l" +l);
       System.out.println("c" +c);
      System.out.println("d" +d);
       if(len>=8&&l>=1&&u>=1&&c>=1&&d>=1)
       {
R.SANTHIYA
15EUIT123
           System.out.println("strong");
       }
       else if(len<6||l==0||u==0||c==0||d==0)
       {
            System.out.println("moderate");
       }
        else
       {
            System.out.println("weak");
            }
            }
            }
            
