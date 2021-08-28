package stringclass;

public class M2_5_equalsIgnoreCase {

	public static void main(String[] args) {
		
		//equalsIgnorecase take only String as argument 
		String s1="abc";
		System.out.println("String literal \"abc\" and String literal \"ABC\" are equal : " +s1.equalsIgnoreCase("ABC"));
       
		String s2="ven";
		System.out.println("String literal \"ven\" and String Object \"VEN\" are equal  : " +s2.equalsIgnoreCase(new String("VEN")));
	}

}
