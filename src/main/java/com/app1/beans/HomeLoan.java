package com.app1.beans;

public abstract class HomeLoan {

	public void calculateLoan() {

		LoanCalculator loanCalculator = getLoanObject();

		System.out.println("Loan Calc--"+loanCalculator.hashCode());

		int loanAmt = loanCalculator.calculateLoan();
		

	}

	abstract LoanCalculator getLoanObject();

}
