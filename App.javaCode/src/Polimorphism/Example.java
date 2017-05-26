package Polimorphism;

public class Example {

public static void main(String[] args) {
		
		Example obj1= new Example();
		obj1.add(25, 25);
		obj1.add(25, 25, 25);
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Total sum is"+c);
	}
	public void add(int a, int b,int d)
	{
		int c=a+b+d;
		System.out.println("Total sum is"+c);
	
	}
}
