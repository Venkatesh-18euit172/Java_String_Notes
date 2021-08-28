package stringclass;

public class M2_7_matches {
     
	//Matches take Regular Expression as argument 
	//matches is same as Pattern.matches(regex,str)
	public static void main(String args[])
	{
		String s1="12345";
		System.out.println("String \"12345\" is matched to Regex \"\\d{5}\" : " +s1.matches("12345"));
		
		String s2="abcde";
		System.out.println("String \"abcde\" is matched to Regex \"\\w{5}\" : " +s2.matches("\\w{0,5}"));
  }
}
