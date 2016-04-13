package hackerRank;
/*Given an integer, NN, traverse its digits (dd1,dd2,...,ddn) and determine how many digits evenly divide NN (i.e.: count the number of times NN divided by each digit ddi has a remainder of 00). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for N=111N=111, the answer is 33).

Input Format

The first line is an integer, TT, indicating the number of test cases. 
The TT subsequent lines each contain an integer, NN.

Constraints 
1≤T≤151≤T≤15 
0<N<1090<N<109
Output Format

For every test case, count and print (on a new line) the number of digits in NN that are able to evenly divide NN.*/

import java.io.*;
import java.util.*;
 
public class FindDigits {

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
	    int t=sc.nextInt();
	    int n,count,d;
	    int temp;
	    while(t-->0)
	    {
	    	count=0;
	    	n=sc.nextInt();
	    	temp=n;
	    	while(temp!=0)
	    	{
	    		d=temp%10;
	    		temp/=10;
	    		if(d==0)
	    			continue;
	    		else
	    		{
	    			if(n%d==0)
	    				count++;
	    		}
	    	}
	    	out.println(count);
	    }
	    out.close();  

	}
	   
	//-----------PrintWriter for faster output---------------------------------
	   public static PrintWriter out;
	   
	 //-----------MyScanner class for faster input----------
	   public static class MyScanner {
	      BufferedReader br;
	      StringTokenizer st;
	 
	      public MyScanner() {
	         br = new BufferedReader(new InputStreamReader(System.in));
	      }
	 
	      String next() {
	          while (st == null || !st.hasMoreElements()) {
	              try {
	                  st = new StringTokenizer(br.readLine());
	              } catch (IOException e) {
	                  e.printStackTrace();
	              }
	          }
	          return st.nextToken();
	      }
	 
	      int nextInt() {
	          return Integer.parseInt(next());
	      }
	 
	      long nextLong() {
	          return Long.parseLong(next());
	      }
	 
	      double nextDouble() {
	          return Double.parseDouble(next());
	      }
	 
	      String nextLine(){
	          String str = "";
		  try {
		     str = br.readLine();
		  } catch (IOException e) {
		     e.printStackTrace();
		  }
		  return str;
	      }

	   }
}
