package stringclass;

public class M1_1_charAt {
	public static void main(String[] args) {
		String s="venkatesh";
		
		//value below the length of String
		System.out.println("Given String is "+s);
		System.out.println("Index value is " + 0 +" "+ s.charAt(0)+"\n");
		
		try
		{
			//value below 0
			System.out.println("Index value is " + -1 );
			System.out.println(s.charAt(-1));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Given index  value is negative"+"\n");
		}
		
		try
		{
			//value greater than length of the string
			System.out.println("Index value is " + 100 );
			System.out.println(s.charAt(100));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Given index  value is greater than String length");
		}
	}
}
