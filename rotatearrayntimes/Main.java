import java.util.Scanner;
public class Main
{
     public static int[] rotateAntiClock(int arr[],int n){
       while((n--)!=0){
        int tmp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=tmp;
       }
        return arr;
    } 
    public static int[] rotateClock(int arr[],int n){
       while((n--)!=0){
        int tmp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=tmp;
       }
        return arr;
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while((T--)!=0){
		    int N=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++) {
		       arr[i] =sc.nextInt();
		    }
		      arr = rotateClock(arr,k);
  
    	     
		    for(int i=0;i<arr.length;i++) {
		    System.out.print(arr[i]);    
		    if(i!=arr.length-1)
		    System.out.print(" ");
		    }
		}	
		
	}
}

