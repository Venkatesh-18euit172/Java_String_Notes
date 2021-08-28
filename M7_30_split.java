package stringclass;

public class M7_30_split {

	public static void main(String[] args) {

		String s="I-like-programming-very-much";
		String s1[]=s.split("\\-");
        for(String i:s1)
        	System.out.print(i+" ");
        String a[];
        a=s.split("\\-");
        for(String i:a)
        	System.out.print(i+" ");
	}

}
