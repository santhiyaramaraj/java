package exception;

public class NestingDemo {
	 public static void main(String args[]){
	      
	      try{
	    	
	        try{  // int a[]= {1,2,3,4,5};
	        	//a[10]=30/0;           
	            try{
	            	int arr[]= {1,2,3,4};

	            	System.out.println(arr[10]);
	            }catch(ArithmeticException e){
	            	System.out.print("Arithmetic Exception");
	            	System.out.println(" handled in try-block3");
	            
	            }
	        }
	        catch(ArithmeticException e){
	           System.out.print("Arithmetic Exception");
	           System.out.println(" handled in try-block2");
	        }
	    }
	    catch(ArithmeticException e){
	    	System.out.print("Arithmetic Exception");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	    	System.out.print("ArrayIndexOutOfBoundsException");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(Exception e5){
	    	System.out.print("Exception");
	     	System.out.println(" handled in main try-block");
	     }
	  
	}


}
o/p::::::::::ArrayIndexOutOfBoundsException handled in main try-block
