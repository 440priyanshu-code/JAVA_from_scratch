//wap to get the age of a person and 
// check whether he/ she is elgible to vote of not.

import java.util.Scanner;

class question1{
    public static void main ( String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age :-");
        int age = sc.nextInt() ;
        if ( age == 18)
        {
            System.out.println( "elligible to vote ");
        }
            else if( age < 18)
        {
            System.out.println( "not elligible to vote ");
        }
        else if( age > 18)
        {
            System.out.println( "elligible to vote ");
        }
           else
        {     
    System.out.println( "Something went wrong");
        }
    }
}

