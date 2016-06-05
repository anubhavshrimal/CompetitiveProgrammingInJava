package codeForces;

import java.util.Scanner;

public class TheatreSquare {

	public static void main(String[] args) {
		    double n,m,a,l,b;
		    Scanner sc=new Scanner(System.in);
		    n=sc.nextLong();
		    m=sc.nextLong();
		    a=sc.nextLong();
		    l=Math.ceil(n/a);
		    b=Math.ceil(m/a);
		    System.out.println((long)(l*b));
	}

}
