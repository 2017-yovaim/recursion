package homework;

import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Your result is: " + sum(n));
		System.out.println("The sum of digits of the number is: " + sumOfDigits(n, 0));
		
		printLeft(n);
		printRight(n);
		
		
		
		
		
		input.close();
	}
	
	public static double sum(int n)
	{
		//solution to problem 1 - a method that sums all numbers from 0 to n
		if(n == 0)
		{
			return n;
		}
		else
		{
			return n + sum(n - 1);
		}
	}
	
	public static int sumOfDigits(int n, int sum)
	{
		//solution to problem 2 - a method that finds the sum of the digits of n
		if(n == 0)
		{
			sum += n;
			return sum;
		}
		else 
		{
			sum += n % 10;
			n /= 10;
			return sumOfDigits(n, sum);
		}
		
	}
	
	public static void printLeft(int n)
	{
		if(n / 10 <= 0)
		{
			System.out.println(n);
			return;
		}
		else
		{
			System.out.println(n / 10);
			printLeft(n / 10);
		}
	}
	
	public static void printRight(int n)
	{
		//solution to problem 4 - a method which prints out n's digits from right to left
		if(n / 10 <= 0)
		{
			System.out.print(n);
			return;
		}
		else
		{
			System.out.print(n % 10);
			printRight(n / 10);
		}
	}

}
