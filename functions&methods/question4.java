import java.util.*;
public class question4
{
 public static int PrintAverage(int a , int b , int c )
 {
  int avg = (a+b+c)/3;
  System.out.println("average ="+avg);
  return avg;
}
public static void main(String[] args) {
    Scanner sc = new Scanner ( System.in );
    System.out.println("enter num 1=");
    int a = sc.nextInt();
    System.out.println("enter num 2=");
    int b = sc.nextInt();
    System.out.println("enter num 3=");
    int c = sc.nextInt();
       
    PrintAverage(a, b, c);
}
}

