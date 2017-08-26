//controp Panel  --> Performance and Maintenane //-->Administrative tools -->double click on Data sources //(ODBC)-->
//Add -->select Microsoft Driver (*.mdb, //*.accdb)-->Finish--> give the Data source name as per //ur //choices (any)-->
//click on select--> select ur table and database from ur //location --> ok->ok->ok

import java.sql.*;
import java.io.*;

public class JD4
{
public static void main(String args[])
{
	String dataSourceName="Amandeep";
	String dbURL = "jdbc:odbc:"+ dataSourceName;

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con= DriverManager.getConnection(dbURL,"","");
	Statement s=con.createStatement();
	s.execute("insert into stud values(11, 'Meena', 'Kurla', 2500)");
	con.close();
	System.out.println("Inserted");
	}
	catch(Exception err)
	{
		System.out.println("Error:"+err);
	}
}
}