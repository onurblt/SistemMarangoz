package nku.sistemanalizi.marangoz.controller;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;

import nku.sistemanalizi.marangoz.model.Personel;
import nku.sistemanalizi.marangoz.model.Yetki;

public class LoginController {
	
	public static void Giris(String kullaniciAdi,String sifre)
	{
		// Declare the JDBC objects.
		Connection con = null;
		CallableStatement cstmt = null;
		
		try {
			// Establish the connection. 
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DBAyari.sunucu);
			ds.setPortNumber(DBAyari.port); 
			ds.setDatabaseName(DBAyari.dbAdi);
			con = ds.getConnection();
			 
	        	// Execute a stored procedure that returns some data.
            		cstmt = con.prepareCall("{call dbo.Login(?,?,?)}");
            		cstmt.setString(1, kullaniciAdi);
            		cstmt.setString(2, sifre);
            		cstmt.registerOutParameter(3, java.sql.Types.INTEGER);
            		cstmt.execute();
            		int yetki = cstmt.getInt(3);
            		System.out.println(yetki);
            		if(yetki>0)
            		{
            			
            			aktifPersonel=new Personel();
            			aktifPersonel.yetki=yetki;
            			aktifPersonel.kullaniciAdi=kullaniciAdi;
            		}
	        }
	        
		// Handle any errors that may have occurred.
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}

	   	finally {
	    	
	    		if (cstmt != null) try { cstmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
	    	}
	}
	
	public void Cikis()
	{
		
	}
	
	static Personel aktifPersonel=null;
	

}
