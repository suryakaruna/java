import java.util.Scanner;
public class Main{
//public class binaryStartAndEnd{
	public static int countOne(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1')
				count++;
		}
			return count;
	}
	public static int substringCount(int n){
		return ((n*(n-1))/2);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while((T--)!=0){
		String n= sc.nextLine();
		System.out.println(substringCount(countOne(n)));
		}
	}
}
