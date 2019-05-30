import java.util.*;
public class Main
// public class manualSubString
{
    public static int substr(String s,String x){
        int result=-1;
        // System.out.println(x.length());
        for(int i=0;i<s.length();i++){
           int j=0;
            if(s.charAt(i)==x.charAt(0)){
                int t=i;
               while(j<x.length() && (s.charAt(t)==x.charAt(j))){
                // System.out.println("i :"+i+" j: "+j+" s[]: "+s.charAt(t)+" x[]: "+x.charAt(j));
                     j++;
                     t++;
               }
               if(j == x.length()){
                 result=i;
                break;
               }
          }
        }
     return result;   
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int T=sc.nextInt();
	    while((T--)!=0){
	        String dummy=sc.nextLine();
	        String s=sc.nextLine();
	        String x=sc.nextLine();
	        System.out.println(substr(s.trim(),x.trim()));
	    }
	}
}
