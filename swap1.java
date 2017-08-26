import java.io.*;  

class swap1
{ 
  public static void main ( String args[]) throws IOException
   {
     int a=35, b=90;
	

     System.out.println("Before Swaping");
     System.out.println("a  =   " +a +"   b  =  "+b);
     
	a = a+b;
	b = a-b;
	a = a-b; 

     System.out.println("Afer Swaping");
     System.out.println("a  =   " +a +"   b  =  "+b);


   }
}

