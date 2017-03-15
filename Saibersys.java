package scdfsd;

import java.util.Scanner;

public class Saibersys {
		
public static void main (String[] args)

{
	int x,y,z;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the X value:");
	x = sc.nextInt();
	System.out.println("Enter the Y value:");
	y = sc.nextInt();
	System.out.println("Enter the Z value:");
	z = sc.nextInt();
	while(x>0 && y > 0  && z > 0)
	{
		if (x>y && x>z)
		System.out.println("X is greater");
		else if(y>x && y>z)	
		System.out.println("Y is greater");
		else if(z>x && z>y)	
		System.out.println("z is greater");
		else
		System.out.println("three are equal");
	}
	
	System.out.println("You are not allowed to enter 0");
	}
}

// user should enter two values like X and Y check if x is greater or Y
// user should enter three vales = 0 show x,y,z 
// x =2  y=3 z=9
// 