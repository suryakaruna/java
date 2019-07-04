import java.util.*;
public class SpartaAndPersia{
	public static void fix(String...a){
	for(String s:a)
	System.out.println(s);
	}/*
	public static void update(HashMap m,String key,int value){
					if(m.containsKey(key)){
					int exist=(int)m.get(key);
					m.replace(key,exist,exist+value);
					}else{
					m.put(key,value);
					}
				}*/
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int Shorse=0,SElephant=0,Sarcher=0,Scavalry=0,phorse=0,pElephant=0,parcher=0,pcavalry=0;
		//HashMap persia = new HashMap<String,Integer>();
//		HashMap sparta = new HashMap<String,Integer>();
		int n=sc.nextInt();
		String inp[]=new String[n];
		for(int i=0;i<n;i++){
			inp[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++){
			
			char ar[]=inp[i].toCharArray();
			
			for(int k=0;k<ar.length;k++){
				int count=0,j=0;
			if(ar[k]=='H'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				Shorse+=count;
				//fix("Shorse:"+count);
			}   
			if(ar[k]=='E'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				SElephant+=count;
				//fix("SElephant:"+count);
			}  
			if(ar[k]=='A'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				Sarcher+=count;
				//fix("Sarcher:"+count);
			}  
			if(ar[k]=='C'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				Scavalry+=count;
				//fix("Scavalry:"+count);
			}  
			if(ar[k]=='h'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				phorse+=count;
				//fix("phorse:"+count);
			}   
			if(ar[k]=='e'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				pElephant+=count;				
				//fix("pElephant:"+count);
			}  
			if(ar[k]=='a'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				parcher+=count;
				//fix("parcher:"+count);
			}  
			if(ar[k]=='c'){
				j=k+1;
				while(ar[j]=='.' && ar[j]!='$'){
					ar[j]='$';
					count++;
					j++;
				}
				if(ar[j]=='X'||ar[j]=='x')
					count+=2;
				k+=count;
				pcavalry+=count;
				//fix("pcavalry:"+count);
			}
			}
				//fix("Shorse: "+Shorse,"SElephant: "+SElephant,"Sarcher:"+Sarcher,"Scavalry: "+Scavalry,"phorse: "+phorse,"pElephant: "+pElephant,"parcher: "+parcher,"pcavalry: "+pcavalry);
				
				//update(sparta,"Shorse",Shorse);
				//update(sparta,"SElephant",SElephant);
				//update(sparta,"Sarcher",Sarcher);
				//update(sparta,"Scavalry",Scavalry);
				
				//update(persia,"phorse",phorse);
				//update(persia,"pElephant",pElephant);
				//update(persia,"parcher",parcher);
				//update(persia,"pcavalry",pcavalry);
				
				
				//sc.nextLine();
		}
		/*
		fix("persia:");
		for(Entry e : persia.entrySet()){
			fix(""+(String)e.getKey()+" : "+(int)e.getValue());
		}
		fix("sparta:");
		for(Entry e : sparta.entrySet()){
			fix(""+(String)e.getKey()+" : "+(int)e.getValue());
		}*/
		Shorse*=5;
		phorse*=5;
		SElephant*=10;
		pElephant*=10;
		Sarcher*=3;
		parcher*=3;
		if((Shorse+SElephant+Sarcher+Scavalry) > (parcher+pElephant+phorse+pcavalry) ){
			fix("Sparta wins");
		}
		else
			fix("Persia wins");
	}
}