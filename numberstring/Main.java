import java.util.Scanner;
import java.util.regex.Pattern;
public class Main{
// public class NumberString{
    // public static boolean isValid(String s){
    //     for(int i=0;i<s.length();i++){
    //         if(s.chatAt(i)=='9')
    //         return false;
    //     }
    //     return true;
    // }
    
	public static String numberStr(String s){
		String words[]=s.split(" ");
		int max=0;
		String maxStr="-1";
		for(int i=0;i<words.length;i++){
		  //  if(Pattern.matches("[0-8]", words[i].trim())){
		  if(Pattern.compile("[0-8]").matcher(words[i]).matches()){
	          if(max<words[i].length()){
	              max=words[i].length();
	              maxStr=words[i];
	          }  	        
		    }
    	}
			return maxStr;
	}
	
	public static void main(String[] args){
// 		Scanner sc=new Scanner(System.in);
// 		int T=sc.nextInt();
// 		while((T--)!=0){
// 		String n= sc.nextLine();
// 		System.out.println(substringCount(countOne(n)));
// 		}
        System.out.println(numberStr("12 to extract 1234"));
	}
}

