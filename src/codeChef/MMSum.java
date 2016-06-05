package codeChef;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MMSum {

	//class to represent the set of result
	static class Res
	{
		public int start;	//start index of max sub array
		public int end;		//end index of max sub array
		public int maxSum;	//sum of max sub array
		
		public Res(int start,int end,int maxSum) 
		{
			this.start=start;
			this.end=end;
			this.maxSum=maxSum;
		}
	}
	
	//method to return the maximum sub array found
	public Res maxSubArray(int a[],int l,int r)
	{
		
		if(l==r)	//base case to stop the recursion
			return new Res(l,r,a[l]);
		
		int m=(l+r)/2;	//middle element
		Res left=maxSubArray(a, l, m);
		Res right=maxSubArray(a, m+1, r);
		Res crossOver=maxCrossOver(a, l, m, r);
		
		return maxOf(left,right,crossOver);	//return maximum sub array of the 3 sub arrays created 
	}
	
	//method to return the maximum sum object after comparing the sums
	private Res maxOf(Res left,Res right,Res crossOver)
	{
		if(left.maxSum>right.maxSum && left.maxSum>crossOver.maxSum)
			return left;
		else if(right.maxSum>left.maxSum && right.maxSum>crossOver.maxSum)
			return right;
		else
			return crossOver;
	}
	
	//finds the maximum sub array possible for the array passing through the mid point
	private Res maxCrossOver(int a[],int l,int m,int r)
	{
		int left_sum=Integer.MIN_VALUE;
		int right_sum=Integer.MIN_VALUE;
		int left=m,right=m;	
		int sum=0;
		
		//find the max sum from mid to left 
		for(int i=m;i>=l;i--)
		{
			sum+=a[i];
			if(sum>left_sum)
			{
				left_sum=sum;
				left=i;
			}			
		}
		
		sum=0;
		//find the max sum from mid to right
		for(int i=m+1;i<=r;i++)
		{
			sum+=a[i];
			if(sum>right_sum)
			{
				right_sum=sum;
				right=i;
			}			
		}
		return new Res(left,right,left_sum+right_sum);
	}
	
	public static void main(String[] args)
	{
		MyScanner sc = new MyScanner();
	    out = new PrintWriter(new BufferedOutputStream(System.out));
	    int t = sc.nextInt();
	    int n,min,sum;
	    Res res;
	    while(t-->0)
	    {
	    	n=sc.nextInt();
	    	sum=0;
	    	min=Integer.MAX_VALUE;
	    	int a[] = new int[n];	    	
	    	a[0]=0;
	    	for(int i = 0; i < n; i++){
	    		a[i]=sc.nextInt();
	    	}	    		    	
	    	res=new MMSum().maxSubArray(a, 0, a.length-1);
	    	sum=res.maxSum;
	    	if(res.start!=res.end){
	    		for(int i = res.start; i<= res.end; i++){
	    			if(a[i]<min)
	    				min=a[i];
	    		}
	    		if(min<0)
	    			sum=res.maxSum-min;
	    		if(res.start!=0){
	    			int b[] = a;
	    			for(int i =res.start-1; i < n-1; i++){
	    				b[i]=b[i+1];
	    				res=new MMSum().maxSubArray(a, 0, b.length-2);
	    				if(res.maxSum>sum)
	    					sum=res.maxSum;
	    			}
	    		}
	    		
	    		if(res.end!=n-1){
	    			int b[] = a;
	    			for(int i =res.end+1; i < n-1; i++){
	    				b[i]=b[i+1];
	    				res=new MMSum().maxSubArray(a, 0, b.length-2);
	    				if(res.maxSum>sum)
	    					sum=res.maxSum;
	    			}
	    		}
	    	}
	    	out.println(sum);
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
