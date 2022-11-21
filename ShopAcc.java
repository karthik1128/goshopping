package com.tns.goshopping;


public class ShopAcc {
	
	protected static int accNo;
	protected static String accNm;
	private float charges;
	
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{

		this.accNo = accNo;
		this.setAccNm(accNm);
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Your Product is booked and charges Applicable are:"+charges);
	}
	public void items(float charges)
	{
		System.out.println("Your Items are delivered with Applicable charges :"+charges);
	}
	@Override
	public String toString() {
		return "ShopAccount Details:-\nAcount Number-" + accNo + "\nAcount Name-" + getAccNm() + " charges-" + charges ;
	}
	
	
}
