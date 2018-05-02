package com.sistemanalizi.marangoz.controller;

import java.io.File;
import java.io.IOException;

import org.ini4j.Ini;
import org.ini4j.IniPreferences;
import org.ini4j.InvalidFileFormatException;

public class DBAyari {

	
	
	public static void DosyadanYukle(String dosyaAdi)
	{
		Ini ini;
		try {
			ini = new Ini(new File(dosyaAdi));
			java.util.prefs.Preferences prefs = new IniPreferences(ini);
			sunucu=prefs.node("VERITABANI").get("Sunucu", "localhost");
			port=prefs.node("VERITABANI").getInt("Port", 1433);
			dbAdi=prefs.node("VERITABANI").get("DbAdi", "mrngz");
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
	
	
	public static String sunucu;
	public static int port;
	public static String dbAdi;
}
