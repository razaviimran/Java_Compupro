class Telephone
{
	double amt(tel_no ,int no)
	{
	double b_amt;
	System.out.println("Telephone number="+tel_no);
	
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

class TelDemo
{
	public static void main(String args[])
	{
	Telephone ob=new Telephone();
	System.out.println("Bill amunt="b.amt(25173434,32874));
	}
}