package nku.sistemanalizi.marangoz.model;

import java.sql.Date;
import java.util.ArrayList;

public class SatisSiparis {

	public SatisSiparis()
	{
		detaylar = new ArrayList<SatisSiparisDetay>();
	}
	
	public int id;
	public int musteriId;
	public Musteri musteri;
	public Date fisTarihi;
	public float toplamTutar;
	public float toplamIndirim;
	public float toplamKDV;
	public float netToplam;
	public Date olusturmaTarihi;
	public int statu;
	public Date teslimTarihi;
	public String adres;
	public ArrayList<SatisSiparisDetay> detaylar;
	
	
}
