class Telephone
{
	double amt(int tel_no, int no)
	{
	double b_amt;
	System.out.println("Telephone number="tel_no);

	if(no<150)
	{
	b_amt=400;
	return b_amt;
	}
	else
	{
	b_amt=400+(no-150)*80;
	return b_amt;
	}
      }
}
class t1
{	
	public static void main(String args[])
	{
	Telephone b=new Telephone();
	System.out.println("Bill amout="+b.amt(25173535,23895));
	}
}