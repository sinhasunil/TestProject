package shadowanddeepClone;

public class CloneMain {

	public static void main(String[] args)  {
		
		/*
		 * Address add = new Address("raipur","CG");
		 * 
		 * Employee emp1 = new Employee("ram","abc",add);
		 * 
		 * Employee emp2 = (Employee) emp1.clone();
		 * 
		 * emp2.getAddress().setCity("Bilaspur"); System.out.println("emp1--"+emp1);
		 * System.out.println("emp2--"+emp2);
		 */
		
		String  a = "this string to be reverse" ;
		System.out.println(reverseString(a));
		System.out.println();
		//System.out.println("  String --"+ a.substring(0));
		
		
	}
	
	
  public static  String reverseString( String  input) {
	  
	       
	      String str  = "" ;
	      
	      for(int i =input.length() -1 ; 0 <= i  ; i--) {
	    	  
	    	  str  = str + input.charAt(i) ;
	      }
	      
	      
	      return  str ;
	    		  
	    		  
	      
	  
		/*
		 * if(input.isEmpty()) { return " " ; } else {
		 * 
		 * // System.out.println(input.substring(1) + input.charAt(0)) ;
		 * 
		 * return reverseString(input.substring(1)+input.charAt(0));
		 * 
		 * // return reverseString(input.substring(1) + input.charAt(0)) ; }
		 */
	  
	  
	   
  }
	
	

}
