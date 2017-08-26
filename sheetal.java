import java.io.*;
class sheetal
{
	public static void main(String args[])throws IOException
	{

	String str[]= new String[50];
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter string ");
		for (int i=0; i<50; i++)
		{
			str[i]=br.readLine();

			if(str[i].equals("stop"))
			{	
				break;
			}

			System.out.println(str[i]);
		}
	}
}