package com.sistemanalizi.marangoz.model;

import java.sql.Date;

public class Personel {
	
	
	public Personel(int yetkiGucu)
	{
		yetki=yetkiGucu;
	}
	
	
	public int id;
	public String ad;
	public String kullaniciAdi;
	public String sifre;
	public int yetki;
	public int sicilNo;
	public Date dogumTarihi;
	public String dogumYeri;
	public String TCno;
	public String unvan;
	public String telNo;
	public String adres;
	
	
}
