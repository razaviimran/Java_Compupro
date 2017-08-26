import java.rmi.*;

interface fact extends Remote
{
	public double getfact( double num ) throws RemoteException;
}