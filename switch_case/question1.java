// if the user press 1 print Hello 
// for 2 print namaste 
// for 3 print bonjour 
import java.util.*;
class question1
{
    public static void main ( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 ,2 or 3 :- ");
        int button = sc.nextInt();
        switch(button)
        {
            case 1 : System.out.println("hello ");
            break;
            case 2 : System.out.println("namaste ");
            break;
            case 3 : System.out.println("bonjour ");
            break;
            default :  System.out.println("invalid button!" );

        }
    }
}
