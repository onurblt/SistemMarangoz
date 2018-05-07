package nku.sistemanalizi.marangoz.model;

import java.sql.Date;

public class Gelir {
	public int id;
	public String tur;
	public float tutar;
	public Date tarih;
	public int siparisId;
	public SatisSiparis siparis;
	public String aciklama;
	
}
