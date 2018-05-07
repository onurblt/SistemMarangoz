package nku.sistemanalizi.marangoz.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Personel;
import nku.sistemanalizi.marangoz.view.Application;

public class PersonelController {

	public static ArrayList<Personel> Yenile(boolean tumu) {
		ArrayList<Personel> liste = new ArrayList<Personel>();
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
			String SQL = tumu?"SELECT * FROM Personel":"SELECT * FROM Personel WHERE Statu = 1";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Personel personel = new Personel();

				/// COK ONEMLI
				/// DBde yetki gucu yok!!!!!
				/// COK ONEMLI

				personel.id = rs.getInt(1);
				personel.ad = rs.getString(2);
				personel.soyad = rs.getString(3);
				personel.dogumTarihi = rs.getDate(4);
				personel.TCno = rs.getString(5);
				personel.unvan = rs.getString(6);
				personel.tel1 = rs.getString(7);
				personel.tel2 = rs.getString(8);
				personel.adres = rs.getString(9);
				personel.maas = rs.getFloat(10);
				personel.yetki = rs.getInt(11);
				personel.statu = rs.getInt(12);
				personel.email = rs.getString(13);
				liste.add(personel);
				
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

	public static boolean Ekle(Personel personel) {

		/// COK ONEMLI
		/// Yetki kontrol!!!!!
		/// COK ONEMLI

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
			String SQL = "SELECT Adi,Soyadi,TCNo FROM Personel WHERE Adi = '" + personel.ad + "' AND Soyadi = '"
					+ personel.soyad + "' AND TCNo = '" + personel.TCno + "';";
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
			Application.BilgiKutusu("Eklemedi!", "Bu bilgilere daha önce kayit bulunmaktadir!");
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
			String SQL = "INSERT INTO Personel (Adi, Soyadi,DogumTarihi, TCNo,Unvan,Tel1,Tel2,Addr,Maas,YetkiSeviyesi,Statu) "
					+ "VALUES ('" + personel.ad + "', '" + personel.soyad + "','"
					+ personel.dogumTarihi + "','" + personel.TCno + "','" + personel.unvan + "','"
					+ personel.tel1 + "','" + personel.tel2 + "','" + personel.adres + "',"
					+ Float.toString(personel.maas) + "," + Integer.toString(personel.yetki) + ","
					+ Integer.toString(personel.statu) + ");";
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
		Application.BilgiKutusu("ISLEM BASARILI", "Ekleme islemi basariyla gerceklestirildi!");
		return true;
	}

	public static boolean Sil(Personel personel) {
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
			String SQL = "SELECT Adi,Soyadi,TCNo FROM Personel WHERE Adi = \'" + personel.ad + "\' AND Soyadi = \'"
					+ personel.soyad + "\' AND TCNo = \'" + personel.TCno + "\';";
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
			String SQL = " UPDATE  Personel " + "SET Statu=" + Integer.toString(0) + " WHERE TCNo='" + personel.TCno
					+ "';";
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

	public static ArrayList<Personel> Ara(String ad, String soyad) {
		ArrayList<Personel> bulunan = new ArrayList<Personel>();

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
			String SQL = "SELECT * FROM Personel WHERE Adi LIKE '"+ad+"%' AND Soyadi LIKE '" + soyad +"%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Personel personel = new Personel();
				
				personel.id = rs.getInt(1);
				personel.ad = rs.getString(2);
				personel.soyad = rs.getString(3);
				personel.dogumTarihi = rs.getDate(4);
				personel.TCno = rs.getString(5);
				personel.unvan = rs.getString(6);
				personel.tel1 = rs.getString(7);
				personel.tel2 = rs.getString(8);
				personel.adres = rs.getString(9);
				personel.maas = rs.getFloat(10);
				personel.yetki = rs.getInt(11);
				personel.statu = rs.getInt(12);
				personel.email = rs.getString(13);
				// System.out.println(rs.getString(4) + " " + rs.getString(6));
				bulunan.add(personel);
				
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
	public static Personel Get(int id) {
		Personel personel = null;
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
			String SQL = "SELECT * FROM Personel WHERE Personel_id="+Integer.toString(id)+";";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			if (rs.next()) {
				personel = new Personel();

				/// COK ONEMLI
				/// DBde yetki gucu yok!!!!!
				/// COK ONEMLI

				personel.id = rs.getInt(1);
				personel.ad = rs.getString(2);
				personel.soyad = rs.getString(3);
				personel.dogumTarihi = rs.getDate(4);
				personel.TCno = rs.getString(5);
				personel.unvan = rs.getString(6);
				personel.tel1 = rs.getString(7);
				personel.tel2 = rs.getString(8);
				personel.adres = rs.getString(9);
				personel.maas = rs.getFloat(10);
				personel.yetki = rs.getInt(11);
				personel.statu = rs.getInt(12);
				personel.email = rs.getString(13);
				
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
			return personel;
		}

		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					return personel;
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					return personel;
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
					return personel;
				}
		}
		return personel;
	}

}
