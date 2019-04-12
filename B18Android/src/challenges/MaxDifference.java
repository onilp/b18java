package challenges;

public class MaxDifference {
	
	static int currentDifference =0, maxDifference = 0;
	
	public static void main(String[] args) {
		int [] arr = {1,2,6,4};
		
		int [] arr1 = {7,6,5,4,3,2,1,-9,9};
		
		System.out.println(calculateMaxDifference(arr1));
		
	}	
	public static int calculateMaxDifference(int [] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			for(int j =0; j < a.length-1; j++)
			{
				if(a[i]>a[j])
				{
					currentDifference = a[i]-a[j];
					
					if(currentDifference > maxDifference)
					{
						maxDifference = currentDifference;
					}
				}
				else
					break;		
			}
		}
		return maxDifference;
	}

}
/**
 * 	Naive Solution:
 * 	Using nested for loop
 * 
 * 	i = 1 , j = 0
 * 	if arr[i] is greater than arr[j], calculate and store the difference between them.
 * 		check if the current difference is greater than the maximum difference we get.
 * 			if it is, maximum difference becomes the current difference
 * 
 * 	
 *	if arr[i] is NOT greater than arr[j] , break out of the inner for loop and continue with the next element
 *
 * at the end of the outer loop, return maximum difference.
 * 		
 * 
 * 
 * 
 * 
 */

