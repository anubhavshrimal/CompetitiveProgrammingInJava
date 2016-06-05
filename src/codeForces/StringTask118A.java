package codeForces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StringTask118A {

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
		String word = sc.nextLine();
		char arr[] = word.toCharArray();
		word = "";
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case 'A':
				continue;
			case 'a':
				continue;
			case 'E':
				continue;
			case 'e':
				continue;
			case 'I':
				continue;
			case 'i':
				continue;
			case 'O':
				continue;
			case 'o':
				continue;
			case 'U':
				continue;
			case 'u':
				continue;		
			case 'Y':
				continue;		
			case 'y':
				continue;		
			}
			
			if(arr[i] < 97){
				char a = (char) (arr[i]+32);
				word = word+"."+a;
			}
			else
				word = word+"."+(arr[i]);
			
		}
		out.println(word);
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
