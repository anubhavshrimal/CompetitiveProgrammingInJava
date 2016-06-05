package hackerRank;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LisasWorkbook {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
	    int n =sc.nextInt();
	    int k =sc.nextInt();
	    int t[] = new int[n];
	    
	    for(int i = 0; i < n; i++){
	    	t[i] = sc.nextInt();
	    }
	    
	    int count = 0;
	    int temp;	    
	    int endIndx = 0;
	    int startIndx;
	    int startQue, endQue;
	    
	    for(int i = 0; i < n; i++){
	    	startIndx = 1 + endIndx;	   	   
		    endIndx += Math.ceil((t[i]*1.0)/k);
		    temp = 0;
		    
		    while(startIndx <= endIndx){			    
			    startQue = temp * k + 1;
			    endQue = Math.min(startQue + k - 1, t[i]);
			    
			    if(startIndx >= startQue && startIndx <= endQue)
			    {
			    	count++;			    			    
			    	startIndx++;
			    	temp++;			    	
			    }
			    else{
			    	startIndx++;
			    	temp++;
			    }
		    }		    
	    }    	    
	    out.println(count);
	    
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
