package exercise2;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner rev=new Scanner(System.in);
		System.out.println("Enter the word or number");
		String input=rev.next();
		for(int i=input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
	}

}
