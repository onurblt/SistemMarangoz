package nku.sistemanalizi.marangoz.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Tedarikci;

public class TedarikciKontroller {
	public static ArrayList<Tedarikci> liste = new ArrayList<Tedarikci>();

	public static boolean Yenile() {
		liste.clear();

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DBAyari.sunucu);
			ds.setPortNumber(DBAyari.port);
			ds.setDatabaseName(DBAyari.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "SELECT * FROM Tedarikciler";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Tedarikci tedarikci = new Tedarikci();
				tedarikci.id = rs.getInt(1);
				tedarikci.ad = rs.getString(2);
				tedarikci.soyad = rs.getString(3);
				tedarikci.unvan = rs.getString(4) ;
				tedarikci.tel1 = rs.getString(5);
				tedarikci.tel2 = rs.getString(6);
				tedarikci.adres=rs.getString(7);
				tedarikci.email=rs.getString(8);
				tedarikci.aktif=rs.getInt(9);
				tedarikci.olusturmaTarihi=rs.getDate(10);
				tedarikci.duzenlemeTarihi=rs.getDate(11);
				tedarikci.statu=rs.getInt(12);
				liste.add(tedarikci);
				;
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					return false;
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					return false;
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
					return false;
				}
		}
		// return personeller;
		return true;
	}

	public static boolean Ekle(Tedarikci personel) {

		/// COK ONEMLI
		/// Yetki kontrol!!!!!
		/// COK ONEMLI
		
		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DBAyari.sunucu);
			ds.setPortNumber(DBAyari.port);
			ds.setDatabaseName(DBAyari.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL ="";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					return false;
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					return false;
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
					return false;
				}
		}
		return true;
	}
}
