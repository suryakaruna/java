import java.util.Scanner;
public class Main
//public class countXInRange
{
    public static boolean isPerfect(int x){
        int last=x%10,val=0;
        while(x!=0){
            val=x;
            x /= 10;
        }
        //System.out.println(val+" "+x);
        if(val==last )
        return true;
        else
        return false;
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
    	int l=sc.nextInt();
		int u=sc.nextInt();
		//if(l<0 || u<0 || l>100000 || u>100000){System.out.println("Invalid Input");System.exit(0);}
		for(int i=l+1;i<u;i++){
		    if(i%2==0 && isPerfect(i))
		             System.out.print(i+" ");   
		}
	}
}





