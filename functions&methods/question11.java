import java.util.Scanner;

public class question11
{
public static int CalculatePower(int x, int n)
{
int power = 1;

    for (int i = 1; i <= n; i++)
    {
        power = power * x;
    }

    return power;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of x:");
    int x = sc.nextInt();

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    int result = CalculatePower(x, n);

    System.out.println("Result = " + result);

    sc.close();
}


}
