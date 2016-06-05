package codeChef;

import java.io.*;
import java.util.*;
 
public class Kttable {

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
	    int t = sc.nextInt();
	    int n,count;
	    while(t-->0)
	    {
	    	count=0;
	    	n=sc.nextInt();
	    	int a[] = new int[n+1];
	    	int b[] = new int[n];
	    	a[0]=0;
	    	for(int i = 1; i < n+1; i++){
	    		a[i]=sc.nextInt();
	    	}
	    	for(int i = 0; i < n; i++){
	    		b[i]=sc.nextInt();
	    	}
	    	for(int i = 0; i < n; i++){
	    		if((a[i+1]-a[i]) >= b[i])
	    			count++;
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


