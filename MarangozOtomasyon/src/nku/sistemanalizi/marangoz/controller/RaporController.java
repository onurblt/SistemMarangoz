package nku.sistemanalizi.marangoz.controller;

import java.util.ArrayList;

import nku.sistemanalizi.marangoz.model.Rapor;

public class RaporController {
	public static ArrayList<Rapor> liste = new ArrayList<Rapor>();

	public static boolean Yenile() {
		liste.clear();
		
		return true;
	}
}
