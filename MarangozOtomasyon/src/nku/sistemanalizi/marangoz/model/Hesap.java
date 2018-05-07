package nku.sistemanalizi.marangoz.model;

import java.sql.Date;

public class Hesap {
	public int id;
	public String kullaniciAdi;
	public String sifre;
	public Date olusturmaTarihi;
	public int statu;
	public int personelId;
	public Personel personel;
	public int yetki;

}
