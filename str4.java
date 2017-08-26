class str4
{

public static void main(String args[])
{


	String s1="ayub";
	String s2="laxman";
	String s3="ayub";
	String s4="AYUB";

	
	System.out.println( s1.equals (s2) );
	System.out.println( s1.equals (s3) );
	System.out.println( s1.equals (s4) );

	System.out.println(s1.equalsIgnoreCase(s4));

}

}