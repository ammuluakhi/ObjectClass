package ObjectClass;
import java.util.Scanner;
public class LeapYearCalulationsdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month");
int month=sc.nextInt();
System.out.println("Enter the year");
int year=sc.nextInt();
switch(month) {
case 4:
case 6:
case 9:
case 11:
	System.out.println("This month has 30 days");
	break;
case 1:
case 2:
case 3:
case 5:
case 7:
case 8:
case 12:
	System.out.println("This month has 31 days");
	break;
	if (year % 4==0 && year %100!=0 ||(year%400==0)) {
		System.out.println("This month has 29 days");
	}
	else {
System.out.println("This month has 28 days");
}
	break;
	default: System.out.println("Invalid input");
	}
	}




