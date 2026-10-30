

class question1
{
    public static void printNum( int n) // defining the function 
    {
        if (n == 0) // base 
        {
            return ; // base 
        }
        System.out.println(n); // 5 
        printNum( n -1 ); // 4     recursion   

        
    }
    public static void main(String[] args) 
    {
        int n = 5 ;
        printNum(n); // calling the function 
        
    

}
}