class str14
{

   public static void main( String args[] )
   {
	String s1 = "This is a string programme";
	
	String s2 = s1.toUpperCase();
	String s3 = s1.toLowerCase();

	System.out.println( s1 );		
	System.out.println( s2 );		
	System.out.println( s3 );		

 	StringBuffer sb = new StringBuffer("i  java");

	sb.insert( 2, "like");
	System.out.println( sb );		

 	StringBuffer sb1 = new StringBuffer("I LOVE JAVA");

	sb1.delete( 2,6);

	System.out.println( sb1 );
		
 	StringBuffer sb2 = new StringBuffer("I LOVE JAVA");

	sb2.replace( 2,6 , "LIKE" );

	System.out.println( sb2 );
   }

}
