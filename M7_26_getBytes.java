package stringclass;

import java.nio.charset.Charset;

public class M7_26_getBytes {

	public static void main(String[] args) {
		
        String s="abcde";
        System.out.println("Converting Character to ascii using getBytes()");
        byte a[]=s.getBytes();
        for(Byte i:a)
        	System.out.print(i+" ");
        
        System.out.println("\nConverting Character to ascii using getBytes(Charset c)");
        byte b[]=s.getBytes(Charset.forName("ASCII"));
        for(Byte i:b)
        	System.out.print(i+" ");
        
        System.out.println("\nConverting Character to ascii using getBytes(String charset)");
        try
        {
	        byte c[]=s.getBytes("ASCII");
	        for(Byte i:c)
	        	System.out.print(i+" ");
        }
        catch(Exception e){}
        
        System.out.println("\nConcating Character of String to chararray");
        char d[]=new char[10];
        d[0]='v';d[1]='e';d[2]='n';d[3]='k';
        "atesh".getChars(0, 5, d, 4);
        System.out.println(d);
	}

}
