import java.util.*;
public class Main{
//public class countSetBits
    public static int countOnes(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            count++;
        }
        return count;
    }
    public static void main(String arg[]){
        int T=(new Scanner(System.in)).nextInt();
        if(T<=0 && T>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        while((T--)!=0){
        int x=(new Scanner(System.in)).nextInt();
        if(T<=0 && T>103 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        else{
        int sum=0;
        for(int i=x;i>=1;i--){
        sum+=countOnes(Integer.toBinaryString(i));
        }
        System.out.println(sum);
        }
        }
    }
}
