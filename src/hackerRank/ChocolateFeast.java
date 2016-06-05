package hackerRank;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ChocolateFeast {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
	    int t=sc.nextInt();
	    int n, c, m;
	    int numChocoltes, numExtra, numWrappers;
	    
	    while(t-- > 0){
	    	n = sc.nextInt();
	    	c = sc.nextInt();
	    	m = sc.nextInt();
	    	numChocoltes = n / c;
	    	numWrappers = numChocoltes;
   	
	    	while(numWrappers / m > 0 || numWrappers % m == 0){
	    		numExtra = numWrappers/m;
	    		numWrappers = numWrappers % m + numExtra;
	    		numChocoltes += numExtra;
	    	}
	    	
	    	out.println(numChocoltes);
	    	
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
