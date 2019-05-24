import java.util.Scanner;
public class Main{
//public class countSetBits{
    public static void main(String arg[]){
        int T=(new Scanner(System.in)).nextInt();
        if(T<=0 && T>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        while((T--)!=0){
        String str1=(new Scanner(System.in)).nextLine();
        String str2=(new Scanner(System.in)).nextLine();
        for(int i=0;i<str2.length();i++){
            str1=str1.replaceAll(Character.toString(str2.charAt(i)),"");
        }
        System.out.println(str1);
        }
    }
}
