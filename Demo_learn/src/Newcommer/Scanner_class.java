package Newcommer;

import java.util.Scanner;

public class Scanner_class {
	
	int a,b,c;   // when we declare int a,b,c at Global (Class level)
	Scanner sc = new Scanner (System.in);// when we create scanner Class at Global (Class level) then 
										//  no need create in every method
	
	public void add()
	{
		//Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two input for Add");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	
	}
	public void sub()
	{
		//Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two input for Sub");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("value of sub= "+ c);
		
	}
	public void div()
	{
		System.out.println("Enter two input for div");
		Float a=sc.nextFloat(); // Float not declare at global so write the Float before variable, its (Local)
		Float b=sc.nextFloat();
		Float c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Scanner_class ob = new Scanner_class();
		ob.add();
		ob.sub();
		ob.div();
		
	}
	

}
