package exercise2;
import java.util.*;

public class ElectricCityBill {

	public static void main(String[] args) {
		Scanner bill=new Scanner(System.in);
		System.out.println("Enter your id, name & units consumed");
		int id=bill.nextInt();
		String name=bill.next();
		int unit=bill.nextInt();
		float amount = 0;
		System.out.println("Customer IDNO :"+id);
		System.out.println("Customer Name :"+name);
		System.out.println("unit Consumed :"+unit);
		if(unit==0) {
			amount=100;
		}
		else if(unit<=199) {
			amount=(float) (unit*1.20);
			System.out.println("Amount Charges @Rs. 1.20 per unit :"+(int)amount);
		}
		else if(unit>=200 && unit<=399) {
			amount=(float) (unit*1.50);
			System.out.println("Amount Charges @Rs. 1.50 per unit :"+(int)amount);
		}
		else if(unit>=400 && unit<=599) {
			amount=(float)(unit*1.80);
			System.out.println("Amount Charges @Rs. 1.80 per unit :"+(int)amount);
		}
		else {
			amount=(float)(unit*2.00);
			System.out.println("Amount Charges @Rs. 2.00 per unit :"+(int)amount);
		}
		if(amount>400) {
			float surchage=(float) (0.15*amount);
			System.out.println("Surchage Amount :"+surchage);
			amount=amount+surchage;
		}
		System.out.println("Net Amount to be Paid By the Customer :"+(int)amount);
	}

}
