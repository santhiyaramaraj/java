1.import java.util.*;

class sum{
public static int
stringtonum(String num){
char ch[] =
num.toCharArray();
int sum = 0,i;

for(i=0;i&lt;ch.length;i++){
int temp= (int)ch[i];
sum = (sum*10)+(tmpAscii-
48);
}
return sum;
}
public static void
main(String[] args){
Scanner sc=new
Scanner(System.in);
int i,u=0,count=0;
String s1=sc.next();
String s2=sc.next();
int n1=stringtonum(s1);
int n2=stringtonum(s2);
System.out.print(n1+n2);
}
}
