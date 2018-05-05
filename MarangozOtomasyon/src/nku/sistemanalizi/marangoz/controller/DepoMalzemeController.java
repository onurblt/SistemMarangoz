package nku.sistemanalizi.marangoz.controller;

import java.util.ArrayList;

import nku.sistemanalizi.marangoz.model.DepoMalzeme;


public class DepoMalzemeController {
	public static ArrayList<DepoMalzeme> liste = new ArrayList<DepoMalzeme>();

	public static boolean Yenile() {
		liste.clear();
		
		return true;
	}
}
