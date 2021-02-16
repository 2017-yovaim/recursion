package homework;

public class Problems2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//separated my solutions to make it easier on myself
		
		//hard-coded this for ease of testing
		int[] arr = {0, 0, 1, 2, 4, 5, 7, 8, 8, 10, 12, 32, 45, 56, 88, 100};
		int[] arr1 = {4, 4, 8, 8, 16, 20, 24, 28, 32, 36};
		int n = arr.length;
		
		System.out.println(nod(3, 6));
		
		System.out.println("The nod of the whole array is: " + nodArray(arr, 0, arr[0]));
		System.out.println("The nod of arr1 is: " + nodArray(arr1, 0, arr1[0]));
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
