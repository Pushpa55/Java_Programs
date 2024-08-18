package programs.com;

public class MinMaxSumAvgArray {
	
	public static void main(String[] args) {
		
		int a[]={11,55,88,33,99,44,77,22,66};
		
		int min =a[0];
		
		int max=a[0];
		
		int sum=a[0];
		
		
		for(int i=1;i<a.length;i++)
		{
			sum=sum+a[i];
			
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		float avg=sum/a.length;
		
		System.out.println(min);
		
		System.out.println(max);
		
		System.out.println(sum);
		
		System.out.println(avg);
	}

}
