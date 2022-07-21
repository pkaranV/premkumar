package org.bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		super.deposit();
		System.out.println("doposit is very easy");
		System.out.println("doposit is very hard");

	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();		
	}

}
