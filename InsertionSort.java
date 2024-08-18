package programs.com;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int a[]={22,55,11,77,44,99,66,33,88};
		
		System.out.println("Before Sort");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i;j<a.length-1;j++)
		    {
			   if(a[i]>a[j+1])
			   {
				   int temp=a[i];
				   
				   a[i]=a[j+1];
				   
				   a[j+1]=temp;
			   }
		    }
		}
		
		System.out.println("After Sort");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
	}
}
