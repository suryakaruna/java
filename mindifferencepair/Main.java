import java.util.Scanner;
public class Main
//public class minDifferencePair
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		if(N<0 && N>100){System.out.println("Invalid Input");System.exit(0);}
		whlie((T--)!=0){
		int N=sc.nextInt();
		if(N<1 && N>100){System.out.println("Invalid Input");System.exit(0);}
		int arr[] = new int[N];
		int min=0,diff=0;
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]<0 && arr[i]>100000){System.out.println("Invalid Input");System.exit(0);}
		}
		min=arr[0];
		for(int i=0;i<N;i++){
		    for(int j=i+1;j<N;j++){
		        diff= arr[j]-arr[i];//)?arr[i]-arr[j]:arr[j]-arr[i];
		        if(diff<min && diff>0)
		        min=diff;
		    }
		    
		}
		System.out.println(min);
		}
	}
}


