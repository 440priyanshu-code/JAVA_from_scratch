 //wap to check whether the inpute number is odd or even .

import java.util.Scanner;

class question2 
 {
    public static void main(String[] args) 
    {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number :-");
        int num = sc.nextInt();
        if ( num %2 == 0 )
        {
            System.out.println("the number is even !");
        }
        else {
            System.out.println("the number is odd !");
        }

    }
 }