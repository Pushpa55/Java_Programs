package programs.com;

public class CountVowelsAConsonants {
	
	public static void main(String[] args) {
		
		String s="Pushpa";
		
		vowelsConsonantCount(s);
	}

	public static void vowelsConsonantCount(String str) {
		
		int vowels=0;
		
		int consonants=0;
		
		str = str.toLowerCase();
		
		for(char c : str.toCharArray())
		{
			if(c>='a' && c<='z')
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
		}
		System.out.println(vowels);
		
		System.out.println(consonants);
		
	}

}
