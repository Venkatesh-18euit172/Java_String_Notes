package stringclass;

public class M2_8_regionMatches {

	public static void main(String[] args) {

		//regionMatches takes only String as argument
		String s1="abcdefgh";
		System.out.println(s1.regionMatches(0, "ooooabcdefghoooo", 4, 8));
		
		//Ignore case
		System.out.println(s1.regionMatches(true , 0, "ooooABCDEFGHoooo", 4, 8));
		
	}

}
