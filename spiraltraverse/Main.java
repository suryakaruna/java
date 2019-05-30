import java.util.Scanner;
// public class spiralTraverse{
public class Main{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int r= sc.nextInt();
	int c= sc.nextInt();
	int mat[][]=new int[r][c];
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			mat[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
// 	System.out.print(mat[i][j]+" ");
	int i=0,j=0;
	for(int in=0;in<r/2;in++){
		for(;j<c-in;j++)
			System.out.print(mat[i][j]+" ");
		for(i++,j--;i<r-in;i++)
				System.out.print(mat[i][j]+" ");
		for(i--,j--;j>=in;j--)
				System.out.print(mat[i][j]+" ");
		for(i--,j++;i>in+1;i--)
				System.out.print(mat[i][j]+" ");
	}
	}
}

