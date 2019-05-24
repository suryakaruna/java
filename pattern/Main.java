import java.util.Scanner;
public class Main
{
    public static String rev(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result+=Character.toString(s.charAt(i));
        }
        return result.trim();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=n*(n+1)/2;
		
	    for(int i=num;i>=1;i--,n--){
	        String tmp="";
	        for(int j=0;j<n;j++){
	        System.out.print((num--)+" ");
	        tmp += String.valueOf(num--)+" ";
	        }
	        System.out.print(rev(tmp.trim()));
	        System.out.println();
	    }

	}
}
