// if the user press 1 print Hello 
// for 2 print namaste 
// for 3 print bonjour 
import java.util.*;
class question1
{
    public static void main ( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "print 1 ,2 or 3 for different greetings :_");
        int greet = sc.nextInt() ;
        if ( greet == 1)
        {
             System.out.println("NAMASTE!");
        }
        else if ( greet == 2)
        {
            System.out.println("HELLO !");
        }
        else if ( greet ==3 )
        {
            System.out.println("BONJOUR!");
        }
        else 
        {
            System.out.println("invalid input!");
        }
   }
}

