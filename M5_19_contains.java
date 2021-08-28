package stringclass;

public class M5_19_contains {

	public static void main(String[] args) {
		
       String s1="venkatesh";
       
       System.out.println("String literals :- " + s1.contains("ven"));
       
       System.out.println("String Object :- " + s1.contains(new String("kat")));
       
       System.out.println("StringBuffer :- " + s1.contains(new StringBuffer("ven")));
       
       System.out.println("StringBuilder :- " + s1.contains(new StringBuilder("esh")));
	}

}
