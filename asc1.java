class asc1
{
	public static void main(String args[])
	{
	
	int x[] = {7,9,2,215,300,27,100,200};
	int i,j;
	
	{
		for(i=0; i<8; i++)    // row
		{
			for( j=i+1; j<8; j++)      //col
			{

				if ( x[i] < x[j] )
				{
					int temp;
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}	
		}
		
		int k;
		for(k=0; k<8; k++)	
		{
 			System.out.println(x[k]);
		}


/*										
		
		System.out.println("x = " +x[0]);	
		System.out.println("x = " +x[1]);	
		System.out.println("x = " +x[2]);	
		System.out.println("x = " +x[3]);	
		System.out.println("x = " +x[4]);	
		System.out.println("x = " +x[5]);	
		System.out.println("x = " +x[6]);	

*/
//		System.out.println("x = " +x[7]);	
	}

	}
	


}