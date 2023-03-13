package exercise2;
import java.util.*;
public class PrintMatrix {

	public static void main(String[] args) {
		Scanner matrix=new Scanner(System.in);
		System.out.println("Enter the nof rows");
		int n=matrix.nextInt();
		System.out.println("Enter the nof columns");
		int m=matrix.nextInt();
		int [][]a=new int[n][m];
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int value=matrix.nextInt();
				a[i][j]=value;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
