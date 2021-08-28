package stringclass;

public class M3_9_indexOf {

	public static void main(String[] args) {
		
		String s="venkatesh";
		
		//Argument int ch
		System.out.println(s.indexOf('k'));
		System.out.println(s.indexOf(97));
		
		//Argument String str
		System.out.println(s.indexOf("kat"));
		
		//Argument (int ch,int fromIndex)
		System.out.println(s.indexOf('e',2));
		System.out.println(s.indexOf(101,2));
		
		//Argument (int ch,int fromIndex)
		System.out.println(s.indexOf("kat",2));		
		
	}
}
