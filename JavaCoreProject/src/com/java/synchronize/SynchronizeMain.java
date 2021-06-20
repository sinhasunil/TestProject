package com.java.synchronize;

public class SynchronizeMain {
	
	public static void main (String args[]) {
		BankAccount bk  = new BankAccount(2000);
		WithdrawAccount  w = new  WithdrawAccount(bk,100);
		
		Thread t1 = new Thread(w);
		t1.setName("Thread-1");
		Thread t2 = new Thread(w);
		t2.setName("Thread-2");
		
		//t1.start();
		// t2.start();
		
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.start();
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt2.start();
		
	} 

}
