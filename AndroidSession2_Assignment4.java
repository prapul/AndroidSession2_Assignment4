package prapul;
import java.util.Scanner;

public class AndroidSession2_Assignment4 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner inputTaker = new Scanner(System.in);
		System.out.println("Insert the value of the first number");
		a = inputTaker.nextInt();
		System.out.println("Insert the value of the second number");
		b = inputTaker.nextInt();
		System.out.println("Insert the value of the third number");
		c = inputTaker.nextInt();
		if (a>b && a>c)
		{
			System.out.println(a+" is the greatest number");
		}
		else if (b>a && b>c)
		{
			System.out.println(b+" is the greatest number");
		}
		else
			System.out.println(c+" is the greatest number");
		
		

	}

}
