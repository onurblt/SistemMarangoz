package nku.sistemanalizi.marangoz.controller;

import java.util.ArrayList;

import nku.sistemanalizi.marangoz.model.Malzeme;


public class MalzemeController {
	public static ArrayList<Malzeme> liste = new ArrayList<Malzeme>();

	public static boolean Yenile() {
		liste.clear();
		
		return true;
	}
}
