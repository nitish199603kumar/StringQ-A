package equalmethod;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Sachin";
		String s2="sachin";
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.equals(s2));			 //false
		System.out.println(s1==s2);                  //false
		System.out.println(s1==s1);					//true
	}

}
