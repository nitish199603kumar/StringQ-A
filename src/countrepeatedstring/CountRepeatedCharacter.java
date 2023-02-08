package countrepeatedstring;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedCharacter {

	public static void main(String[] args)
	{
		String st="nitish";
	//	
		Map<Character,Integer> map=new HashMap();
		
		char[] chars=st.toCharArray();
		for(char ch:chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				int count=map.get(ch);
				map.put(ch, count +1);
			}
		}
		System.out.println(map);
		
		
	}

}
