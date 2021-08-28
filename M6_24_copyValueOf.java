package stringclass;

public class M6_24_copyValueOf {

	public static void main(String[] args) {
		char s1[]={'V','e','n','k','a','t','e','s','h'};
		
		String s2=String.copyValueOf(s1);

		System.out.println("Character array to String using copyValueOf:- "+s2);
		System.out.println("Character array to String using valueOf:- "+ String.valueOf(s1));
		
		System.out.println("Character array to String using copyValueOf(char[] a,int startindex,int len):- "+ String.copyValueOf(s1, 0, 6));
		System.out.println("Character array to String using valueOf(char[] a,int startindex,int len):- "+ String.valueOf(s1,0,6));

	}

}
