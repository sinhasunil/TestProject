package com.java.synchronize;

public class MyThread  extends  Thread{

	public void run() {
		
		for(int  i = 0 ; i < 10 ;i++) {
			
			System.out.println("thread name "+Thread.currentThread().getName()+"  "+" "+i);
			
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
