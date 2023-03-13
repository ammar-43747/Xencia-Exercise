package exercise2;
import java.util.*;

public class PersonalCourse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input the marks obtained in Physics :");
		int phy=input.nextInt();
		System.out.print("Input the marks obtained in Chemistry :");
		int che=input.nextInt();
		System.out.print("Input the marks obtained in Mathematics :");
		int math=input.nextInt();
		if(phy>=55 && che>=50 && math>=65 && phy+math+che>=180 ) {
			System.out.println("The candidate is eligible for admission.");
		}
		else {
			System.out.println("The candidate is not eligible for admission.");
		}
	}

}
