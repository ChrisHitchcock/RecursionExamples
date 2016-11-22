/*
 * FACTORIALS USING RECURSION AND GREATEST COMMON DENOMINATOR USING RECURSION
 */

package factorialsrecursion;

/**
 *
 * @author chhit5249
 */
public class FactorialsRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=20;
        System.out.println("Factorial of "+num+" is "+fact(num)+"\n-------------------------------------------------");
        int num2=81;
        int num3=63;
        System.out.println("The greatest common denominator of "+num2+" and "+num3+" is "+gcd(num2,num3));
    }
    public static long fact(int n)
        {
            if (n==0||n==1)
            {
                return 1;
            } else {
                return (n*fact(n-1));
            }
        }
    public static int gcd(int a, int b)
    {
        if (b==0)
        {
            return a;
        } else {
            return (gcd(b, a%b));
        }
    }
    
}
