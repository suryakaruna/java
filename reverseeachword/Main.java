import java.util.*;
//public class reverseEachWord
public class Main
{
    public static String reverseWord(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        rev+= s.charAt(i);
        
        return rev;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T=sc.nextInt();
		String str[]= new String[T];
		int j=0;
		while((T--)!=0){
		    str[j]= sc.nextLine();
		    String word[]=str[j].split(" ");
		    String result="";
		    for(int i=0;i<word.length;i++){
		       result+=reverseWord(word[i])+" "; 
		    }
		    System.out.println(result);
		    j++;
		}

	}
}

