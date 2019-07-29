/******************************************************************************

You have been hired as a software consultant at a chemist. The chemist shop 
sells various types of compounds and mixture to their customers. They have a
research team that put together various formulas for the chemist of sell. 
The owner of the shop is a bit of stickler for cleanliness and is also afraid 
of unforeseen reactions when creating the compounds. So,she has created a rule
where a new mixing can is to used for creating a new compound (whether the 
compound is made of the base elements or from another set of pre-made compounds).
Your job as a consultant is to determine the minimal number of bowls that are 
required to make them. Any compound/element that is part of a definition, without 
its own definition can be assumed to be a base element. base elements don’t need any preparation.

Multiline input. Where first line N specifies the number of compound definitions 
followed by N definitions. Followed. Followed by integer M specifies the number of 
compounds to prepare and M compounds to prepare.


Calculate the minimum number of bowls required to prepared the given compounds.


Test case 1
Input
2
H2O = H + O
NaCL= Na + CL
1
NaCL
Output
1
Test case 2
Input
2
H2O = H + O
NaCL= Na + CL
2
NaCL
NaCL
Output
1
Test case 3
Input
4
H2O = H + O
NaCL = Na + CL
H2SO4 = H2O + SO3
SO3 = S + O
1
SO3
H2SO4
Output
3
*******************************************************************************/
import java.util.*;
public class Main
{
    static int count=0;
    static Map<String,List<String>> definitionMap = new HashMap<String,List<String>>();
    
    public static void countBowl(String compound){
        if(definitionMap.containsKey(compound)){
            count++;
            List<String> temp = (ArrayList)definitionMap.get(compound);
            for(String str : temp){
                countBowl(str);
            }
        }
    }
    
	public static void main(String[] args) {
	    String parsed="";
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String definitions[] = new String[N];
	    sc.nextLine();//capture dummy
	    for(int i=0;i<definitions.length;i++){
	        definitions[i]=sc.nextLine();
	    }
	    
	    int M = sc.nextInt();
	    sc.nextLine();//capture dummy
	    String compounds[] = new String[M];
	    for(int i=0;i<compounds.length;i++){
	        compounds[i]=sc.nextLine();
	    }
	   // System.out.println(Arrays.toString(definitions));
	   // System.out.println(Arrays.toString(compounds));
	   

        for(String unitDifinition : definitions)
        {
            String[] leftAndRight = unitDifinition.trim().split("=");
            String[] compoundsList = leftAndRight[1].trim().split("\\+");
            List<String> temp = new ArrayList<String>(compoundsList.length);
            for(String unitCompound : compoundsList)
            {
                temp.add(unitCompound.trim());
            }
           definitionMap.put(leftAndRight[0].trim(),temp);
        }
        // for(Map.Entry e: definitionMap.entrySet()){
        //     System.out.println((String)e.getKey()+" -> "+(ArrayList)e.getValue());
        // }
       
        for(String unitCompound : compounds){
            if(!parsed.contains(unitCompound))
            countBowl(unitCompound);
            parsed +=" "+unitCompound;
            
        }
        System.out.println(count);
	}
}

