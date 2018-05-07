package nku.sistemanalizi.marangoz.model;

import java.util.ArrayList;

public class Rapor {

	public Rapor()
	{
		gelirler=new ArrayList<Gelir>();
		giderler=new ArrayList<Gider>();
		net=0;
	}
	
	public ArrayList<Gelir> gelirler;
	public ArrayList<Gider> giderler;
	public float net;
	
}
