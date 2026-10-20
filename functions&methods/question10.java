import java.util.Scanner;

public class question10
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);


    int positive = 0;
    int negative = 0;
    int zero = 0;

    System.out.println("Enter 5 numbers:");

    for (int i = 1; i <= 5; i++)
    {
        int num = sc.nextInt();

        if (num > 0)
        {
            positive++;
        }
        else if (num < 0)
        {
            negative++;
        }
        else
        {
            zero++;
        }
    }

    System.out.println("Positive numbers = " + positive);
    System.out.println("Negative numbers = " + negative);
    System.out.println("Zero numbers = " + zero);

    
}


}
