/*
*Golomb Series
*/
import java.util.*;
//public class Golomb{
public class Main{
public static void main(String[] arg){
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList seq=new ArrayList<Integer>();
	seq.add(1);
	seq.add(2);
	seq.add(2);
	for(int i=3;i<=n;i++)
		for(int j=(int)seq.get(i-1);j>=1;j--)
			seq.add(i);
	
	for(int i=0;i<n;i++){
		System.out.println(seq.get(i));
	}
		
	
	
}	
}