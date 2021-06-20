package com.java.synchronize;

public class WithdrawAccount implements Runnable {
	
	private BankAccount acc ;
	private  int amount ;
	public WithdrawAccount() {
		super();
		this.acc = null;
		this.amount = 0;
		// TODO Auto-generated constructor stub
	}
	public WithdrawAccount(BankAccount acc, int amount) {
		
		this.acc = acc;
		this.amount = amount;
	}
	@Override
	public void run() {
		int w ;
		for(int  i  =0 ; i < 10 ;i++) {
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
		//synchronized(acc) {
			System.out.println(Thread.currentThread().getName() +"  "+" Withdraw "+ acc.getBalance());
		   w = acc.getWithdraw(amount);
		  System.out.println(Thread.currentThread().getName() +"  "+ " Withdraw  "+w +" total balance "+ acc.getBalance() );
		//}
		}
	
	}

}
