//wap tp print all the unique subsequences od the string.
import java.util.HashSet;
public class question13
{
    public static void subsequences ( String str , int idx , String newString, HashSet<String>set)
    {
        if ( idx == str.length())
        {
            if ( set.contains(newString))
            {
                return;
            }
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt (idx);
        //to be 
        subsequences(str, idx+1, newString+currChar, set);

        // or not to be 
        subsequences(str, idx+1, newString, set);
    }
public static void main(String[] args) {
    String str = "aaa";
    HashSet<String> set = new HashSet<>();
    subsequences(str, 0, "",set);
 }
}

//we used hashset to not repeat the element in the output
//if we not used it then the output will be 
// aaa
// aa
// aa
// aa
// a 
// a 
// a 

