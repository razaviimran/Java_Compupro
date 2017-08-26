class Stack
{
	int stck[]=new int[10];
	int tos;
	
	//initialize top of stack.
	Stack()
	{
		tos=-1;
	}
	//push an item onto the stack
	void push(int item)
	{
		if(tos==9)
			System.out.println("Stack is full.");
		else
		{
			stck[++tos]=item;
			System.out.println( item );
				
		}

	}

	//pop an item from the stack

	int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack underdflow.");
			return 0;
		}
		else
			return stck[tos--];
	}
}
class TestStack
{
	public static void main(String args[])
	{
		Stack mystack1=new Stack();
		
            		for(int i=0; i<5;i++)
		mystack1.push(i);

		for(int i=0; i<5; i++)
		System.out.println( mystack1.pop() );

	}
}		