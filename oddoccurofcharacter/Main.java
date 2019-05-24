import java.util.*;
public class Main
{
	public static void main(String[] args) {
        String str=(new Scanner(System.in)).nextLine();
        char ch[]=str.toCharArray();
        String done="";
        for(int i=0;i<ch.length;i++){
        int count = 1;
        if(done.contains(""+ch[i]))
            continue;
        else{    
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }    
            }
            //System.out.println(ch[i]+" : "+count);
            if((count%2)!=0)
            System.out.print(ch[i]);
            done+=""+ch[i];
        }
        }
        //System.out.println(done);
	}
}
