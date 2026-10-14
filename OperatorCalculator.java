import java.util.Scanner;
import java.text.DecimalFormat;
public class Solution {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner input = new Scanner(System.in);
			    DecimalFormat df= new DecimalFormat("0.00");
			    
				double num1 = input.nextDouble();
				double num2 = input.nextDouble();
				char operator = input.next().charAt(0);
				double result;
				
				
				if (operator == '+') {
					result = num1 + num2;
				    System.out.println(df.format(num1) + " " + operator + " " + df.format(num2) + " " + "=" + df.format(result));
					}
				else if (operator == '-') {
				    result = num1 - num2;
				    System.out.println(df.format(num1) + " " + operator + " " + df.format(num2) + " " + "=" + df.format(result));
				    } 
				else if (operator == '*') {
				   result = num1 * num2;
				   	System.out.println(df.format(num1) + " " + operator + " " + df.format(num2) + " " + "=" + df.format(result));
				    } 
				else if (operator == '/') {
				if (num2 == 0) {
				     System.out.println("Error: Division by zero is not allowed.");
				     } else {
				    	 result = num1 / num2;
				     System.out.println(df.format(num1) + " " + operator + " " + df.format(num2) + " " + "=" + df.format(result));
				            }
				        }else {
				            System.out.println("Error: Invalid operator.");
				        }
     
	}

}

