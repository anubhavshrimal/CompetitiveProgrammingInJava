package hackerRank;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
You are given NN sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following: 
3 2 2 6

The above step is repeated until no sticks are left.

Given the length of NN sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format 
The first line contains a single integer NN. 
The next line contains NN integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format 
For each operation, print the number of sticks that are cut, on separate lines.

Constraints 
1 ≤ N ≤ 1000 
1 ≤ ai ≤ 1000*/

public class CutTheSticks {

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    	arr[i]=sc.nextInt();	    	    
	    Arrays.sort(arr);
	    int remaining = 0;
	    int cut = arr[0];
	    
	    while(arr[n-1] > 0){
	    	remaining = 0;
	    	for(int i = 0; i < n; i++){
	    		if(arr[i] > 0)
	    		{
	    			cut = arr[i];
	    			break;	
	    		}
	    	}
		    for(int i = 0; i < n; i++){
		    	if(arr[i] > 0)
		    	{
		    		remaining++;
		    		arr[i] -= cut;		    		    					    		
		    	}		    			 
		    }
		    out.println(remaining);
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
