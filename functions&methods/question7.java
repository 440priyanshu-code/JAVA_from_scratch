import java.util.*;

public class question7 
{
    public static double PrintCircumference(int rad)
    {
        double circumference = 2 * 3.14 * rad ;
       return circumference ;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any radius =");
        int rad= sc.nextInt();

        double result = PrintCircumference(rad);
         System.out.println("Circumference = " + result);
    }
}    
    
