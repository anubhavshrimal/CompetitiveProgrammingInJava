package hackerRank;

import java.util.Scanner;

/*Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus; however, he also gives him a clue—a number, NN. Sherlock determines the key to removing the virus is to find the largest Decent Number having NN digits.

A Decent Number has the following properties:

Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
If there are more than one such number, we pick the largest one.
Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!

Constraints
1≤T≤201≤T≤20
1≤N≤1000001≤N≤100000


Input Format

The first line is an integer, TT, denoting the number of test cases.

The TT subsequent lines each contain an integer, NN, detailing the number of digits in the number.

Output Format

Print the largest Decent Number having NN digits; if no such number exists, tell Sherlock by printing -1.*/

public class SherlockAndTheBeast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		while(t-->0)
		{
			n=sc.nextInt();
			if(n<3)
				System.out.print("-1");
			else
			{
				if(n%3==0)
				{
					for(int i=0;i<n;i++)
					{
						System.out.print("5");				
					}					
				}
				else
				{
					int r=5;
					while(((n-r)%3)!=0)
						r+=5;
					
					if(n-r<3)
					{
						if(n%5==0)
						{
							for(int i=0;i<n;i++)
							{
								System.out.print("3");				
							}								
						}
						else
							System.out.print("-1");
					}
					else
					{
						for(int i=0;i<n-r;i++)
						{
							System.out.print("5");				
						}				
						for(int i=0;i<r;i++)
						{
							System.out.print("3");				
						}										
					}
				}				
			}
			System.out.println();
		}
	}
}
