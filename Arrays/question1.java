// class question1 
// {
//     public static void main(String[] args) {
//         int marks [] = {98 , 99 ,97 };
//         for ( int i=0 ; i <3 ; i++)
//         {
//             System.out.println(marks [i]);
//         }
//         }
// }











// class question1 
// {
//     public static void main(String[] args) {
//       int marks[] = new int [3];
//       marks[0] = 98 ;
//       marks[1] = 97 ;
//       marks[2] = 90 ;

//         {
//             System.out.println(marks [0]);
//             System.out.println(marks [1]);
//             System.out.println(marks [2]);
// 
//         }
//         }
// }













// import java .util.*;  
// class question1{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner ( System.in);
// System.out.print( "enter any number =");
//         int size = sc.nextInt() ;

// int numbers[] = new int [size];


//         for ( int i =0 ; i < size ; i++)
//         {
//             System.out.println(numbers[i]);
//         }
//     }
// }













// import java .util.*;  

// class question1{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner ( System.in);
// System.out.print( "enter any number =");
//         int size = sc.nextInt() ;

// int numbers[] = new int [size];//array...
// // input...
// for ( int i = 0 ; i <size ; i ++)
// {
//    numbers[i] = sc.nextInt() ;//input for array element

// }
// //output...
// System.out.println("the elements of the array are:");
//         for ( int i =0 ; i < size ; i++)
            
//         {
//             System.out.print(numbers[i]+ " ");
//         }
//     }
// }











// take an  array as imput from the user .
// search for a given number x and print the index of that number.
import java .util.*;  
class question1{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner ( System.in);             // size
        System.out.print( "enter size of the array  ="); //size
        int size = sc.nextInt() ;                        // size

        int number [] = new int[ size];
        System.out.println("enter the elements if the array :");
        for ( int i=0 ; i < size ; i++)
{
       number[i] = sc.nextInt();

}

System.out.println("the elements of the array are:");
         for ( int i =0 ; i < size ; i++)
            
         {
             System.out.println(number[i]+ " "+"\n");
         }

System.out.println("enter the number you want to find its index : " );
{
    int x = sc.nextInt() ;
for( int i =1 ; i < number.length ; i++)
{
    if ( number[i] ==x)
        {
            System.out.println( " the index of the number is : " + i);
        }
    
    }
}
}

}

// OUTPUT :-
// enter size of the array  =5
// enter the elements if the array :
// 00
// 99
// 88
// 11
// 22
// the elements of the array are:
// 0 
// 99 
// 88 
// 11 
// 22 
// enter the number you want to find its index : 
// 22
//  the index of the number is : 4
