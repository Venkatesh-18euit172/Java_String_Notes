package stringclass;

public class M2_6_contentEquals {

	public static void main(String[] args) {
		
		//contentEquals take String,StringBuffer,StringBuilder as argument
		String s1="abc";
		System.out.println("String literal \"abc\" and String literal \"abc\" are equal  : " +s1.contentEquals("abc"));
		System.out.println("String literal \"abc\" and StringBuffer \"abc\" are equal  : " +s1.contentEquals(new StringBuffer("abc")));
		System.out.println("String literal \"abc\" and StringBuilder \"abc\" are equal  : " +s1.contentEquals(new StringBuilder("abc")));
		System.out.println("String literal \"abc\" and StringBuffer \"abc\" are not equal  : " +s1.contentEquals(new StringBuffer("abcd"))+"\n");
		
		//Difference b/w equals and contentEquals
		System.out.println("Testing String using contentEquals : " +s1.contentEquals(new StringBuffer("abc")));
		System.out.println("Testing String using equals : " +s1.equals(new StringBuffer("abc"))+"\n");
		
		System.out.println("conentEquals check only content are same but equals uses Object");
	}

}
