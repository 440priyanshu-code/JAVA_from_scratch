class question6 
{
    public static int calcpower ( int x , int n )
    {
        if ( x == 0 )
        {
            return 0 ; 
        }
        if ( n ==0 )
        {
            return 1 ;

        }

        int XpowNm1 = calcpower( x,n-1 );
        int XpowN =  x*XpowNm1;
        return XpowN;
    }
    public static void main ( String[] args)
    {
        int x = 2 , n = 5;
        int ans = calcpower ( x, n );
        System.out.println(ans );
    }
}