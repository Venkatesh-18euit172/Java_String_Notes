package stringclass;
import java.util.*;

public class M2_4_equals {

	public static void main(String[] args) {
		
		//Equals Compare the Objects Content
		String s1="abc";
		System.out.println("String \"abc\" and String \"abc\" are equal  : " +s1.equals("abc"));

		String s2="abc";
		System.out.println(s1==s2);
		
		String s3=new String ("abc");
		String s4=new String ("abc");
		System.out.println(s3==s4);
		
		ArrayList<Integer> a=new ArrayList<>();
	    a.add(1);
	    ArrayList<Integer> b=new ArrayList<>();
	    b.add(1);
	    System.out.println("Object Arraylist a=[1] and Object Arraylist b=[1] are equal  : "+a.equals(b));
	  
	}

}
