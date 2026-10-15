// print the table of the inputed number by the user .
import java.util.*;
public class question3 
{
 public static void main ( String []args )
 {
    Scanner sc = new Scanner ( System.in );
    System.out.println("MULTIPLICATION TABLE :-");
    System.out.print(" enter any number :-");
    int num = sc.nextInt();
    for ( int i = 1 ; i<=10 ; i++)
    {
        System.out.println ( num + "X" + i + "=" + num*i );
        
    }

 }   
}
