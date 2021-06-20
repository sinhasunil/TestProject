package com.java.executor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*class Service implements Runnable{
	int  i    ;
	Service(int  i){this.i  =  i ;}
	@Override
	public void run() {
		 System.out.println("In Thread  "+i);
		 try {
			Thread.sleep(1000);
		}   catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
	}
	
}*/


class Service implements Callable<String>{
	int  i    ;
	Service(int  i){this.i  =  i ;}
	@Override
	public String call() throws Exception {
		// System.out.println("In Thread  "+i);
		 //Thread.sleep(1000);
		 return "In callable Thread..."+i ;
	}
	
}

public class ExecutorServiceUtil {
	
	@SuppressWarnings("unchecked")
	public static void main(String args []) throws InterruptedException {
	     int  k  = 0;
		ExecutorService  es  =  Executors.newFixedThreadPool(2) ;
		
		List<Callable<String>>  callableList  = new ArrayList<>();
		System.out.println(new Date());
		
		for( k  = 0 ; k <10 ;k++) {
			callableList.add((new Service(k)));
		}
		
		String futurString = null;
		try {
			futurString = es.invokeAny(callableList);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//List<Future<String>> futureList  = es.invokeAll(callableList) ;
		es.shutdown();	
		
		try {
			es.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("========Future Return=================");
		
		System.out.println(futurString);
		/*
		 * for(Future<String> fur : futureList) { try { System.out.println(fur.get()); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (ExecutionException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } }
		 */
		
		System.out.println(new Date());
		}

}
