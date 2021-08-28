package stringclass;

public class M3_10_lastIndexOf {

	public static void main(String[] args) {
		
            String s="venkateskath";
  
            //Argument int ch
    		System.out.println(s.lastIndexOf('k'));
    		System.out.println(s.lastIndexOf(97));
    		
    		//Argument String str
    		System.out.println(s.lastIndexOf("kat"));
    		
    		//Argument (int ch,int fromIndex)
    		System.out.println(s.lastIndexOf('e',2));
    		System.out.println(s.lastIndexOf(101,2));
    		
    		//Argument (int ch,int fromIndex)
    		System.out.println(s.lastIndexOf("kat",4));		
	}

}
