package stringclass;

public class M7_31_format {

	public static void main(String[] args) {

		//General Format
		//% [flags] [width] [.precision] [argsize] typechar
		
		System.out.println("***Boolean Type***");
		System.out.println("(%b , false) : "+String.format("%b", false));
		System.out.println("(%B , true) : "+String.format("%B", true));
		
		System.out.println("\n\n***Decimal Integer***");
		System.out.println("(%d , 25) : "+String.format("%d", 25));
		System.out.println("\nFor aligning +ve & -ve number correctly");
		System.out.println("(% d , 25) : "+String.format("% d", -25));
		System.out.println("(% d , 25) : "+String.format("% d", 25));
		System.out.println("\nFor Specifing +ve & -ve sign");
		System.out.println("(%+d , 25) : "+String.format("%+d", -25));
		System.out.println("(%+d , 25) : "+String.format("%+d", 25));
		System.out.println("\nFor parenthesising the negtive number");
		System.out.println("(%(d , -25) : "+String.format("%(d", -25));
		System.out.println("(%(d , 25) : "+String.format("%(d", 25));
		System.out.println("\nFor Displaying the number using commas");
		System.out.println("(%,d , 25500500) : "+String.format("%,d", 25500500));
		System.out.println("\nFor Spacing the number");
		System.out.println("(|%10d| , 25) : "+String.format("|%10d|", 25));
		System.out.println("(|%-10d| , 25): "+String.format("|%-10d|", 25));
		System.out.println("\nValue in 3 digits");
		System.out.println("(%03d , 5) :"+String.format("%03d", 5));
		System.out.println("(%03d , 5) :"+String.format("%03d", 25));
		System.out.println("(%03d , 5) :"+String.format("%03d", 258));
		
		System.out.println("\n\n***Float Point***");
		System.out.println("(%f , 25.00) : "+String.format("%f", 25.00));
		System.out.println("(%.2f , 25.258) : "+String.format("%.2f", 25.258));
		System.out.println("\nE or e represents 10^x");
		System.out.println("(%e , 25.250) : "+String.format("%e", 25.250));
		System.out.println("(%.2E , 25.250) : "+String.format("%.2E", 25.250));
		System.out.println("\ng make number of digits to .3 value");
		System.out.println("(%.3g , 25.258) : "+String.format("%.3g", 25.258));

		System.out.println("\n\n***Octal Representation***");
		System.out.println("(%o %o,7,8) : "+String.format("%o %o",7, 8));
		
		System.out.println("\n\n***Hexadecimal Representation");
		System.out.println("(%x , 10) : "+String.format("%x",10));
		System.out.println("(%X , 10) : "+String.format("%X",10));
		System.out.println("(%h , 10) : "+String.format("%h ",10));
		System.out.println("(%H , 10) : "+String.format("%H ",10));
		System.out.println("\nFloating Point hexadecimal");
		System.out.println("(%a , 10.5) : "+String.format("%a", 10.5));
		System.out.println("(%A , 10.5) : "+String.format("%A", 10.5));
		
		System.out.println("\n\n***Character***");
		System.out.println("(%c,97) : "+String.format("%c",97));
		System.out.println("(%c,a) : "+String.format("%c",'a'));
		
		System.out.println("\n\n***String***");
		System.out.println("(%s,venkat) : "+String.format("%s","venkat"));
		
		System.out.println("\n\n***Hash code representation***");
		M7_31_format obj=new M7_31_format();
		System.out.println(String.format("%h ",obj));
		System.out.println(String.format("%H ",obj));
		int c=4;
		System.out.println(String.format("%0"+c+"d", 0));
	}

}
