import java.util.Scanner;

public class question13
{
public static void PrintFibonacci(int n)
{
int a = 0;
int b = 1;


    for (int i = 1; i <= n; i++)
    {
        System.out.print(a + " ");

        int next = a + b;
        a = b;
        b = next;
    }
}


public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of terms:");
    int n = sc.nextInt();

    PrintFibonacci(n);
}
}

