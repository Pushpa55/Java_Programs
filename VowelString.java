package programs.com;

public class VowelString {
	
	public static void main(String[] args) {
		
		String s="Aushpa";
		
		String str = s.toLowerCase();
		
		int count =0;
		
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.println("Given String Vowel is :"+str.charAt(i));
				
				count++;
			}
			
		}
		
		System.out.println("No.of Vowels are :"+count);
		
		
	}

}
