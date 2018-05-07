package nku.sistemanalizi.marangoz.controller;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Hesap;
import nku.sistemanalizi.marangoz.model.Urun;
import nku.sistemanalizi.marangoz.view.Application;

public class HesapController {
		public static ArrayList<Hesap>  Yenile() {
			ArrayList<Hesap> liste = new ArrayList<Hesap>();

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
				String SQL = "SELECT * FROM Hesaplar";
				stmt = con.createStatement();
				rs = stmt.executeQuery(SQL);

				// Iterate through the data in the result set and display it.
				while (rs.next()) {
					Hesap hesap = new Hesap();
					
					hesap.id= rs.getInt(1);
					hesap.kullaniciAdi = rs.getString(2);
					hesap.sifre = rs.getString(3);
					hesap.olusturmaTarihi = rs.getDate(4);
					hesap.statu = rs.getInt(5);
					hesap.personelId = rs.getInt(6);
					hesap.personel = PersonelController.Get(hesap.personelId);
					liste.add(hesap);
					
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
		
		public static boolean Ekle(Hesap hesap) {

			
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
				String SQL = "SELECT * FROM Hesap WHERE Urun_Adi = '" + urun.ad + "' OR Urun_id = \'" + urun.id + "\';";
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
	


}
