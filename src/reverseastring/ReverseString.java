package reverseastring;

public class ReverseString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="nitish";
		char[] chArr=str.toCharArray();
		String revWord="";
		System.out.println("Original String :"+str);
		
		for(int i=chArr.length-1;i>=0;i--)
		{
			revWord=revWord+chArr[i];
		}
		System.out.println("Reverse Word :"+revWord);
//		System.out.println("Original String :"+str);
//		String revString="";
//		for (int i=str.length()-1;i>=0;i--)
//		{
//			revString=revString+str.charAt(i);
//		}
//		System.out.println("Reverse String: "+revString);
	}
		

}
