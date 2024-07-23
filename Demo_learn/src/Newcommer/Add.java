package Newcommer;

public class Add {
	int a, b, c;
	
	public void addition() {
		a=20;
		b=30;
		c=a+b;
		
		System.out.println("Total of two no: "+(c));
	}
	public void subtraction() {
		a=110;
		b=30;
		c=a-b;
		
		System.out.println(c);
	}
	public void multiplication() {
		a=12;
		b=30;
		c=a*b;
		
		System.out.println(c);	
	}
	public static void main(String[] args) {
		
		Add	ob=new Add();
		ob.addition();
		ob.subtraction();
		ob.multiplication();
	}
}
