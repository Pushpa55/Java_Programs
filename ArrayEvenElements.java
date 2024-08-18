package programs.com;

import java.util.Arrays;

public class ArrayEvenElements {
	
	public static void main(String[] args) {
		
		int a[]={22,99,11,33,88,55,77,11,66,44};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
