package hackerRank;
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
