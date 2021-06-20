package com.java.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // SumCallable s = new SumCallable(100);
      
      try {
		
    	 ExecutorService  ex = Executors.newFixedThreadPool(10);
    	
    	
      	List<Future<Integer>>  fList = new ArrayList();
    	
      	for(int i  = 0 ;  i < 10 ;i++) {
      		Future<Integer> f  =   ex.submit(new SumCallable(i));
      		fList.add(f);
      	}
      	
      	for(Future f : fList) {
    	System.out.println(f.get());
      	}
    	  
    	  
    	  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
