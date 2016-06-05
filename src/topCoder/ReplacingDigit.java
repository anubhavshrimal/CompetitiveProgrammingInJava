package topCoder;
/*
Problem Statement
    
Vasa is a shopkeeper in the small town Deronje. Currently, there are some items for sale in his store. The price of each item is a positive integer. You are given these prices in the int[] A. Each item has a price tag.
Vasa has just learned that a very rich shopper is going to visit his store. Therefore, Vasa wants to alter some of the price tags to make the items in his store more expensive.
Vasa has a collection of stickers. Each of those stickers contains a single digit between 1 and 9, inclusive. Note that he has no stickers with zeros. You are given the description of Vasa's stickers in the int[] D. For each i between 1 and 9, inclusive, Vasa has D[i-1] stickers with the digit i.
Vasa can take any sticker and use it to replace any digit on any price tag. However, there is no extra room on the price tags, so he cannot add new digits, he can only replace existing ones.
Compute and return the maximum total cost of items in Vasa's store after he applies some (possibly none, possibly all) of his stickers to the current price tags.
Definition
    
Class:
ReplacingDigit
Method:
getMaximumStockWorth
Parameters:
int[], int[]
Returns:
int
Method signature:
int getMaximumStockWorth(int[] A, int[] D)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Stack limit (MB):
256
Constraints
-
A will contain between 1 and 50 elements, inclusive.
-
Each element of A will be between 1 and 10^6, inclusive.
-
D will contain exactly 9 elements.
-
Each element of D will be between 0 and 10^3, inclusive.
Examples
0)

    
{100, 90}
{0, 0, 0, 0, 2, 1, 0, 0, 0}
Returns: 745
Vasa has two digit stickers with digit 5 written on them, and one digit sticker with digit 6 written on it. There are two items in 
the shop: one with price 100, and the other one with price 90.
Vasa can use one digit sticker with 5 to replace digit 0 of price tag 90 obtaining a new price of 95 of that item. 
Then, he can use the remaining stickers 5 and 6 to change the price tag of the other item from 100 to 650. In that case,
 the worth of his stock would be 650 + 95 = 745.
Note that the same stock worth could be obtained by applying all the three digit stickers to 100 in order to obtain a new 
price of 655. In that case, the price 90 of the other item would remain unchanged.
1)

    
{9}
{1, 1, 1, 1, 1, 1, 1, 1, 0}
Returns: 9
In this example, the maximum stock worth is obtained by leaving the price tag unchanged. Note that Vasa is not required to use all stickers.*/

public class ReplacingDigit {
	int count=0;
	private void countingSort(int a[],int size,int exp)
	{
		count=0;
		int temp[]=new int[10];
		int sortedArray[]=new int[size];
		
		for(int i=0;i<size;i++)
			temp[(a[i]/exp)%10]++;
		
		for(int i=1;i<=9;i++)
			temp[i]+=temp[i-1];
		
		for(int i=0;i<size;i++)
		{
			if(((a[i]/exp)%10)==0)
			{
				count++;	
			}
			sortedArray[temp[(a[i]/exp)%10]-1]=a[i];
			temp[(a[i]/exp)%10]--;
		}
		
		//copying sorted array to original array
		for (int i = 0; i < size; i++) 
			a[i]=sortedArray[i];
	}
	
	public int getMaximumStockWorth(int[] A, int[] D)
	{
		int max=0;
		for (int i = 0; i < A.length; i++) {
			if(A[i]>max)
				max=A[i];
		}
		int length = (int)(Math.log10(max));
		int exp=1;
		for(int i=1;i<=length;i++)
		{
			exp*=10;
		}
		
		countingSort(A, A.length, exp);
		int i=9;
		while(i>0)
		{
			if(D[i-1]>(A[count]/exp))
			{
				A[count]=Integer.parseInt(String.valueOf(i)+A[count]%exp);
				count++;
				D[i-1]--;
			}
			else
				i--;		
		}
		int sum=0;
		for(int j=0;j<A.length;j++)
			sum+=A[i];
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
