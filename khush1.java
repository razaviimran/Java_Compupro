khush1.java
//Reading string
 import java.io.*;

class khush1
{

public static void main(String args[])
	throws IOException
{

	String str;
	Buffered Reader br=new BufferedReader
	(new InputStream Reader(System.in));
	
	System.out.println("Enter String 'stop'to exit");
	
	do
	{
		str=br.readline();
		System.out.println(str);
	}while(!str.equals("stop"));
}
}	