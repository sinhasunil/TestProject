package com.java.hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class RemoveDuplicateHashSet {

	public static void main(String[] args) {
		Map<Integer,Worker> hs=  new HashMap<Integer,Worker>();
		
		Worker  w1  =  new Worker(110,"Hanuman") ;
		Worker  w2  =  new Worker(102,"Hanuman") ;
		Worker  w3  =  new Worker(109,"Hanuman") ;
		Worker  w4  =  new Worker(113,"Hanuman") ;
		Worker  w5  =  new Worker(100,"Hanuman") ;
		Worker  w6  =  new Worker(99,"Hanuman") ;
		
		hs.put(w1.id,w1);
		hs.put(w2.id,w2);
		hs.put(w3.id,w3);
		hs.put(w4.id,w4);
		hs.put(w5.id,w5);
		hs.put(w6.id,w6);
		
		
		Iterator iterator = hs.keySet().iterator();
		while(iterator.hasNext()) 
		{
			Worker  w = hs.get(iterator.next());
			System.out.println(w);
			}

			/*
			 * for(Entry<Integer, Worker> w : hs.entrySet()) {
			 * 
			 * System.out.println(w); }
			 */
		
		List a  = new ArrayList();
		
		Vector  v = new Vector();
		
		
		for(int i  = 0; i < 10; i++) {
			
			v.add(i);
		}
		
		System.out.println(v);
		
		v.remove(6);
		
		// Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
		
		
	}

}
