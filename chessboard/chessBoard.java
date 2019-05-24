/*
*
*/
import java.util.Scanner;
public class chessBoard
{
public static String board[][]=new String[8][8];
public static void display(String a[][]){
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            System.out.print(a[i][j]+"\t");
        }
        System.out.println();
		System.out.println();
    }
}

public static void displayOverlap(){ 
System.out.println("Case 3:");
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
			
			if(board[i][j].contains("K") && board[i][j].contains("$") ){
				
				System.out.print("OverLap"+"\t");
				
			}
			else
				System.out.print("|"+"\t");
        }
        System.out.println();
System.out.println();
}
}
public static void displayKnightAttKing(){
	int flag=0;
	for(int i=0;i<8;i++){
    for(int j=0;j<8;j++){
		if(board[i][j].contains("$") && board[i][j].contains("Ki")){
			board[i][j]=board[i][j].replace("Ki","");
			board[i][j]=board[i][j].replace("|","");
			flag=1;
			System.out.println("King attacking knight: "+board[i][j]);break;
		}
    }
	
	}
	if(flag==0)
		System.out.println("No Knight Attacks The King ");
}
public static void place(int x,int y,String s){
		if((x>=0 && x<8) && (y>=0 && y<8)){
				board[x][y]+= s;
		}
			
}
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int count_knight=sc.nextInt();
for(int i=0;i<8;i++){
    for(int j=0;j<8;j++){
        board[i][j]="|";
    }
}
for(int i=0;i<count_knight;i++){
   int x=sc.nextInt()-1;
   int y=sc.nextInt()-1;
   	if((x<0 || x>8) || (y<0 || y>8)){System.out.println("Invalid Input");System.exit(0);}
	board[x][y]+="($"+i+")";
   //moveKnight(x-1,y-1);
   place(x-2,y-1,"$"+i);
   place(x-2,y+1,"$"+i);
   place(x+2,y-1,"$"+i);
   place(x+2,y-1,"$"+i);
   place(x-1,y+2,"$"+i);
   place(x+1,y+2,"$"+i);
   place(x-1,y-2,"$"+i);
   place(x+1,y-2,"$"+i);
      
}
   int x=sc.nextInt()-1;
   int y=sc.nextInt()-1;
   if((x<0 || x>8) || (y<0 || y>8)){System.out.println("Invalid Input");System.exit(0);}
   
   board[x][y]+="Ki";
   
   place(x+1,y,"K");
   place(x-1,y,"K");
   place(x,y+1,"K");
   place(x,y-1,"K");
   place(x+1,y-1,"K");
   place(x-1,y-1,"K");
   place(x+1,y+1,"K");
   place(x-1,y+1,"K");
display(board);
displayOverlap();
displayKnightAttKing();

}
}
