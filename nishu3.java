class khushboo
{
	int n;
	public boolean prime(int x)
	{
	      n=x;
	       int i,r,flag=0;
	       for(i=2;i<n;i++)
	       {
		if(n%i==0)
		{

		  flag=1;
		break;
		
		}
	         }
	         if(flag==0)
	         return true;
	         else
	          return false;	  				          }
}
class nishu3
{

             public static void main(String args[])
             {
	khushboo ob=new khushboo();
	
	for(int a=1;a<=100;a++)
	{
		if(ob.prime(a))
		{
		System.out.println("prime no="+a);
		}
	}
               }
}	
          		       	 
		
		
		