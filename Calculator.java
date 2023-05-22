package Maths;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String yn;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the First Number");
			int num1 = s.nextInt();
			System.out.println("Enter the Second number");
			int num2 = s.nextInt();
			
			System.out.println("Select Symbol(+,-,*,/)");
			String Sym=s.next();
			int res;
			switch (Sym) {
				case "+":
					res = num1+ num2;
					System.out.println("Addition is :"+res);
					break;
				case "-":
					res = num1 - num2;
					System.out.println("Subtraction is :"+res);
					break;
				case "*":
					res = num1 * num2;
					System.out.println("multiplication is :"+res);
					break;
				case "/":
					res = num1 / num2;
					System.out.println("Divison is :"+res);
					break;
					
				default :
						System.out.println("Invalid Symbol");
						break;
						
			
			}
			System.out.println("Do you want to continue (press yfor yes and n for No) ");
			yn = s.next();
			
			
		}while(yn.equals("y")||yn.equals("n"));

	}

}
