package assignment;
import java.util.*;
public class IdentifyCommonElements {

//Program to identify common elements in two arrays [12,23,41,1,7] [3,34,41,8,90]	
		/**	
		for (int i=0; i < a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
					System.out.println(a[i]);
			}
		}
		**/	
		static void findCommonElements(int[]a,int[]b)
		{
			int count=0;
			if(a.length==0 || b.length==0)
				System.out.println("There is no common element within given arrays.");
			
			Map<Integer,Integer> map = new HashMap<>();
			
			for(int i=0;i<a.length;i++)
			{
				map.put(i, a[i]);
			}
			//System.out.println(Arrays.asList(map));
			
			for(int j=0; j<b.length; j++)
			{
				if(map.containsValue(b[j]))
				{
					count++;
					System.out.println(b[j]);
				}
				if(count==0 && j == b.length-1)
					System.out.println("There is no common element within given arrays.");
			}
		}
		public static void main(String [] args)
		{
			int [] a = {12,23,41,1,7};
			//int [] b = {3,34,41,8,90};
			//int [] c = {3};
			//int [] d = {};
			int [] e = {3455,6,1,23};
			//findCommonElements(a,b);
			//findCommonElements(b,c);
			//findCommonElements(c,d);
			findCommonElements(a,e);
		}
		
}
		/**
		 * a = {12,23,41,1,7}		b = {3,34,41,8,90}
		 * 
		 *   map
		 *   
		 * [{0=12,					if 3 is in map?		No. Do nothing
		 *   1=23,					if 34 is in map?	No. Do nothing
		 *   2=41,					if 41 is in map?	Yes. Print it
		 *   3=1,					if 8 is in map?		No. Do nothing
		 *   4=7 }]					if 90 is in map?	No. Do nothing
		 * 
		 */

