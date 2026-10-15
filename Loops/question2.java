// public class question2 
// {
// public static void main(String[] args) 
// {
// int i =0;
// do {
//     System.out.println(i);
//     i=i+1;
// }
// while (i<=5);
// }
// }



// class question2
// {
//     public static void main(String[] args)
//      {
//         int i = 0;
//         while(i<=10)
//         {
//             System.out.println(i);
//         i++;
//         }
//      }
// }


import java. util. * ;

class question2
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner( System.in);
int sum =0;
        System.out.println (" enter any number :-");
        int num = sc.nextInt();
for(int i=1 ; i<=num ; i++)
{
    sum = sum + i;
   
}
 System.out.println("sum="+sum);
     }
}

