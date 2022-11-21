package com.tns.goshopping;

import com.tns.goshopping.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	public GSPrimeAcc() 
	
	{
		super(accNo, accNm, charges, isPrime);
		
	}
	
private static final float charges=0; 
	
	
	public float getCharges() {
		
		return charges;
		
	}
	
	public void bookProduct(float charges)
	
	{
		System.out.println("Dear Customer, Your Product Charges are: "+charges);
	}
	
	@Override
	
	public String toString() {
		
		return "GSPrimeAcc []";
	}
	


}