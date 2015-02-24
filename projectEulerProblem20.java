/**
 * @(#)Problem20.java
 *
 *
 * @author Alison Wen
 * @version 1.00 2015/2/22
 */
import java.math.*;
import java.util.Scanner;
public class Problem20 {
        
    /**
     * Creates a new instance of <code>Problem6</code>.
     */
    public Problem20() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("what is the factorial?");
    	int n = s.nextInt();
    	BigInteger sum = new BigInteger("0");
    	BigInteger factorial = new BigInteger("1");
        for (int number = 1; number<=n; number++)
        {
        	BigInteger multiple = new BigInteger(""+number);
        	factorial = factorial.multiply(multiple);
        }
        while (factorial.compareTo(BigInteger.ZERO) ==1)
        {
        	BigInteger divideConstant = new BigInteger("10");
        	sum = sum.add(factorial.remainder(divideConstant));
        	factorial = factorial.divide(divideConstant);
        }
        System.out.println(sum);
    }
}
