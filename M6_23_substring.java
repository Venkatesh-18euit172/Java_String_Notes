package stringclass;

public class M6_23_substring {

	public static void main(String[] args) {
	
		 System.out.println("*********string_obj.substring(int beginindex)***********\n");
         String s1="unhappy";
         System.out.println("Begin index(2) << length of String(7) :- "+s1.substring(2)+"\n");
                  
         try {  s1.substring(-2);  }
         catch(IndexOutOfBoundsException e) {  System.out.println("Begin index(-2) is negative \n"); }
         
         try { s1.substring(10);   }
         catch(IndexOutOfBoundsException e) {  System.out.println("Begin index(10) >> length of String(7)\n"); }
    
         
         System.out.println("*********string_obj.substring(int beginindex,int end index)***********\n");
         
         System.out.println("Begin(2) and end(5) index << length of String(7) :- "+s1.substring(2,5)+"\n");
    
         try {  s1.substring(7,2);  }
         catch(IndexOutOfBoundsException e) {  System.out.println("Begin index(7) >> End index(2)\n"); }
         
         try { s1.substring(2,67);   }
         catch(IndexOutOfBoundsException e) {  System.out.println("End index(67) >> length of String(7)\n"); }
         
         System.out.println("*********string_obj.subSequence(int beginindex,int end index)***********\n");
         
         CharSequence s2=s1.subSequence(2,5);
         System.out.println("Returns only CharSequence :- "+ s2+"\n");
         
         
	}

}
