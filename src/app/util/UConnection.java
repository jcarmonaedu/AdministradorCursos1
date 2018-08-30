package app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class UConnection
{
	private static Connection con = null;
	public static Connection getConnection()
	{		
		try
		{			
			if( con!=null && !con.isClosed())
			{
				return con;
			}
			// parametros del la conexion
			String driver = "org.hsqldb.jdbcDriver";
			String url = "jdbc:hsqldb:hsql://localhost/testdb";
			String usr = "SA";
			String pwd = "";
			// levanto el driver
			Class.forName(driver);
			// establezco la conexion
			con = DriverManager.getConnection(url, usr, pwd);
			return con;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
