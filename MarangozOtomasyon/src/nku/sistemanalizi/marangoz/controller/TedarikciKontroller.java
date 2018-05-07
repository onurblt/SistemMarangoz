package nku.sistemanalizi.marangoz.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Tedarikci;
import nku.sistemanalizi.marangoz.view.Application;

public class TedarikciKontroller {


	public static ArrayList<Tedarikci>  Yenile() {
		ArrayList<Tedarikci> liste = new ArrayList<Tedarikci>();

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
			String SQL = "SELECT * FROM Tedarikciler";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Tedarikci tedarikci = new Tedarikci();
				
				tedarikci.id= rs.getInt(1);
				tedarikci.ad = rs.getString(2);
				tedarikci.soyad = rs.getString(3);
				tedarikci.unvan = rs.getString(4);
				tedarikci.tel1 = rs.getString(5);
				tedarikci.tel2 = rs.getString(6);
				tedarikci.adres = rs.getString(7);
				tedarikci.aktif = rs.getInt(8);
				tedarikci.olusturmaTarihi = rs.getDate(9);
				tedarikci.duzenlemeTarihi = rs.getDate(10);
				tedarikci.statu = rs.getInt(11);
				
				liste.add(tedarikci);
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
	
	public static boolean Ekle(Tedarikci tedarikci) {

		
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
			String SQL = "SELECT * FROM Tedarikciler WHERE Adi = '" + tedarikci.ad + "' AND Soyadi = '" + tedarikci.soyad 
					+ "' AND Unvan='"+tedarikci.unvan+";";
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
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			String SQL = "INSERT INTO Tedarikciler (Adi, Soyadi,Unvan,Tel1,Tel2,Adres,Email,Active,CreatedDate,ModifiedDate,Statu) "
					+ "VALUES ('" + tedarikci.ad + "','" + tedarikci.soyad + "','"+tedarikci.unvan+"','"+tedarikci.tel1+"','"+
					tedarikci.tel2+"','"+tedarikci.adres+"','"+tedarikci.olusturmaTarihi+"','"+tedarikci.duzenlemeTarihi
					+"',"+Integer.toString(tedarikci.statu)+");";
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

	public static boolean Sil(Tedarikci tedarikci) {
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
			String SQL = "SELECT * FROM Urunler WHERE Urun_Adi = '" + tedarikci.ad + "';";
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
			String SQL = " UPDATE  Urunler " + "SET Statu=" + Integer.toString(0) + " WHERE Urun_Adi='" + tedarikci.ad+ "';";
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

	public static ArrayList<Tedarikci> Ara(String ad) {
		ArrayList<Tedarikci> bulunan = new ArrayList<Tedarikci>();

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
			String SQL = "SELECT * FROM Tedarikciler WHERE Urun_Adi LIKE '"+ad+"%';";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Tedarikci tedarikci = new Tedarikci();
				
				tedarikci.id= rs.getInt(1);
				tedarikci.ad = rs.getString(2);
				tedarikci.soyad = rs.getString(3);
				tedarikci.unvan = rs.getString(4);
				tedarikci.tel1 = rs.getString(5);
				tedarikci.tel2 = rs.getString(6);
				tedarikci.adres = rs.getString(7);
				tedarikci.aktif = rs.getInt(8);
				tedarikci.olusturmaTarihi = rs.getDate(9);
				tedarikci.duzenlemeTarihi = rs.getDate(10);
				tedarikci.statu = rs.getInt(11);
				
				bulunan.add(tedarikci);
				
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
