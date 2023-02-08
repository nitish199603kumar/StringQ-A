package reverseeachwordinstring;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s=" is nitish ";
		
		System.out.println("Original String :" +s);
		String output="";
		String[] words=s.split(" ");
		for(String word:words)
		{
			String	revWord="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revWord=revWord+word.charAt(i);
			}
			output=output+revWord+" ";
		}
		
		System.out.println(" Character String :" +output );
	}

}
