package nku.sistemanalizi.marangoz.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Hesap;
import nku.sistemanalizi.marangoz.model.Malzeme;
import nku.sistemanalizi.marangoz.model.SatisSiparis;
import nku.sistemanalizi.marangoz.model.SatisSiparisDetay;
import nku.sistemanalizi.marangoz.model.Statu;
import nku.sistemanalizi.marangoz.model.Urun;
import nku.sistemanalizi.marangoz.view.Application;

public class SatisSiparisController {
	public static ArrayList<SatisSiparis> liste = new ArrayList<SatisSiparis>();

	public static ArrayList<SatisSiparis>  Yenile(boolean tumu) {
		ArrayList<SatisSiparis> liste = new ArrayList<SatisSiparis>();
		
			ResultSet rs;
				rs=DB.Calistir("SELECT * FROM SatisFisi"+(tumu?" ;" : (" WHERE statu != "+Integer.toString(Statu.IPTAL))));

			// Iterate through the data in the result set and display it.
			try {
				while (rs.next()) {
					SatisSiparis satisSiparis = new SatisSiparis();
					
					satisSiparis.id= rs.getInt(1);
					satisSiparis.musteriId = rs.getInt(2);
					satisSiparis.fisTarihi = rs.getDate(3);
					satisSiparis.toplamTutar = rs.getFloat(4);
					satisSiparis.toplamIndirim = rs.getFloat(5);
					satisSiparis.toplamKDV = rs.getFloat(6);
					satisSiparis.netToplam = rs.getFloat(7);
					satisSiparis.olusturmaTarihi= rs.getDate(8);
					satisSiparis.statu = rs.getInt(9);
					satisSiparis.teslimTarihi = rs.getDate(10);
					satisSiparis.adres = rs.getString(11);
					
					satisSiparis.musteri = MusteriController.Get(satisSiparis.musteriId);
					liste.add(satisSiparis);
				}
				DB.Temizle(rs);
				
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return liste;
	}
	
	public static ArrayList<SatisSiparisDetay> GetDetaylar(int siparisId)
	{
		ResultSet rs=DB.Calistir("SELECT d.SatirNo,u.Urun_Adi,m.Malzeme_Adi,d.Renk,d.Ebat,d.Miktar,d.TamamlananMiktar,d.BirimTutar,d.ToplamTutar,d.Statu "
				+ "FROM SatisFisDetay d "
				+ "INNER JOIN Urunler u ON d.Urun_id=u.Urun_id "+
		"INNER JOIN Malzemeler m ON d.Malzeme_id=m.Malzeme_id "+
		"WHERE d.SatisFis_id="+Integer.toString(siparisId));
		
		ArrayList<SatisSiparisDetay> detaylar=new  ArrayList<SatisSiparisDetay>();
		
		try {
			while(rs.next())
			{
				
				SatisSiparisDetay detay=new SatisSiparisDetay();
				try {
				detay.satirNo=rs.getInt(1);
				detay.urun=new Urun();
				detay.urun.ad=rs.getString(2);
				detay.malzeme = new Malzeme();
				detay.malzeme.ad=rs.getString(3);
				detay.renk = rs.getString(4);
				detay.ebat= rs.getString(5);
				detay.miktar=rs.getInt(6);
				detay.tamamlananMiktar=rs.getInt(7);
				detay.birimTutar=rs.getFloat(8);
				detay.toplamTutar=rs.getFloat(9);
				detay.statu=rs.getInt(10);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				detay.urunId=siparisId;
				detaylar.add(detay);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DB.Temizle(rs);
		
		return detaylar;
		
		
	}
	
	public static boolean Ekle(SatisSiparis satisSiparis) {

		
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
			String SQL = "SELECT * FROM SatisFisi WHERE SatisFis_id = " + Integer.toString(satisSiparis.id)+";";
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
			String SQL = "INSERT INTO SatisFisi (Musteri_id, FisTarihi,ToplamTutar,ToplamIndirim,ToplamKDV,NetToplam,CreatedDate,Statu,TeslimTarihi,TeslimatAdresi) "
					+ "VALUES (" +satisSiparis.musteriId + "," + satisSiparis.fisTarihi + ","+satisSiparis.toplamTutar+"," 
					+satisSiparis.toplamIndirim+ ","+satisSiparis.toplamKDV+","+satisSiparis.netToplam+","+
					satisSiparis.olusturmaTarihi+","+satisSiparis.statu+","+satisSiparis.teslimTarihi+","+satisSiparis.teslimTarihi+");";
			stmt = con.createStatement();
			stmt.execute(SQL);
			
			SQL = "SELECT MAX(SatisFis_id)  FROM SatisFisi ;";
			Statement stmt2 = con.createStatement();
			rs=stmt2.executeQuery(SQL);
			if(rs.next())
			{
			satisSiparis.id=rs.getInt(1);
			}
			for(int i = 0; i < satisSiparis.detaylar.size();i++)
			{
				SQL = "INSERT INTO SatisFisDetay (SatisFis_id,SatirNo, Urun_id,Malzeme_id,TamamlananMiktar,Miktar,BirimTutar,ToplamTutar,Renk,Ebat,TeslimatAdresi,Statu) "
						+ "VALUES (" + satisSiparis.id+","+satisSiparis.detaylar.get(i).satirNo+ "," + satisSiparis.detaylar.get(i).urunId + ", " 
						+satisSiparis.detaylar.get(i).malzemeId + ","+satisSiparis.detaylar.get(i).tamamlananMiktar+","+
						satisSiparis.detaylar.get(i).miktar+","+satisSiparis.detaylar.get(i).birimTutar+","+satisSiparis.detaylar.get(i).toplamTutar
						+",'"+satisSiparis.detaylar.get(i).renk+"','"+satisSiparis.detaylar.get(i).ebat+"','"+satisSiparis.detaylar.get(i).adres
						+"',"+satisSiparis.detaylar.get(i).statu+");";
				stmt = con.createStatement();
				stmt.execute(SQL);
				
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
		
		
		Application.BilgiKutusu("ISLEM BASARILI", "Ekleme islemi basariyla gerceklestirildi!");
		return true;
	}
	public static int SonID() {
		int max=0;
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
					String SQL = "SELECT MAX(SatisFis_id)  FROM SatisFisi ;";
					stmt = con.createStatement();
					rs = stmt.executeQuery(SQL);

					if (rs.next()) {
						max=rs.getInt(1)+1;
					}
				}

				// Handle any errors that may have occurred.
				catch (Exception e) {
					e.printStackTrace();
					return max;
				}

				finally {
					if (rs != null)
						try {
							rs.close();
						} catch (Exception e) {
							return max;
						}
					if (stmt != null)
						try {
							stmt.close();
						} catch (Exception e) {
							return max;
						}
					if (con != null)
						try {
							con.close();
						} catch (Exception e) {
							return max;
						}
				}
		
				return max;
	}

	public static boolean Sil(SatisSiparis satisSiparis) {
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
			String SQL = "SELECT * FROM Urunler WHERE SatisFis_id = " + Integer.toString(satisSiparis.id) + ";";
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
			String SQL = " UPDATE  Urunler " + "SET Statu=" + Integer.toString(0) + " WHERE Urun_Adi='" + satisSiparis.id+ "';";
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
