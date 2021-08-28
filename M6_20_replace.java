package stringclass;

public class M6_20_replace {

	public static void main(String[] args) {
		
		String s="Happy";
		System.out.println("Replacing only characters :- "+s.replace('p', 'b'));
		System.out.println("Replacing only substring(String literal as argument)  :- "+s.replace("app", "ol"));
		System.out.println("Replacing only substring(String Object as argument)  :- "+s.replace(new String("app"), new String("ol")));
		System.out.println("Replacing only substring(StringBuffer as argument)  :- "+s.replace(new StringBuffer("app"), new StringBuffer("ol")));
		System.out.println("Replacing only substring(StringBuilder as argument)  :- "+s.replace(new StringBuilder("app"), new StringBuilder("ol")));
	}

}
