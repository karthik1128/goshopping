package com.tns.goshopping;

import com.tns.goshopping.NormalAcc;
import com.tns.goshopping.PrimeAcc;
import com.tns.goshopping.ShopAcc;
import com.tns.goshopping.ShopFactory;

public class GSShopFactory implements ShopFactory 
{
	
	@Override
	
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		
		return gsprime;
	}

	@Override
	
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		
		return gsnormal;
	}
	
	

	
}
