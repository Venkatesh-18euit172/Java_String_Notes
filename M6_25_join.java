package stringclass;

public class M6_25_join {

	public static void main(String[] args) {

      System.out.println("Varargs elements are Joined :- "+String.join("-", "John","is","good","boy"));
      
      String a[]={"John","is","good","boy"};
      System.out.println("String array is joined :- "+String.join("-",a));
      
      StringBuffer b[]={new StringBuffer("John"), new StringBuffer("is"), new StringBuffer("good"), new StringBuffer("boy")};
      System.out.println("StringBuffer array is joined :- "+String.join("-",b));
      
      StringBuilder c[]={new StringBuilder("John"), new StringBuilder("is"), new StringBuilder("good"), new StringBuilder("boy")};
      System.out.println("StringBuilder array is joined :- "+String.join("-",c));
	}
}
