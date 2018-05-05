package nku.sistemanalizi.marangoz.controller;

import java.util.ArrayList;

import nku.sistemanalizi.marangoz.model.Urun;

public class UrunController {
	public static ArrayList<Urun> liste = new ArrayList<Urun>();

	public static boolean Yenile() {
		liste.clear();
		
		return true;
	}
}
