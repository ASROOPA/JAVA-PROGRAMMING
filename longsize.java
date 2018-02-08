package packages;

public class Allocate {
	public static void main(String[] args) {
		 
	    try {
	      long data[] = new long[10000000]; 
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println(e);
	    }
	 
	    
	       System.out.println("mandate");
	    
	  }

}
