/*Little pig Benny has just taken a shower. Now she is going to buy some gifts for her relatives. But the problem is that Benny doesn't know how to reach to the gift shop. Her friend Mike has created a special set of instructions for her. A set of instructions is a string which consists of letters {'L', 'R', 'U', 'D'}.

For simplicity, let's assume that Benny is staying at point (0, 0) on the infinite plane. She consistently fulfills all the instructions written by Mike. Let's assume that now she is staying at point (X, Y). Then depending on what is the current instruction she moves in some direction:

'L' -- from (X, Y) moves to point (X, Y - 1)
'R' -- from (X, Y) moves to point (X, Y + 1)
'U' -- from (X, Y) moves to point (X - 1, Y)
'D' -- from (X, Y) moves to point (X + 1, Y)
The weather is cold because it's winter now. Initially, all points are snowy. But if Benny have already visited some point at any time this point becomes icy (because Benny has just taken a shower). Every time, when Benny makes a step into icy points she slips and falls down.

You are given a string S which denotes a set of instructions for Benny. Your task is to calculate how may times she will fall down.

Input format

Single line contains string S.

Output format

Output how many times Benny will fall down.

Constraints

1 ≤ |S| ≤ 105
1 ≤ |S| ≤ 1000 in test data worth 40% of all points
Sample Input(Plaintext Link)
 RRULDL
Sample Output(Plaintext Link)
 2*/

package hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class Benny_Gifts {

	public static void main(String[] args)
	{
		String s;
	    int slip=0;
	    int pos[][]=new int[10000][10000];
	    int x=5000;
	    int y=5000;
	    for (int[] row: pos)
	        Arrays.fill(row, 0);
	    pos[x][y]=1;
	    Scanner sc= new Scanner(System.in);
	    s=sc.nextLine();
	    char a[]=s.toCharArray();
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	switch(a[i])
	    	{
	    	case 'R': 	
	    		y++;
	    		if(pos[x][y]==1)
	    			slip++;
	    		else
	    			pos[x][y]=1;
	    		break;
	    		
	    	case 'L':
	    		y--;
	    		if(pos[x][y]==1)
	    			slip++;
	    		else
	    			pos[x][y]=1;
	    		break;
	    		
	    	case 'U':
	    		x--;
	    		if(pos[x][y]==1)
	    			slip++;
	    		else
	    			pos[x][y]=1;
	    		break;
	    		
	    	case 'D':
	    		x++;
	    		if(pos[x][y]==1)
	    			slip++;
	    		else
	    			pos[x][y]=1;
	    		break;
	    	}
	   
	    }
	    System.out.println(slip);
	    
	    	
	}

}
