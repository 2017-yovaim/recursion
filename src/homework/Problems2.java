package homework;

public class Problems2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//separated my solutions to make it easier on myself
		
		//hard-coded for ease of testing
		int[] arr = {0, 0, 1, 2, 4, 5, 7, 8, 8, 10, 12, 32, 45, 56, 88, 100};
		int[] arr1 = {4, 4, 8, 8, 16, 20, 24, 28, 32, 36};
		int n = arr.length;
		
		System.out.println(nod(3, 6));
		
		System.out.println("The nod of the whole array is: " + nodArray(arr, 0, arr[0]));
		System.out.println("The nod of arr1 is: " + nodArray(arr1, 0, arr1[0]));
		
		System.out.println(isInArray(arr, n, 5));
		System.out.println(isInArray(arr, n, 9));
	}
	
	public static boolean isInArray(int[] arr, int n, int k)
	{
		//solution to Problem 6 - a method that checks whether a number is an element in an
		//integer array using binary search
		if(arr[n - 1] == k)
		{
			return true;
		}
		if(n == 1)
		{
			return false;
		}
		if(arr[n/2] > k)
		{
			int[] copy = new int[n / 2];
			for(int i = 0; i < copy.length; i++)
			{
				copy[i] = arr[i];
			}
			return isInArray(copy, n / 2, k);
		}
		else
		{
			int[] copy = new int[n / 2];
			for(int i = 0, j = (n / 2); i < copy.length; i++, j++)
			{
				copy[i] = arr[j];
			}
			return isInArray(copy, n/2, k);
		}
	}
	
	public static int nod(int a, int b)
	{
		//solution to Problem 7 - a method which finds the greatest common divisor of two numbers
		if(b == 0)
		{
			return a;
		}
		return nod(b, a%b);
	}
	
	public static int nodArray(int[] arr, int index, int nod)
	{
		//solution to Problem 8 - a method which finds the greatest common divisor of all the
		//elements in an array
		if(index == arr.length - 1)
		{
			return nod;
		}
		nod = nod(nod, arr[index]);
		return nodArray(arr, index + 1, nod);
	}

}
