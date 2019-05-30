import java.util.*;
public class Main
//public class maxProductInArray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
    	int T=sc.nextInt();
    	if(T<=0 && T>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        while((T--)!=0){
		int N=sc.nextInt();
		if(N<=1 || N>107 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
		int arr[]=new int[N];
		int max=0,prevMax=0;
        for(int i=0;i<N;i++){
           arr[i]=sc.nextInt();
           if(arr[i]>max){
            prevMax=max;
            max=arr[i];
           }
           if(arr[i]>prevMax && arr[i]!=max)
           prevMax=arr[i];
        }
        
        System.out.print(max*prevMax);
	}
	}
}


