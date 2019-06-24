/******************************************************************************

Agira

*******************************************************************************/
import java.util.*;
public class Main{
    public static void fix(String... a){
        for(String s:a){
            System.out.println(s);
        }
    }
    public static void main(String[] arg){
        String inp="Day 1$ T1 - N - X - 3: T2 - S - X - 4: T3 - W - X - 2; Day 2$ T1 - E - X - 4: T2 - N - X - 3: T3 - S - X - 2; Day 3$ T1 - W - X - 3: T2 - E - X - 5: T3 - N - X - 2";
        String days[]=inp.split(";");
        ArrayList<Integer> east = new ArrayList<Integer>();
        ArrayList<Integer> west = new ArrayList<Integer>();
        ArrayList<Integer> north = new ArrayList<Integer>();
        ArrayList<Integer> south = new ArrayList<Integer>();
        for(int i=0;i<days.length;i++){
            String attacks[]=days[i].replace(" ","").substring(5).split(":");    
            for(int j=0;j<attacks.length;j++){
                attacks[j]=attacks[j].substring(3);
                if(attacks[j].charAt(0)=='N'){
                    
                if(north.isEmpty()){
                    north.add(Integer.parseInt(""+attacks[j].charAt(4)));
                }else{
                    int max =(int)Collections.max(north);
                    int cur = Integer.parseInt(""+attacks[j].charAt(4));
                    if(max<cur)
                    north.add(cur);
                }
                }
                else if(attacks[j].charAt(0)=='S'){
                    
                if(south.isEmpty()){
                    south.add(Integer.parseInt(""+attacks[j].charAt(4)));
                }else{
                    int max =(int)Collections.max(south);
                    int cur = Integer.parseInt(""+attacks[j].charAt(4));
                    if(max<cur)
                    south.add(cur);
                }
                }
                else if(attacks[j].charAt(0)=='E'){
                    
                if(east.isEmpty()){
                    east.add(Integer.parseInt(""+attacks[j].charAt(4)));
                }else{
                    int max =(int)Collections.max(east);
                    int cur = Integer.parseInt(""+attacks[j].charAt(4));
                    if(max<cur)
                    east.add(cur);
                }
                }
                else if(attacks[j].charAt(0)=='W'){
                    
                if(west.isEmpty()){
                    west.add(Integer.parseInt(""+attacks[j].charAt(4)));
                }else{
                    int max =(int)Collections.max(west);
                    int cur = Integer.parseInt(""+attacks[j].charAt(4));
                    if(max<cur)
                    west.add(cur);
                }
                }
                 
               fix(attacks[j]);
            }
           
           //count+=tdy;
           //fix(days[i],"N:"+north,"S:"+south,"E:"+east,"W:"+west);
        }
        
    System.out.println(north.size()+south.size()+east.size()+west.size());
    }
}
