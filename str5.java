class str5
{
public static void main(String args[])
	{
	String s1= "This is the demo of getchars method";

	int x=10, y=14;

	char p[] = new char[y-x];

	s1.getChars( x, y,  p, 0  );
	System.out.println(p);
	}
}

