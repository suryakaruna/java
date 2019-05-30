import java.util.Scanner;
public class Main
//public class stringKeyMapping
{
    
	public static void main(String[] args) {
	    int T=(new Scanner(System.in)).nextInt();
	    if(T<=0 || T>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
	    while((T--)!=0){
        String s=(new Scanner(System.in)).nextLine().toLowerCase();
        if(s.length()<=0 || s.length()>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        String result[]={" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<s.length();i++){
            for(int j=1;j<result.length;j++){
                if(result[j].contains(""+s.charAt(i)))
                System.out.print(j);
            }
        }
        }
	}
	
}
