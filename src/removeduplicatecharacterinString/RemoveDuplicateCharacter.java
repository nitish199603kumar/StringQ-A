package removeduplicatecharacterinString;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Nitish";
		
		StringBuilder sb=new StringBuilder();
		Set<Character> st=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			st.add(str.charAt(i));
		}
		for(Character c:st)
		{
			sb.append(c);
		}
		System.out.println("After Remove Duplicate Character :"+sb);
		
//		char[] arr=str.toCharArray();
//		StringBuilder sb=new StringBuilder();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			boolean repeated=false;
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					repeated =true;
//					break;
//				}
//			}
//			if(!repeated)
//			{
//				sb.append(arr[i]);
//			}
//		}
//		System.out.println("Reverse String :"+sb);
//		
	}

}
