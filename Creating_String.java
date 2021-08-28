package stringclass;
import java.nio.charset.*;
public class Creating_String {

public static void main(String[] args){
         
			/*String is created in String Constant Pool*/
			System.out.println("******Creating String in different ways******\n");
			//Creating String using String literals . 
			String s1="Venkatesh";
			System.out.println("1)String literals       --> String s=\"Venkatesh\"              :- " + s1+"\n");
			
			/*String is created in Heap*/
			
			//Creating a empty string using String ()
			String s2=new String ();
			System.out.println("2)String()              -->  new String ()                      :- " + s2+"\n");
			
			//Creating String using  String (String strObj)
			String s3=new String("Venkatesh");
			System.out.println("3)String(String strObj)  -->  new String(\"Venkatesh\")            :- " + s3+"\n");
			
			//Creating String using  String (StringBuffer s)
			String s8=new String(new StringBuffer("abc"));
			System.out.println("4)String(StringBuffer s)  -->  new String(new StringBuffer(\"abc\")):- " + s8+"\n");			

			//Creating String using  String (StringBuilder s)
			String s9=new String(new StringBuilder("a"));
			System.out.println("5)String(StringBuilder s)  -->  new String(new StringBuilder(\"a\")):- " + s9+"\n");
			

			//Creating String using String (char [] chArr)
			char a1[]={'a','b','c','d','e'};
			String s4=new String(a1);
			System.out.println("6)String(char [] chArr) -->  new String({'a','b','c','d','e'})  :- " + s4+"\n");

			//Creating String using String (byte [] bytes)
			byte a2[]={97,98,99,100,101};
			String s5=new String(a2);
			System.out.println("7)String(byte [] bytes) -->  new String({97,98,99,100,101})     :- "+ s5+"\n" );
			
			//Creating String using String (char [] chArr, int startIndex, int length)
			String s7=new String(a1,0,3);
			System.out.println("8)String(char [] chArr, int startIndex, int length)  -->  new String({'a','b','c','d','e'},0,3) :- " + s7+"\n");

			//Creating String using String (byte [] bytes, int startIndex, int length):
			String s6=new String(a2,0,3);
			System.out.println("9)String(byte [] bytes, int startIndex, int length)  -->  new String({97,98,99,100,101},0,3)    :- "+ s6+"\n" );
			
			
			//Creating String using String (byte [] bytes,Charset cs)
			String s10=new String(a2,Charset.forName("ASCII"));
			System.out.println("10)String(byte [] bytes,Charset cs)  -->  new String({97,98,99,100,101},Charset.forName(\"ASCII\")):- "+ s10+"\n" );
			
			try{
				//Creating String using String (byte [] bytes,String charset)
				String s11=new String(a2, "ASCII");
				System.out.println("11)String(byte[] bytes,String Charset)  -->  new String({97,98,99,100,101},\"ASCII\"):- "+ s11+"\n" );
			}
			catch (Exception e){}
			
			//Creating String using String (byte [] bytes,int startIndex,int length,String charset)
			String s12=new String(a2, 0, 3, Charset.forName("ASCII"));
			System.out.println("12)String(byte [] bytes,int startIndex,int length,Charset cs)  -->  new String({97,98,99,100,101},0,3,Charset.forName(\"ASCII\")):- "+ s12+"\n" );

			try{
				//Creating String using String (byte [] bytes,int startIndex,int length,String charset)
				String s13=new String(a2,0,3,"ASCII");
				System.out.println("13)String(byte[] bytes,int startIndex,int length,String Charset)  -->  new String({97,98,99,100,101},0,3,\"ASCII\"):- "+ s13+"\n" );
			}
			catch (Exception e){}
			
		}

	}
