package assignment;
import java.util.*;
public class MoveZeros {
//Given an array {0,2,0,1,0,2,1,2,1,0} move all zeros to right {2,1,2,1,2,1,0,0,0,0}

	static void moveZerosToRight(int [] arr)
	{
		int [] temp = new int[arr.length];
		int index = 0;
		//System.out.println(Arrays.toString(arr1));
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				continue;
			else
				temp[index]=arr[i];
				index++;
		}
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String [] args)
	{
		int [] array = {0,2,0,1,0,2,1,2,1,0};
		int [] array1 = {1,0,0,2,3,4,5,};
		int [] array2 = {0,0,0,0,0,0,1,-2,-5,0,10,34545,65,123,0,100,0};
		moveZerosToRight(array);
		moveZerosToRight(array1);
		moveZerosToRight(array2);
	}
	
	/**
	 * Original Array				Temp Array
	 * 
	 * 0,2,0,1,0,2,1,2,1,0 		0,0,0,0,0,0,0,0,0,0	
	 * 0,2,0,1,0,2,1,2,1,0		2,0,0,0,0,0,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0		2,0,0,0,0,0,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0		2,1,0,0,0,0,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0		2,1,0,0,0,0,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0 		2,1,2,0,0,0,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0 		2,1,2,1,0,0,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0 		2,1,2,1,2,0,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0 		2,1,2,1,2,1,0,0,0,0
	 * 0,2,0,1,0,2,1,2,1,0 		2,1,2,1,2,1,0,0,0,0
	 * 
	 **/
	
}
