package nku.sistemanalizi.marangoz.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Gider;
import nku.sistemanalizi.marangoz.model.Rapor;
import nku.sistemanalizi.marangoz.model.Urun;

public class RaporController {
	
	public static Rapor Yenile() {

		Rapor rapor = new Rapor();
		


		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		Statement stmtGelir = null;
		ResultSet rsGelir = null;
		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "SELECT * FROM Giderler";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Gider gider = new Gider();
				
				gider.id= rs.getInt(1);
				gider.tur = rs.getString(2);
				gider.tutar = rs.getFloat(3);
				gider.tarih = rs.getDate(4);
				gider.personelId=rs.getInt(5);
				gider.aciklama = rs.getString(6);
				gider.personel = PersonelController.Get(gider.personelId);
				rapor.giderler.add(gider);
				rapor.net -= gider.tutar;
			}
			
			//---------------------------------------------
			//-----------GELIRLER-----------------------
			//---------------------------------------------
			SQL = "SELECT * FROM Giderler";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Gider gider = new Gider();
				
				gider.id= rs.getInt(1);
				gider.tur = rs.getString(2);
				gider.tutar = rs.getFloat(3);
				gider.tarih = rs.getDate(4);
				gider.personelId=rs.getInt(5);
				gider.aciklama = rs.getString(6);
				gider.personel = PersonelController.Get(gider.personelId);
				rapor.giderler.add(gider);
				rapor.net -= gider.tutar;
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
			return rapor;
		}

		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					return rapor;
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					return rapor;
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
					return rapor;
				}
		}
		return rapor;
		
	}
	
	
	
}
