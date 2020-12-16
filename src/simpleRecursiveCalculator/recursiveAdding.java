package simpleRecursiveCalculator;

import java.util.Scanner;

public class recursiveAdding {
	
	int sum = 0;
	
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 'multiply' or 'add' to decide what to perform on the numbers");
		String choice = s.next();
		System.out.println("Enter amount of numbers you want to use");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all of the numbers");
		for(int i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		
		if(choice.equalsIgnoreCase("multiply"))
		{
			recursiveAdding obj = new recursiveAdding();
			int x = obj.multiply(a, a.length, 0);
			System.out.println("The Product is " + x);
		}
		else if(choice.equalsIgnoreCase("add"))
		{
			recursiveAdding obj = new recursiveAdding();
			int x = obj.add(a, a.length, 0);
			System.out.println("The Sum is " + x);
		}
		
		
	}
	
	int add(int a[], int n, int i)
	{
		if(i < n)
		{
			return a[i] + add(a, n, ++i);
		}
		else
		{
			return 0;
		}
	}
	
	int multiply(int a[], int n, int i)
	{
		if(i < n)
		{
			return a[i] * add(a, n, ++i);
		}
		else
		{
			return 1;
		}
	}

}
