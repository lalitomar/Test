package Newcommer;



public class OpratersAll {

	public static void main(String[] args) {
		 // Arithmetic operators
        int a = 10;
        int b = 3;
       
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
           
        
        // Interger declared
        int aa = 10;
        int bb = 10;
 
        // Using uniary operators
        System.out.println("Postincrement : " + (aa++));
        System.out.println("Preincrement : " + (++aa));
 
        System.out.println("Postdecrement : " + (bb--));
        System.out.println("Predecrement : " + (--bb));
        
        
     // Assignment operators
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));
        
     // Comparison operators
        int a1 = 10;
        int b1 = 3;
        int c1 = 5;
 
        System.out.println("a > b: " + (a1 > b1));
        System.out.println("a < b: " + (a1 < b1));
        System.out.println("a >= b: " + (a1 >= b1));
        System.out.println("a <= b: " + (a1 <= b1));
        System.out.println("a == c: " + (a1 == c1));
        System.out.println("a != c: " + (a1 != c1));
        
        
        // Logical operators
        boolean x = true;
        boolean y = false;
       
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        

	}

}
