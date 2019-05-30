import java.util.Scanner;
public class Main
//public class countXInRange
{
    public static int count(int x,int key){
        int reminder=0,c=0;
        while(x!=0){
            reminder = x%10;
            if(reminder==key){c++;}
            x /= 10;
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
    	int T=sc.nextInt();
    	if(T<0 || T>100){System.out.println("Invalid Input");System.exit(0);}
		while((T--)!=0){
		int x=sc.nextInt();
		int l=sc.nextInt();
		int u=sc.nextInt();
		if(l<0 || u<0 || l>100000 || u>100000){System.out.println("Invalid Input");System.exit(0);}
		int X_count=0;
		for(int i=l+1;i<u;i++){
		   X_count += count(i,x); 
		}
		System.out.println(X_count);
		}
	}
}



