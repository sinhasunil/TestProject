package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaDuplicated {
	
	
	public static void main(String args[]) {
	
	List<Integer>  list = Arrays.asList(5,5,5,5,3,3,2,1,6,33,7);
	Set<Integer> set = new HashSet<>();
	
	 Set<Integer> s =  list.stream().filter(e ->  !set.add(e)).collect(Collectors.toSet()) ;
	 
	 System.out.println(s);
	}
}
