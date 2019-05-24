import java.util.*;
class Log{
    int hour;
    int min;
    int sec;
    long phone;
    long timeInSeconds;
    double cost;
    Log(int h,int m,int s,long p){
       this.hour=h; 
       this.min=m; 
       this.sec=s;
       this.phone=p; 
      this.timeInSeconds=this.computeSeconds();
      this.cost=this.calculate();
    }
    public long computeSeconds(){
        return (this.hour*3600 + this.min*60 + this.sec);
    }
    double calculate(){
            double amt;
            if(this.timeInSeconds < 300)
                amt = (double)(this.timeInSeconds * 3);
            else {
                amt = Math.ceil(this.timeInSeconds/60.0) * 150;
            //   if(this.min>=5 && this.sec==0)
            //         amt = (double)(this.min * 150);
            //     else{
            //         amt = (double)((this.min+1) * 150);
            //     }
            }
            
            return amt;
        }
}
public class Main{
public static HashMap<Long,Log> map=new HashMap<Long,Log>();
//public class Solution{
public static double discountCheck(){
    double cost=0.0,maxCost=0.0;
    long maxPhone=0;
    long max=0;
 for(Map.Entry m:map.entrySet()){  
     Log l = (Log)m.getValue();
     cost += l.cost;
     if(l.timeInSeconds==max){
         if(maxPhone>l.phone){
            maxPhone=l.phone;
        maxCost=l.cost;
        max=l.timeInSeconds;
         }
     }
     else if(l.timeInSeconds>max){
         max=l.timeInSeconds;
         maxPhone=l.phone;
         maxCost = l.cost;
     }
    }
    cost -= maxCost;
    return cost;
}

public static int solution(String s){
    int cost=-1;
    String logs[]=s.split("\n");
    if(logs.length >100){System.out.println("Boundary Error: Invalid Input");System.exit(0);}
    for(int i=0;i<logs.length;i++){
        String data[]=logs[i].split(",");
        String time[]=data[0].split(":");
        String phone=data[1].replaceAll("-","");
        if(phone.length() != 9 || (time[0].length()+time[1].length()+time[2].length())!=6 || 0>Integer.parseInt(time[0]) || 99<Integer.parseInt(time[0]) || 0>Integer.parseInt(time[1]) || 59<Integer.parseInt(time[1]) || 0>Integer.parseInt(time[2]) || 59<Integer.parseInt(time[2])){
         System.out.println("Invalid Input At Entry: "+i);   
         System.exit(0);
        }else{
            
        Set<Long> existingPhone = map.keySet();
        if(existingPhone.contains(Long.parseLong(phone))){
             //System.out.println("Found :"+Long.parseLong(phone));   
                Log oldEntry = map.get(Long.parseLong(phone));
                Log temp = new Log(Integer.parseInt(time[0]),Integer.parseInt(time[1]),Integer.parseInt(time[2]),Long.parseLong(phone));
                temp.hour += oldEntry.hour;
                temp.min += oldEntry.min;
                temp.sec += oldEntry.sec;
                temp.cost+=oldEntry.cost;
                temp.timeInSeconds += oldEntry.timeInSeconds;
                
              boolean status = map.replace(Long.parseLong(phone),oldEntry,temp);
                //System.out.println(status);
                
        }
        else{
            map.put(Long.parseLong(phone),new Log(Integer.parseInt(time[0]),Integer.parseInt(time[1]),Integer.parseInt(time[2]),Long.parseLong(phone)));
        }
        
        }
        
    }
    
 for(Map.Entry m:map.entrySet()){  
     Log l=(Log)m.getValue();
            System.out.println("Cost => "+l.cost+" Time => "+l.hour+":"+l.min+":"+l.sec+" Phone => "+l.phone+" Total =>"+l.timeInSeconds);
    }
    
        
    return (int)discountCheck();
}
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        //String inp="00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090";
        String inp="00:05:17,959-720-018\n00:19:38,750-222-197\n00:14:21,959-720-018\n00:17:01,892-545-277";
        //String inp="00:04:59,959-720-018\n00:05:00,750-222-197\n00:15:31,892-545-277";
        //String inp="00:05:17,959-720-018\n00:03:00,959-720-018\n00:04:59,959-720-018";
        System.out.println(solution(inp));
//         "00:01:07,400-234-090
// 00:05:01,701-080-080
// 00:05:00,400-234-090"
    }
}

