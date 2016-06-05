package codeForces;
//problem code 158A

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class NextRound {

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] =  new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		k = a[k-1];
		Arrays.sort(a);
		int i;
		for(i = 0; i < n; i++){
			if(a[i] >= k && a[i] != 0)
				break;
		}
		out.println(a.length-i);
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
