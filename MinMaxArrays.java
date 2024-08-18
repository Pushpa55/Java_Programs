package programs.com;

import java.util.Arrays;

public class MinMaxArrays {
	
	public static void main(String[] args) {
		
		int a[]={1,9,2,6,4,8,3,7,5};
		
		int min = Arrays.stream(a).min().getAsInt();
		
		System.out.println("Minimum Element :"+min);
		
		int max = Arrays.stream(a).max().getAsInt();
		
		System.out.println("Maximum Element :"+max);
	}

}
