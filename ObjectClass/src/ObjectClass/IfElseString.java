package ObjectClass;
import java.util.Scanner;
public class IfElseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name ="";
System.out.println("Enter Your Name:");
name=sc.next();
if(name.equals("Rajitha")) {
	System.out.println("You are the Queen ");
}
	else if (name.equals("srija")) {
		System.out.println("you ar the next Queen");
	}
	else {
		System.out.println("you are nothin");
	}
	}

}
