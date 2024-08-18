package programs.com;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int a[]={11,22,33,44,55};
		
		System.out.println("Before Reverse");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("After Reverse");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
