package nku.sistemanalizi.marangoz.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Personel;
import nku.sistemanalizi.marangoz.model.Urun;
import nku.sistemanalizi.marangoz.view.Application;

public class UrunController {


	public static ArrayList<Urun>  Yenile() {
		ArrayList<Urun> liste = new ArrayList<Urun>();

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
			String SQL = "SELECT * FROM Urunler";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Urun urun = new Urun();
				
				urun.id= rs.getInt(1);
				urun.ad = rs.getString(2);
				urun.kategoriId = rs.getInt(3);
				urun.statu = rs.getInt(4);
				liste.add(urun);
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
	
	public static boolean Ekle(Urun urun) {

		
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
			String SQL = "SELECT * FROM Urunler WHERE Urun_Adi = '" + urun.ad + "' OR Urun_id = \'" + urun.id + "\';";
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
			String SQL = "INSERT INTO Urunler (Urun_Adi, Kategori_id,Statu) "
					+ "VALUES ('" + urun.ad + "','" + urun.kategoriId + "', " 
					+Integer.toString(urun.statu) + ");";
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

	public static boolean Sil(Urun urun) {
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
			String SQL = "SELECT * FROM Urunler WHERE Urun_Adi = '" + urun.ad + "';";
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
			String SQL = " UPDATE  Urunler " + "SET Statu=" + Integer.toString(0) + " WHERE Urun_Adi='" + urun.ad+ "';";
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

	public static ArrayList<Urun> Ara(String ad) {
		ArrayList<Urun> bulunan = new ArrayList<Urun>();

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
			String SQL = "SELECT * FROM Urunler WHERE Urun_Adi LIKE '"+ad+"%';";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				Urun urun = new Urun();
				
				urun.id= rs.getInt(1);
				urun.ad = rs.getString(2);
				urun.kategoriId = rs.getInt(3);
				urun.statu = rs.getInt(4);
				bulunan.add(urun);
				
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
	public static Urun Get(int id) {
		Urun urun=null;
			// Create and execute an SQL statement that returns some data.
			ResultSet rs=DB.Calistir("SELECT * FROM Urunler WHERE Urun_id="+Integer.toString(id)+";");
		
			// Iterate through the data in the result set and display it.
			try {
				if (rs.next()) {
					urun = new Urun();
					//urun.id = rs.getInt(1);
					urun.ad = rs.getString(2);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		
		DB.Temizle(rs);
		return urun;
	}
}
