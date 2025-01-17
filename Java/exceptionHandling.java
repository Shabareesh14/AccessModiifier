import java.util.*;
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		try{
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = a/b;
		}
		
		catch(ArithmeticException b){
			System.out.println("Its Not a Error");
		}
		
		catch(InputMismatchException c){
			System.out.println("Error Handled");
		}
		
		System.out.println("Program Running");
	}
}
