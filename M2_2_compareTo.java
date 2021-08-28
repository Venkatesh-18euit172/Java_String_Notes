package stringclass;

public class M2_2_compareTo {

	public static void main(String[] args) {
		
		//Same String 
	    System.out.println("Both the Strings(\"ab,ab\") are == : " + "ab".compareTo("ab")+"\n");
	    
	    //First String > Second String
	    System.out.println("First String(z) >> than Second String(a) gives +VE value :  " + "z".compareTo("a"));
	    System.out.println("Gives ascii difference between first non-equal character. Here (z-a) --> (122-97)"+"\n");
	    
	   //First String < Second String
	    System.out.println("First String(a) << than Second String(z) gives -VE value :  " + "a".compareTo("z"));
	    System.out.println("Gives ascii difference between first non-equal character. Here (a-z) --> (97-122)"+"\n");
	    
	    //Return (length of first String) - (length of Second String) if one String is the prefix of other String 
	    System.out.println("(length of first String(abcdef)) - (length of Second String(abc) : " + "abcdef".compareTo("abc"));
	    System.out.println("(length of first String(abc)) - (length of Second String(abcdef) : " + "abc".compareTo("abcdef"));
	    System.out.println("If one String is a prefix of other return difference in length");
	   
	}

}
