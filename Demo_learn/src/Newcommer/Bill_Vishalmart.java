package Newcommer;

import java.util.Scanner;

public class Bill_Vishalmart {
	
	
	Scanner sc = new Scanner(System.in);
	
	public void bill()
	{
		System.out.println("****Vishal Mega Mart****");
		System.out.println("Customer Name");
		String name = sc.next();
		System.out.println("Customer Mobile No");
		Long mobile = sc.nextLong();
		System.out.println("Items Name");
		String item = sc.next();
		System.out.println("Amount  : ");
		double amount = sc.nextDouble();

		double gst = (amount*18)/100;
		System.out.println("GST 18%  : "+gst);
		double total_amount = amount+gst;
		System.out.println("Total Amount  : "+ total_amount);
		
		
	}
	public static void main(String [] args)
	{
		Bill_Vishalmart ob = new Bill_Vishalmart();
		ob.bill();
	}

}
