
import java.util.*;
public class Main{
// public class maxMoney{
    public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
    	int T=sc.nextInt();
    //	if(T<=0 && T>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        while((T--)!=0){
		
		int house=sc.nextInt();
		int money=sc.nextInt();
		int oddSum=0,evenSum=0;
        //if(x<=0 && x>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        for(int i=0;i<house;i++){
            if(i%2==0)
            evenSum+=money;
            else
            oddSum+=money;
        }
        if(oddSum>evenSum)
		System.out.println(oddSum);
		else
		System.out.println(evenSum);
        }
    }
}



