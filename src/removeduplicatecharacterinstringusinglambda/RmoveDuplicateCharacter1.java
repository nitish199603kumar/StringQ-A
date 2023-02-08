package removeduplicatecharacterinstringusinglambda;

import java.util.HashSet;

public class RmoveDuplicateCharacter1 {

	public static void main(String[] args) {
	
		String s="programming";
		
		StringBuilder sb=new StringBuilder();
		s.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
//		HashSet<Character> st=new HashSet<>();
//		
//		for(int i=0;i<s.length();i++)
//		{
//			st.add(s.charAt(i));
//		}
//		for(Character c:st)
//		{
//			sb.append(c);
//		}
//		
//		System.out.print(sb);
//		
//		char[] arr=s.toCharArray();
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<arr.length;i++)
//		{
//			boolean repeated=false;
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					repeated=true;
//					break;
//				}
//			}
//			if(!repeated)
//			{
//				sb.append(arr[i]);
//			}
//		}
//		System.out.println(sb);
				
	}

}
