package com.furkankara;

public class Calisan {

	String adi,soyadi;
	int yas;
	Adres adres;
	
	//---------------------------------------
	public Calisan(String adi, String soyadi, int yas, Adres adres) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.yas = yas;
		this.adres = adres;
	}
	//---------------------------------------

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	//-----------------------------------
	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//-----------------------------------

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	//-----------------------------------

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	
}
