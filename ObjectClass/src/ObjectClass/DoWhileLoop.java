package ObjectClass;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double number, sum = 0.0;
	      Scanner input = new Scanner(System.in);

	      do {
	    	 System.out.print("Enter a number: ");
	    	 number = input.nextDouble();
	    	 sum += number;
	      } while (number != 0.0);
		   
	      System.out.println("Sum = " + sum);
	   }
	}



