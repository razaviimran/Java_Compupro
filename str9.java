class str9
{
public static void main(String args[])
{
	String arr[] = {"zubair","ayub","yatin","ejaz","babu","chitra"};

	for(int j = 0;j<arr.length;j++)
		{
		for(int i = j+1;j<arr.length;i++)
			{
			if(arr[j].compareTo(arr[i])>0)
				{
				String t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
				}
			}
		}

	System.out.println("Your name is in order");
	for(int j = 0;j<arr.length;j++)
		{
		System.out.println(arr[j]);
		}
	}
}