package Newcommer;

import java.util.Scanner;

public class Shivi_client {
	
	public void getdetails(String name, long mobile, String productname, float price) {
		Calculator_Paramterzied ob = new Calculator_Paramterzied();
		float gstout = ob.getGst(price);
		System.out.println(gstout);
		System.out.println(gstout+price);
		
		
	}
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name= sc.next();
		long mobile= sc.nextLong();
		String productname= sc.next();
		float price= sc.nextFloat();
		Shivi_client ob = new Shivi_client();
		ob.getdetails(name, mobile, productname, price);
		
		
	}

}
