import java.util.*;
class mostfrequentdigit {
public static void main (String[]
args) {
Scanner sc=new
Scanner(System.in);
int i,j,count=0,max=0;
String x=&quot; &quot;;
for(i=0;i&lt;4;i++)
{
String temp=sc.next();
x+=temp;
}
int l=x.length();
char c[]=x.toCharArray();
Arrays.sort(c);
char v=&#39; &#39;;
for(i=0;i&lt;l;i++)
{
count=1;
if(c[i]==&#39;*&#39;)

{
continue;
}
for(j=i+1;j&lt;l;j++)
{
if(c[i]==c[j])
{
count++;
c[j]=&#39;*&#39;;
}
}

if(max&lt;=count)
{
max=count;
v=c[i];

}
}

System.out.print(v);
}
}
