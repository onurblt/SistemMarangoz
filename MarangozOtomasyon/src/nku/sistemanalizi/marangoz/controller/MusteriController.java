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
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
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
				musteri.adres1 = rs.getString(4);
				musteri.adres2 = rs.getString(5);
				musteri.tel1 = rs.getString(6);
				musteri.tel2 = rs.getString(7);
				musteri.email = rs.getString(8);
				musteri.olusturmaTarihi=rs.getDate(9);
				musteri.duzenlemeTarihi=rs.getDate(10);
				musteri.statu=rs.getInt(11);
				liste.add(musteri);
				
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
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
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
		//if (varMi) {
			//Application.BilgiKutusu("Eklenemedi!", "Bu bilgilere daha önce kayit bulunmaktadir!");
			//return false;
		//}

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "INSERT INTO Musteriler (Adi,Soyadi,Addr1,Addr2,Tel1,Tel2,Email,CreatedDate,ModifiedDate,Statu) "
					+ "VALUES ('" + musteri.ad + "','" + musteri.soyad + "','"
					+ musteri.adres1 + "','" + musteri.adres2 + "','" + musteri.tel1 + "','"
					+ musteri.tel2 + "','" + musteri.email + "'," + musteri.olusturmaTarihi +","
					+ musteri.duzenlemeTarihi + "," + Integer.toString(musteri.statu) + ");";
			stmt = con.createStatement();
			stmt.execute(SQL);

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
		//Application.BilgiKutusu("ISLEM BASARILI", "Ekleme islemi basariyla gerceklestirildi!");
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
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
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
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
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
		
		Application.BilgiKutusu("ISLEM BASARILI", "Silme islemi basariyla gerceklestirildi!");
		return true;

	}

	public static ArrayList<Musteri> Ara(String ad, String soyad) {
		ArrayList<Musteri> bulunan = new ArrayList<Musteri>();

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			System.out.println(ad);
			System.out.println(soyad);
			String SQL = "SELECT * FROM Musteriler WHERE  Adi LIKE '"+ad+"%' AND Soyadi LIKE '" + soyad +"%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Musteri musteri = new Musteri();
				
				musteri.id= rs.getInt(1);
				musteri.ad = rs.getString(2);
				musteri.soyad = rs.getString(3);
				musteri.adres1 = rs.getString(4);
				musteri.adres2 = rs.getString(5);
				musteri.tel1 = rs.getString(6);
				musteri.tel2 = rs.getString(7);
				musteri.email = rs.getString(8);
				musteri.olusturmaTarihi=rs.getDate(9);
				musteri.duzenlemeTarihi=rs.getDate(10);
				musteri.statu=rs.getInt(11);
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
	public static Musteri Get(int id) {
		Musteri musteri = null;
		//liste.clear();

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "SELECT * FROM Musteriler WHERE Musteri_id="+Integer.toString(id)+";";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			if (rs.next()) {
				musteri = new Musteri();

				musteri.id= rs.getInt(1);
				musteri.ad = rs.getString(2);
				musteri.soyad = rs.getString(3);
				musteri.adres1 = rs.getString(4);
				musteri.adres2 = rs.getString(5);
				musteri.tel1 = rs.getString(6);
				musteri.tel2 = rs.getString(7);
				musteri.email = rs.getString(8);
				musteri.olusturmaTarihi=rs.getDate(9);
				musteri.duzenlemeTarihi=rs.getDate(10);
				musteri.statu=rs.getInt(11);
				
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
			return musteri;
		}

		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					return musteri;
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					return musteri;
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
					return musteri;
				}
		}
		return musteri;
	}


}
