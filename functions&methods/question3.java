import java.util.*;
class question3 
{
    public static void printFactorial (int n)
    {
        if (n < 0) // for negative number
        {
            System.out.println("Invaild number !");
            return ; 
        }
        int factorial =1 ; // factorial of 0 and 1 is 1 
        for ( int i=n ; i>=1 ; i--)
        {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return ;

    }
    public static void main ( String args[])
    {
        Scanner sc = new Scanner( System.in); 
        System.out.println("enter any number :");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
 

