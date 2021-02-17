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
		
		System.out.println("\nEnter the power of 10 you want: ");
		int n1 = input.nextInt();
		printPower(1, n1, false);
		
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
		//solution to problem 3
		//which you showed
		
		if(n == 0)
		{
			return;
		}
		printLeft(n / 10);
		System.out.println(n % 10);
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
	
	public static void printPower(int k, int n, boolean hasPassedN)
	{
		//solution to problem 5
		//boolean used to remember if we've reached the Power of N
		//if no - we make k bigger until we reach it
		//if yes - we make k smaller until we reach 0, then the program stops
		if(k == 0)
		{
			return;
		}
		if(k < n && hasPassedN == false)
		{
			System.out.println(Math.pow(10, k));
			printPower(k + 1, n, false);
		}
		if(k == n)
		{
			System.out.println(Math.pow(10, k));
			printPower(k - 1, n, true);
		}
		if(k < n && hasPassedN == true)
		{
			System.out.println(Math.pow(10, k));
			printPower(k - 1, n, true);
		}
		
	}

}
