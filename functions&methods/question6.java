import java.util.Scanner;

public class question6
{
    public static void PrintGreater(int a , int b)
    {
        if ( a > b )
        {
            System.out.println("a is greater ");
        }
        else if(b>a) 
        {
            System.out.println("b is greater");
        }
        else
{
System.out.println("Both numbers are equal");
}
return;
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number :");
        int a = sc.nextInt();
        System.out.println("enter any number :");
        int b = sc.nextInt();
        PrintGreater(a, b);

    }

    
}
