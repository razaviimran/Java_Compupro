import java.io.*;  
class gcd
{ 
  public static void main ( String args[]) throws IOException
   {
     int a,b,x,y;
     System.out.println("***********************************" );
     System.out.println("------PROGRAM FOR FINDING GCD------" );
     System.out.println("***********************************" );

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter the first no. : " );

     a=Integer.parseInt( br.readLine() );	


     System.out.print("Enter the second no. : ");
     b=Integer.parseInt( br.readLine() );

	x = a;
	y = b;

      while (a!=b)
      {
        if(a>b)
          a=a-b;
        else
          b=b-a;
      }
     
	int lcm;
	lcm = x*y/a;	
		
	System.out.println("-------------------------------------- ");
     System.out.println("   The GCD of the given nos. is : "+a);
     System.out.println("-------------------------------------- ");
     System.out.println("   The LCM of the given nos. is : "+lcm);
     System.out.println("-------------------------------------- ");
     
   }
}