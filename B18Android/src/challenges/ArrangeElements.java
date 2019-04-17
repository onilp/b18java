package challenges;

import java.util.Arrays;

public class ArrangeElements {

	static int temp=0;
	
	public static void main(String [] args)
	{
		
		int [] arr = {2,3,1,9,8};
		int [] arr1 = {9,6,4,2,1,7};
		
		
		arrangeAscending(arr);
		//arrangeAscending(arr1);
		
		
		
		
	}
	public static void arrangeAscending(int [] array)
	{
		for (int i=0; i < array.length - 1; i++)
		{
			for (int j=i+1; j < array.length; j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				else
					continue;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	
}


//one element, compare it to next element. if the first element is greater, put it after the second element

// arr = {2,3,1,9,8}
