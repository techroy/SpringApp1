package com.app1.beans;

public class LoanApprover {

	private EmiCalculator emiCalculator;

	public EmiCalculator getEmiCalculator() {
		return emiCalculator;
	}

	public void setEmiCalculator(EmiCalculator emiCalculator) {
		this.emiCalculator = emiCalculator;
	}

	public void verify(int principal, int rate, int time) {

		int value = emiCalculator.claculate(principal, rate, time);

		if (value < 10000) {

			System.out.println("Loan is approved");
		} else {

			System.out.println("Loan is not approved");
		}
	}

}
