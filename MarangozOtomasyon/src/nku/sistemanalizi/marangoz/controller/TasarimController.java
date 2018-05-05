package nku.sistemanalizi.marangoz.controller;

import java.util.ArrayList;

import nku.sistemanalizi.marangoz.model.Tasarim;

public class TasarimController {
	public static ArrayList<Tasarim> liste = new ArrayList<Tasarim>();

	public static boolean Yenile() {
		liste.clear();
		
		return true;
	}
}
