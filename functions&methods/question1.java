import java.util.*;
class question1 
{
    public static int CalculateSum(int num1 , int num2)
    {
        
        int sum =num1 + num2; 
        return sum;
    
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println ( "enter num1 :-");   
        int num1 =sc.nextInt();
        System.out.println ( "enter num2 :-");   
        int num2 =sc.nextInt();
     
        int sum = CalculateSum(num1, num2);
        System.out.println("sum =" +sum);
        
    }
}