package nku.sistemanalizi.marangoz.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Musteri;
import nku.sistemanalizi.marangoz.model.Personel;
import nku.sistemanalizi.marangoz.view.Application;


public class MusteriController {


	public static ArrayList<Musteri>  Yenile() {
		ArrayList<Musteri> liste = new ArrayList<Musteri>();

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
			String SQL = "SELECT * FROM Musteriler";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Musteri musteri = new Musteri();
				
				musteri.id= rs.getInt(1);
				musteri.ad = rs.getString(2);
				musteri.soyad = rs.getString(3);
				musteri.aktif = rs.getInt(4);
				musteri.adres1 = rs.getString(5);
				musteri.adres2 = rs.getString(6);
				musteri.tel1 = rs.getString(7);
				musteri.tel2 = rs.getString(8);
				musteri.email = rs.getString(9);
				musteri.olusturmaTarihi=rs.getDate(10);
				musteri.duzenlemeTarihi=rs.getDate(11);
				musteri.statu=rs.getInt(12);
				liste.add(musteri);
				;
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
			return liste;
		}

		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					return liste;
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					return liste;
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
					return liste;
				}
		}
		return liste;
	}
	
	public static boolean Ekle(Musteri musteri) {

		
		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		boolean varMi = false;

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DBAyari.sunucu);
			ds.setPortNumber(DBAyari.port);
			ds.setDatabaseName(DBAyari.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "SELECT Adi,Soyadi,Musteri_id FROM Musteriler WHERE Adi = \'" + musteri.ad + "\' AND Soyadi = \'"
					+ musteri.soyad + "\' AND Musteri_id = \'" + musteri.id + "\';";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			if (rs.next()) {
				varMi = true;
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
		if (varMi) {
			Application.BilgiKutusu("Eklenemedi!", "Bu bilgilere daha önce kayit bulunmaktadir!");
			return false;
		}

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DBAyari.sunucu);
			ds.setPortNumber(DBAyari.port);
			ds.setDatabaseName(DBAyari.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "INSERT INTO Musteriler (Adi, Soyadi,Active,Addr1,Addr2,Tel1,Tel2,Email,CreatedDate,ModifiedDate,Statu) "
					+ "VALUES ('" + musteri.ad + "','" + musteri.soyad + "', " +
					Integer.toString(musteri.aktif) + ",'"
					+ musteri.adres1 + "','" + musteri.adres2 + "','" + musteri.tel1 + "','"
					+ musteri.tel2 + "','" + musteri.email + "'," + musteri.olusturmaTarihi +","
					+ musteri.duzenlemeTarihi + "," + Integer.toString(musteri.statu) + ");";
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

	public static boolean Sil(Musteri musteri) {
		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		boolean varMi = false;

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DBAyari.sunucu);
			ds.setPortNumber(DBAyari.port);
			ds.setDatabaseName(DBAyari.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "SELECT Adi,Soyadi FROM Musteriler WHERE Adi = '" + musteri.ad + "\' AND Soyadi = \'"
					+ musteri.soyad + "';";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			if (rs.next()) {
				varMi = true;
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
		if (varMi == false) {
			Application.BilgiKutusu("HATA!", "Bu bilgilere kayit yoktur!");
			return false;
		}

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DBAyari.sunucu);
			ds.setPortNumber(DBAyari.port);
			ds.setDatabaseName(DBAyari.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = " UPDATE  Musteriler " + "SET Statu=" + Integer.toString(0) + " WHERE Adi='" + musteri.ad
					+ "' AND Soyadi='"+musteri.soyad+"';";
			stmt = con.createStatement();
			stmt.executeUpdate(SQL);

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

	public static ArrayList<Musteri> Ara(String firmaAdi,String ad, String soyad) {
		ArrayList<Musteri> bulunan = new ArrayList<Musteri>();

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
			String SQL = "SELECT * WHERE Adi LIKE '"+ad+"%' AND Soyadi LIKE '" + soyad +"%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Musteri musteri = new Musteri();
				
				musteri.id= rs.getInt(1);
				musteri.ad = rs.getString(2);
				musteri.soyad = rs.getString(3);
				musteri.aktif = rs.getInt(4);
				musteri.adres1 = rs.getString(5);
				musteri.adres2 = rs.getString(6);
				musteri.tel1 = rs.getString(7);
				musteri.tel2 = rs.getString(8);
				musteri.email = rs.getString(9);
				musteri.olusturmaTarihi=rs.getDate(10);
				musteri.duzenlemeTarihi=rs.getDate(11);
				musteri.statu=rs.getInt(12);
				bulunan.add(musteri);
				
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
			return bulunan;
		}

		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					return bulunan;
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					return bulunan;
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
					return bulunan;
				}
		}

		return bulunan;

	}

}
