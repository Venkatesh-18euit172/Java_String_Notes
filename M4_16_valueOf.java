package stringclass;

public class M4_16_valueOf {

	public static void main(String[] args) {
		
		//valueOf is a static method in String Class
		
		System.out.println("1)valueOf(boolean true) :- "+String.valueOf(true)+"abcd");
		
		//Similar to Object.toString(primitive datatype)
	
		System.out.println("2)valueOf(int  25) :- "+String.valueOf(25)+"abcd");
		System.out.println("3)valueOf(long 25) :- "+String.valueOf((long)25)+"abcd");
		System.out.println("4)valueOf(float 25.0) :- "+String.valueOf(25.0)+"abcd");
		System.out.println("5)valueOf(double 25) :- "+String.valueOf((double)25.0)+"abcd");
		Integer i=25;
		System.out.println("6)valueOf(Object 25) :- "+String.valueOf(i)+"abcd");
		System.out.println("7)valueOf(char a) :- "+String.valueOf('a')+"abcd");
		char a[]={'a','b','c','d'};
		System.out.println("8)valueOf(char[] a) :- "+String.valueOf(a)+"abcd");
		System.out.println("9)valueOf(char[] a,int startIndex,int length) :- "+String.valueOf(a,0,2)+"abcd");
	}

}
