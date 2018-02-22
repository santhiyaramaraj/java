//Create your own program in which multiple catch are present

public class TestMultipleCatchBlock{
  public static void main(String args[]){
   try{
    int a[]={1,2,3,4,5};
a[10]=30/0;
System.out.println(a[10]);
  
   }
   catch(ArithmeticException e){System.out.println("task1 is completed");}
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
   catch(Exception e){System.out.println("common task completed");}

   System.out.println("rest of the code...");
 }
}

o/p:task1 is completed
rest of the code...


now changing the condition:::

public class TestMultipleCatchBlock{
  public static void main(String args[]){
   try{
    int a[]={1,2,3,4,5};                      //changing the condition
System.out.println(a[10]);
  
   }
   catch(ArithmeticException e){System.out.println("task1 is completed");}
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
   catch(Exception e){System.out.println("common task completed");}

   System.out.println("rest of the code...");
 }
}

o/p
::task 2 completed
rest of the code...
