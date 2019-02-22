package ObjectClass;
import java.util.Scanner;
public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double number, sum = 0.0;
	      Scanner input = new Scanner(System.in);
	      
	      for (int i = 1; i < 6; ++i) {
	         System.out.print("Enter a number: ");
	         number = input.nextDouble();
	         
	         if (number <= 0.0) {
	            continue;
	         }
	         
	         sum += number;
	      }
	      System.out.println("Sum = " + sum);
	   }
	}


