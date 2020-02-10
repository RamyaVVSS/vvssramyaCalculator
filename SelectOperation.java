package maven.calculator;

import java.util.Scanner;

public class SelectOperation {
	public static void main(String[] args){
		boolean val=true;
		Scanner sc=new Scanner(System.in);
		while(val){
			
			System.out.println("Operations that can be performed are:");
			System.out.println("+");
			System.out.println("-");
			System.out.println("*");
			System.out.println("/");
			
			System.out.println("Enter the numbers:");
			double num1=sc.nextDouble();
			double num2=sc.nextDouble();
			
			System.out.println("Select an operation");
			char opt=sc.next().charAt(0);
			double res=0;
			char cont;
			Calculator cal=new Calculator();
			
			switch(opt){
				case '+':
					res=cal.addition(num1, num2);
					System.out.println("Sum: "+res);
					System.out.println("Do you want to continue? (Y/N)");
					cont=sc.next().charAt(0);
					if(cont == 'Y'||cont == 'y'){
						val=true;
						break;
					}else{
						val=false;
						break;
					}
				
				case '-':
					res=cal.subtraction(num1, num2);
					System.out.println("Difference: "+res);
					System.out.println("Do you want to continue? (Y/N)");
					cont=sc.next().charAt(0);
					if(cont == 'Y'||cont == 'y'){
						val=true;
						break;
					}else{
						val=false;
						break;
					}
					
				case '*':
					res=cal.multiplication(num1, num2);
					System.out.println("Product: "+res);
					System.out.println("Do you want to continue? (Y/N)");
					cont=sc.next().charAt(0);
					if(cont == 'Y'||cont == 'y'){
						val=true;
						break;
					}else{
						val=false;
						break;
					}
					
				case '/':
					res=cal.division(num1, num2);
					System.out.println("Quotient: "+res);
					System.out.println("Do you want to continue? (Y/N)");
					cont=sc.next().charAt(0);
					if(cont == 'Y'||cont == 'y'){
						val=true;
						break;
					}else{
						val=false;
						break;
					}
					
				default:
					System.out.println("Invalid operator!");
					System.out.println("Do you want to continue? (Y/N)");
					cont=sc.next().charAt(0);
					if(cont=='Y'||cont=='y'){
						val=true;
						break;
					}else{
						val=false;
						break;
					}
			}
		}
	}
}
