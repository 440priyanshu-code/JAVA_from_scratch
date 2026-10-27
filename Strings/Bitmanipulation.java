import java.util.*;
class Bitmanipulation
{
    public static void main (String [] args)
    {
        Scanner sc= new Scanner ( System.in);
        System.out.println("enter any number :");
        int n = sc.nextInt();
        System.out.println("enter any position : ");
        int i = sc.nextInt();
        System.out.println("enter your operation : ");
        int oper = sc.nextInt() ; 

// for oper ==1 
        if (oper==1 )
        {
        System.out.println( "you are updating the value at " + i +" " + "into 1");
        int bitmask = 1<<i ;
        int newnum = bitmask | n ; 
        System.out.println("new number ="+ newnum);
      System.out.println("Binary number = " + String.format("%4s", Integer.toBinaryString(newnum)).replace(' ', '0'));
    }

// for oper ==0 
        if (oper==0)
        {
        System.out.println( "you are updating the value at " + i + "into 0");
        int bitmask = 1<<i ;
        int newbitmask = ~(bitmask) ;
       
        int newnum = newbitmask & n ;
        System.out.println("new number =" + newnum);
System.out.println("Binary number = " + String.format("%4s", Integer.toBinaryString(newnum)).replace(' ', '0'));
        }
}
}