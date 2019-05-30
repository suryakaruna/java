import java.util.*;
public class Main{
//public class genBinaryNos{
    
    public static void main(String arg[]){
        int T=(new Scanner(System.in)).nextInt();
        if(T<=0 && T>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        while((T--)!=0){
        int x=(new Scanner(System.in)).nextInt();
        if(T<=0 && T>103 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        else{
        for(int i=1;i<=x;i++){
            System.out.print(Integer.toBinaryString(i)+" ");
        }
        }
        }
    }
}

