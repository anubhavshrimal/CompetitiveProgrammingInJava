package hackerRank;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;

import hackerRank.FindDigits.MyScanner;

/*Watson gives two integers (AA and BB) to Sherlock and asks if he can count the number of square integers between AA and BB (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format 
The first line contains TT, the number of test cases. TT test cases follow, each in a new line. 
Each test case contains two space-separated integers denoting AA and BB.

Output Format 
For each test case, print the required answer in a new line.

Constraints 
1≤T≤1001≤T≤100 
1≤A≤B≤109*/


//algorithm for sqrt
/*public static double sqrt(int n) {
	double low = 0.0;
	double high = (double)n+1;
	double mid;
    while ((high-low) > 0.00001) {
        mid = (low+high) / 2;
        if (mid*mid < n) {
            low = mid;
        }
        else {
            high = mid;
        }
    }
    return low;
}*/

public class SherlockAndSquares {

	
	
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
	    int t=sc.nextInt();
	    double a,b;
	    while(t-->0)
	    {
	    	a=Math.ceil(Math.sqrt(sc.nextInt()));
	    	b=Math.floor(Math.sqrt(sc.nextInt()));    
	    	out.println((int)(b-a+1));
	    }
	    out.close();

	}
	
	//-----------PrintWriter for faster output---------------------------------
	   public static PrintWriter out;
	   
}
