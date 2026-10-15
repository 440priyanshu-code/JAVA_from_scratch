public class pattern3 
{
    public static void main(String[] args)
    {
     for ( int i =1 ; i<5 ; i ++)
        {
            for ( int j=1 ; j<=4 ; j++)
            {
                if ( j<=i)
                {
                    System.out.print("*");
                }
                // else if (i<=j)
                // {
                //     System.out.print("");
                // }
            }System.out.println();
        

        }   
    }
}


//output:-

// *
// **
// ***
// ****

