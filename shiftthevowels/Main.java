import java.util.*;
//public class ShiftTheVowels{
public class Main{
	public static boolean isVowel(char c){
		if(c=='A' || c=='E' || c=='I' || c=='O' || c== 'U' || c=='a' || c=='e' || c=='i' || c=='o' || c== 'u')
			return true;
		else
			return false;
	}
//     public static void fix(String ...ar){
// 		for(String tmp:ar)
// 		System.out.println(tmp);
// 	}
	public static void main(String[] arg){
		String inp=(new Scanner(System.in)).nextLine();
		String result="";
	int FI=-1,index=-1,count=0;
	char cur='\u0000',prev='\u0000';
	for(int i=0;i<inp.length();i++){
		if(isVowel(inp.charAt(i))){
			if(FI==-1){
			FI=i;
			index=i;
			prev=inp.charAt(i);
			cur=inp.charAt(i);
			}
			else{
				index=i;
				cur=inp.charAt(i);
				result=inp.substring(0,index);
				inp=result+inp.substring(index).replaceFirst(""+cur,""+prev);	
				prev=cur;
				
				
			}
			
		}
		else{
			count++;
			if(count>=inp.length()-1){
				System.out.println(inp);
				System.exit(0);
			}
		}
	}
			result=inp.substring(0,FI);
			inp=result+inp.substring(FI).replaceFirst(""+inp.charAt(FI),""+prev);	
			System.out.println(inp);
}





}