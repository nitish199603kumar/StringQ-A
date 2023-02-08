package nonrepeatedcharacterinstring;

public class NonRepeatedCharacter {

	public static void main(String[] args)
	{
		String st = "AABCDBEE";

		for (int i = 0; i < st.length(); i++)
		{
			boolean unique = true;
			System.out.println("i : " +i);
			System.out.println();
			System.out.println("********** "+i);
			
			for (int j = 0; j < st.length(); j++) 
			{
				System.out.println("j : " +j );
				
				if (i != j && st.charAt(i) == st.charAt(j))
				{
					unique = false;
					break;
				}
			}
			if (unique) 
			{
				System.out.print("Unique Char : "+st.charAt(i));
				System.out.println();
				
			}
		}
	

	}

}
