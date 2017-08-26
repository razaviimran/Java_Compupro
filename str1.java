class str1
{

  public static void main( String args[] )
  {


     char x[] = { 'a', 'b', 'c', 'd' , 'f' };

     String s1 = new String( x );

     String s2 = new String( x,2,2 );

     String s3 = new String(s1);

     String s4 = s2;

     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);
     System.out.println(s4);

  }

}
