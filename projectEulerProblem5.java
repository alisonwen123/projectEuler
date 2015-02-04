/**
 * @(#)projectEulerProblem5.java
 *
 *
 * @Alison Wen
 * @version 1.00 1/27/2015 */

public class projectEulerProblem5 
{
    public static void main(String[] args) 
    {
		int multiple = 1;
		int i=1;
		while (i<=20)
		{
			if (multiple%i==0)
        		i+=1;
    		else
    		{
   				multiple = multiple+1; 
        		i=1;
   			}	
		}
		System.out.print(multiple);
 
    }
}
