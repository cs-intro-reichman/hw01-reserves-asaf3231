/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	
	public static void main(String[] args) {
        
        int a1 = Integer.parseInt(args[0]);
        int b1 = Integer.parseInt(args[1]);
        int c1 = Integer.parseInt(args[2]);
        double a = a1; 
        double b = b1;
        double c = c1;       

        double rightEq = c - b;

        double res = rightEq/a;

        System.out.println(a + " * x + " + b + " = " + c);
        System.out.println("x = " + res);
     } 
 }