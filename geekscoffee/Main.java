import java.util.*;
public class Main
//public class geeksCoffee
{
	public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
    	int T=sc.nextInt();
    	if(T<=0 && T>104 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        while((T--)!=0){
		int N=sc.nextInt();
		int M=sc.nextInt();
	if(N<=0 || N>109 || M<=0 || M>103 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        for(int i=0;i<M-1;i++){
            N /= 2;
        }
        System.out.print(N);
	}
	}
}


