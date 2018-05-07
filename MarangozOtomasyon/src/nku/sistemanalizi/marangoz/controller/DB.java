package nku.sistemanalizi.marangoz.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.ini4j.Ini;
import org.ini4j.IniPreferences;
import org.ini4j.InvalidFileFormatException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import nku.sistemanalizi.marangoz.model.Musteri;

public class DB {

	public static Connection con = null;
	public static SQLServerDataSource ds = null;
	public static Statement stmt;
	public static PreparedStatement ps=null;
	
	public static void DosyadanYukle(String dosyaAdi) {
		Ini ini;
		try {
			ini = new Ini(new File(dosyaAdi));
			java.util.prefs.Preferences prefs = new IniPreferences(ini);
			sunucu = prefs.node("VERITABANI").get("Sunucu", "localhost");
			port = prefs.node("VERITABANI").getInt("Port", 1433);
			dbAdi = prefs.node("VERITABANI").get("DbAdi", "MarangozAtolyesi");
			System.out.println(sunucu);
			System.out.println(port);
			System.out.println(dbAdi);
		} catch (InvalidFileFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static ResultSet Calistir(String SQL) {
		ResultSet rs;
		try {
			ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(DB.sunucu);
			ds.setPortNumber(DB.port);
			ds.setDatabaseName(DB.dbAdi);
			con = ds.getConnection();

			// Create and execute an SQL statement that returns some data.
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			
			

		}

		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return rs;

	}

	public static void Temizle(ResultSet rs) {
		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		if (stmt != null)
			try {
				stmt.close();
			} catch (Exception e) {
			}
		if (con != null)
			try {
				con.close();
			} catch (Exception e) {
			}

	}

	public static String sunucu = "localhost";
	public static int port = 1433;
	public static String dbAdi = "MarangozAtolyesi";
}
