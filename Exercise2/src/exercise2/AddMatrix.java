package exercise2;
import java.util.*;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner add=new Scanner(System.in);
		System.out.println("Enter the row & column");
		int n=add.nextInt();
		int m=add.nextInt();
		int [][]a=new int[n][m];
		System.out.println("Enter the elements of First Matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int val=add.nextInt();
				a[i][j]=val;
			}
		}
		System.out.println("Enter the elements of Second Matrix");
		int [][]b=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int value=add.nextInt();
				b[i][j]=value;
			}
		}
		int [][]c=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
