package ObjectClass;
import java.util.Scanner;
public class IfScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
a=sc.nextInt();
System.out.println("Enter the second number");
b=sc.nextInt();
if(a==b) {
	System.out.println("numbers are equal");
}
System.out.println("numbers are not equal");
	}

}
