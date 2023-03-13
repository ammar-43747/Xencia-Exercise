package exercise2;
import java.util.*;

public class IndividualChars {

	public static void main(String[] args) {
		Scanner indi=new Scanner(System.in);
		System.out.println("Input the string");
		String str=indi.next();
		System.out.println("The character of string are :");
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("The characters of the reversed string are :");
		for(int j=str.length()-1;j>=0;j--) {
			System.out.print(str.charAt(j)+" ");
		}
	}

}
