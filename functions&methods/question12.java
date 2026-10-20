import java.util.Scanner;

public class question12
{
public static int CalculateGCD(int a, int b)
{
int gcd = 1;


    for (int i = 1; i <= a && i <= b; i++)
    {
        if (a % i == 0 && b % i == 0)
        {
            gcd = i;
        }
    }

    return gcd;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number:");
    int a = sc.nextInt();

    System.out.println("Enter second number:");
    int b = sc.nextInt();

    int result = CalculateGCD(a, b);

    System.out.println("GCD = " + result);

  
}


}
