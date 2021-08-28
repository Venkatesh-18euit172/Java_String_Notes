package stringclass;

public class M2_3_compareToIgnoreCase {

	public static void main(String[] args) {
		
		//Same String 
	    System.out.println("Both the Strings(\"ab,AB\") are == : " + "Hariharan".compareToIgnoreCase("vishvak")+"\n");
	    
	    //First String > Second String
	    System.out.println("First String(z) >> than Second String(a) gives +VE value :  " + "z".compareToIgnoreCase("a"));
	    System.out.println("Gives ascii difference between first non-equal character. Here (z-a) --> (122-97)"+"\n");
	    
	   //First String < Second String
	    System.out.println("First String(a) << than Second String(z) gives -VE value :  " + "a".compareToIgnoreCase("z"));
	    System.out.println("Gives ascii difference between first non-equal character. Here (a-z) --> (97-122)"+"\n");
	    
	    //Return (length of first String) - (length of Second String) if one String is the prefix of other String 
	    System.out.println("(length of first String(abcdef)) - (length of Second String(ABC) : " + "abcdef".compareToIgnoreCase("ABC"));
	    System.out.println("(length of first String(ABC)) - (length of Second String(abcdef) : " + "ABC".compareToIgnoreCase("abcdef"));
	    System.out.println("If one String is a prefix of other return difference in length");
	   
	}

}
