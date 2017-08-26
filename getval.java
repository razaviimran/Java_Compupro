import java.io.*;

class getval 
{
	public static void main ( String args[] ) throws IOException
	{
		String nam;
		int age;
		float sal;
		double eng;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );	

		nam=br.readLine();		
		age = Integer.parseInt( br.readLine() );
		sal  = Float.parseFloat( br.readLine() );
		eng = Double.parseDouble( br.readLine() );

		System.out.println( "Name	:	" +nam);
		System.out.println( "Age	:	" +age );
		System.out.println( "Salary	:	" +sal  );
		System.out.println( "Energy	:	" +eng );
	}

}