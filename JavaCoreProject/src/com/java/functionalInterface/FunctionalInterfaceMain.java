package com.java.functionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceMain  {
	
	private static final boolean Integer = false;

	public static void main (String args []) {
	
	Consumer<Integer> consumer  =  (t)  -> {
		
		 System.out.println("integer Value is"+t);
	};
	
	
      //consumer.accept(10);
     //List<Integer> l  = Arrays.asList(1,2,3,4,5,6,7,8,9);
	//l.stream().forEach( a -> System.out.println(a));
	
	// 2. Predicate
	
	Predicate<Integer>  p  =  (t) ->  t > 5 ;
	
	List<Integer> l  = Arrays.asList(1,2,3,4,5,6,7,8,9);
	List<Integer> pl  = l.stream().filter(e ->  e % 2 ==0).collect(Collectors.toList());
	
	
	             int sum  =     l.stream().mapToInt(i -> i).sum();
	             
	          int  result  =    l.stream().reduce(0, (a, b) ->  a+b);
	         // Integer  maxValue  =    l.stream().map
	          int  minValue  =    l.stream().reduce(0, (a, b) ->  a< b ? a :b);
	       
	       //   System.out.println(maxValue);
	          System.out.println(minValue);

	          System.out.println(result);
	             
	             System.out.println("sum of  list value ...."+sum);
	
	System.out.println(pl);
	
	
	
	// 3. Supplier
	
	  Supplier<String> s  =  () ->    "supplier interface testing is ok" ;
	  
	 System.out.println(s.get());
	 

	
	
	Map<Integer, String> map  =  new HashMap<>();
	 map.put(1,"a");
	 map.put(2,"b");
	 map.put(3,"c");
	 map.put(4,"d");
	 map.put(5,"e");
	 map.put(6,"f");
	 
	 
	 
	 
	// map.entrySet().stream().forEach(obj -> System.out.println(obj.getKey()+"--key and value--------"+obj.getValue()) );
	 
	 
	 Function<String , Integer> func  =  e -> e.length();  
	 Function<Integer , Integer> func2  =  e -> e*10;  
	 
	 Integer value  =  func.andThen(func2).apply("Hanuman") ;
	 
	 System.out.println(value);
	 
	
	 }
	
	

}
