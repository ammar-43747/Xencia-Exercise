package exercise2;
import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner fizz=new Scanner(System.in);
		System.out.println("Enter the ending number");
		int number=fizz.nextInt();
		for(int i=0;i<=number;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
