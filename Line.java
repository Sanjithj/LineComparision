package com.bridgelabz;

import java.util.Scanner;

public class Line {

		public static void main(String[] args) {
			
			System.out.println("Welcome to line comparision");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter x1= ");
			double x1=sc.nextDouble();
			System.out.println("Enter y1= ");
			double y1=sc.nextDouble();
			System.out.println("Enter x2= ");
			double x2=sc.nextDouble();
			System.out.println("Enter y2= ");
			double y2=sc.nextDouble();
			double line1=  Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2- y1),2));
			System.out.println("Length of the line1 "+line1);
			

			System.out.println("Enter p1: ");
			int p1= sc.nextInt();
			System.out.println("Enter q1: ");
			int q1=sc.nextInt();
			System.out.println("Enter p2: ");
			int p2= sc.nextInt();
			System.out.println("Enter q2: ");
			int q2= sc.nextInt();
			double Line2= Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
			System.out.println("length of Line2: "+Line2);
			//boolean ans = Line1.equals(Line2);
			if(line1==Line2)
				System.out.println("Both lines are equal");
			else
				System.out.println("Both lines are not equal");
			
			int res = line1.compareTo(Line2); if(res > 0) System.out.
			  println("Length of first end points is greater than length of second end points"  );
			else if(res < 0) System.out.
			  println("Length of first end points is less than length of second end points" );
			 else System.out.println("Both lines are equal.");
			 
	    	}
}
