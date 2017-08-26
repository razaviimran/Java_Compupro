import java.io.*;

class annn
{
 public static void main (String args[]) throws IOException
  {
     int ch,m,n;
     String  nm;
     System.out.println("**************************");
     System.out.println("     Program for.......   ");
     System.out.println("**************************");
     
     do 
     {
       System.out.println("------------------------ ");
       System.out.println("         MENU            ");
       System.out.println("    1)NAME               ");
       System.out.println("    2)ACCOUNT NO.        ");
       System.out.println("    3)EXIT               ");
       System.out.println("-------------------------");
       BufferedReader br = new  BufferedReader( new InputStreamReader( System.in ) );

 	      	
       System.out.println("Enter your choice : ");
       String x = br.readLine();
	ch = Integer.parseInt(x);


        switch(ch)
         {
           case 1:
		System.out.println("Enter your name : ");
		nm = br.readLine();

                break;
           case 2:
		System.out.println("Enter your account no.: ");
		n = Integer.parseInt( br.readLine() );
                  break;
           case 3:
                  break;  
 
         }
     }while(ch!=4);	
 
  } 
}