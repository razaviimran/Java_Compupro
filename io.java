import java.io.*;

class io
{
	public static void main(String args[])throws IOException
	{
		int i;
		FileInputStream fin;
		FileOutputStream fout;
	try
	{
		fin= new FileInputStream(args[0]);

	}
	catch(FileNotFoundException e)
	{
		System.out.println("file not found");
	}
	try
	{
		fout=new FileOutputStream(args[1]);
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

