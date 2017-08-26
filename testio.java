import java.io.*;

class testio
{

	public static void main(String args[])throws IOException
	{
		int i;
		FileInputStream fin;
		FileOutputStream fout;

		try
		{
			fin= new FileInputStream("ayubb.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}

		try
		{
			fout=new FileOutputStream("sajidd.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More arguments");
		}

		try
		{

			do
			{
				i=fin.read();
				if(i!=-1)
				fout.write(i);
			}while(i!=-1);
		}
		catch(IOException e)
		{
			System.out.println("File error");
		}

	fin.close();
	fout.close();
	}
}