package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		

		//Tip Donusumu
		//Calisan ogrenci = (Calisan) context.getBean("beanCalisan");
		
		// Parametrede sinif adi
		Calisan calisan = context.getBean("beanCalisan",Calisan.class);
		
		// Dogrudan sinif adi
		//Calisan calisan3 = (Calisan) context.getBean(Calisan.class);


		System.out.println("Adi :"     + calisan.getAdi());
		System.out.println("Soyadi :"  + calisan.getSoyadi());
		System.out.println("Yasi"      + calisan.getYas());
		System.out.println("Mahalle :" + calisan.getAdres().getMahalle());
		System.out.println("Semt :"    + calisan.getAdres().getSemt());
		System.out.println("Sehir :"   + calisan.getAdres().getSehir());

	}

}
