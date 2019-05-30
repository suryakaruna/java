import java.util.*;
public class Main{
// public class greatOnRight{
    
    public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
        String	result="";		
		int T=sc.nextInt();
        
	if(T<=0 && T>50 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        while((T--)!=0){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int x=sc.nextInt();
        if(x<=0 && x>100 ){System.out.println("Boundary Error:Invalid Input");System.exit(0);}
        for(int i=0;i<x;i++){
            int tmp=sc.nextInt();
            arr.add(tmp);
        }
        //System.out.println(arr);
	
        for(int i=0;i<x-1;i++){
               int max=(Integer)Collections.max(arr.subList(i+1,x));
              if(max==arr.get(i))
                result+="-1 ";
              else
                result += max+" ";
        }    
            result+="-1\n";
			
        }
		System.out.println(result);
        }
    
}

