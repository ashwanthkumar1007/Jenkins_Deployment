import java.util.*;
public class SimpleCalculator{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a,b,sum=0;
		System.out.println("Enter first number");
		a=scan.nextInt();
		System.out.println("Enter Second number");
		b=scan.nextInt();
		sum=a+b;
		System.out.println("The sum of Two Number is:"+sum);
	}	
}