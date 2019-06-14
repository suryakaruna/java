/******************************************************************************

Count of possible palindromw in a given string

*******************************************************************************/
import java.util.*;
public class Main
//public class countOfPalindromeSubstring
{
    public static boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
            if(s.charAt(i)!=s.charAt(j))
            return false;
        return true;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "abc";//sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
		    for(int j=0;j<str.length();j++){
		        if(j>=i)
		            if(isPalindrome(str.substring(i,j+1)))
		                count++;
		    }
		}
		System.out.println(count);
	}
}
