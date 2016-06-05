package topCoder;

/*Problem Statement
    
Vasa likes to construct sequences of numbers. If you tell him a positive integer n, he will begin a new sequence by writing the integer n as its first element. He will then repeat the following steps:
If the last number in his sequence is a prime, he terminates the sequence.
If he already wrote n elements without finding a prime, he becomes bored and leaves.
Otherwise, he computes the next element of the sequence as the sum of squares of digits of the last element. For example, 4001 will be followed by 4^2 + 0^2 + 0^2 + 1^2 = 17, and 17 will be followed by 1^2 + 7^2 = 50.
Find out what happens for the given int n. If Vasa eventually becomes bored and leaves, return -1. Otherwise, return the length of the generated sequence.
Definition
    
Class:
ExploringNumbers
Method:
numberOfSteps
Parameters:
int
Returns:
int
Method signature:
int numberOfSteps(int n)
(be sure your method is public)

Notes
-
A prime number is a positive integer with exactly two positive integer divisors: 1 and itself. The first few primes are 2, 3, 5, 7, 11. Note that 1 is not a prime.
Constraints
-
n will be between 1 and 10^9, inclusive.
Examples
0)
5
Returns: 1
The input itself is a prime.
1)  
57
Returns: 4
2)
12366
Returns: -1
For n=12366 there are no primes among the first 12366 elements of Vasa's sequence.
Vasa will write down 57, 74 (= 5^2 + 7^2), 65 (= 7^2 + 4^2), and 61 (= 6^2 + 5^2). Number 61 is a prime.*/

public class ExploringNumbers {
	
	public static int sumSquareDigits(int n) {
	    if (n < 10) return (int)Math.pow(n, 2);
	    return (int)((Math.pow((n % 10), 2)) + sumSquareDigits(n/10));
	    }
	
	boolean isPrime(int n)
	{
	    // Corner cases
	    if (n <= 1)  return false;
	    if (n <= 3)  return true;
	 
	    // This is checked so that we can skip 
	    // middle five numbers in below loop
	    if (n%2 == 0 || n%3 == 0) return false;
	 
	    for (int i=5; i*i<=n; i=i+6)
	        if (n%i == 0 || n%(i+2) == 0)
	           return false;
	 
	    return true;
	}
	
	public int numberOfSteps(int n)
	{
		int count=1;
		if(isPrime(n))
		{
			return 1;
		}
		else
		{
			int num=n;
			while(count<n)
			{
				count++;
				num=sumSquareDigits(num);
				if(isPrime(num))
				{
					return count;
				}
			}
			return -1;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
