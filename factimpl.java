import  java.rmi.*;
import  java.server.*;
class factimpl extends UnicastRemoteObject implements fact
{
	public factimpl() throws RemoteException 
	{
	}	

	public double getfact( double num ) throws RemoteException 
	{
	int f=1;
		for( int i=1; i<=num; i++ )
		{
		f = f*i;
		}
	return f;
	}
} 