package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class PayPatTest {
	
	public static class   Parent{
		
		{
			System.out.println("1");
		}
		
		static{
			System.out.println("2");
		}
	static void print(){
		
		System.out.println("Parent class");
	}
	}
	
	public static class Child extends  Parent{
		
		{
			System.out.println("3");
		}
		
		static{
			System.out.println("4");
		}
		
		
		static void print1(){
			
			System.out.println("Child class");
		}
		
	}


	private static final int String = 0;

	
	public static void main(String[] args) {
		
		
		// Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
 
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
 
        // Printing the top element again
        System.out.println(pQueue.peek());
		
        System.out.println(pQueue);
		
		
		Map<String,String> hm =  new HashMap<>();
		
		hm.put(new String( "[]"), "A");
		hm.put(new String( "[]"), "B");
		
		System.out.println(hm);
		
		List<String> listA = new ArrayList<>();
		listA.add("A");
		List<String> listB = listA ;
		List<String> listC = new  ArrayList<>(listB);
		
		listA.clear();
		listB.add("B");
		listC.add("C");
		
		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listC);
		
		
		
		//Parent  p = new Parent() ;
		
		Child c = new Child();
				
		// p.print();
		// c.print();
		
		PriorityQueue<Integer> myNumbersQueue = new PriorityQueue<Integer>();
				myNumbersQueue.add(121);
				myNumbersQueue.add(249);
				myNumbersQueue.add(318);
				System.out.println(myNumbersQueue.poll());
				System.out.println(myNumbersQueue.offer(482));
				myNumbersQueue.add(121);
				myNumbersQueue.remove(249);
				System.out.println(myNumbersQueue.peek());
				System.out.println(myNumbersQueue);
		
		Map<Integer, String> detectiveHashMap = new HashMap
				<Integer, String>();
				detectiveHashMap.put(234, "Sherlock");
				//Collections.unmodifiableMap(detectiveHashMap);
				detectiveHashMap.put(432, "Watson");
				System.out.println(detectiveHashMap);
		
		
	  }
	
		/*try {
			thowmethod();
			System.out.println("1");
		}catch(RuntimeException e) {
		     e.printStackTrace();
			System.out.println("J");
		}
		catch(Exception e1) {
			
			System.out.println("K");
		}finally {
			
			System.out.println("L");
		}
		System.out.println("M");
	}
 
	public static void  thowmethod()  {
		
	 throw  new RuntimeException();
	}*/
}
