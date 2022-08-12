package vize.soru2;

import java.util.Scanner;

public class KarneTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ogrenci bilgilerini girin : "); //S�navda yazmasan da olur
		
		String ad = input.nextLine();
		String soyad = input.nextLine();
		String yas = input.nextLine();
		String cinsiyet = input.nextLine();
		String tcno = input.nextLine();
		
		Ogrenci ogrenci = new Ogrenci(ad, soyad, yas, cinsiyet, tcno);
		
		System.out.print("Ders say�s�n� giriniz : "); //S�navda yazmasan da olur
		
		int adet = input.nextInt();
		String[] dersler = new String[adet];
		int[] krediler = new int[adet];
		int[] notlar = new int[adet];
		
		input.nextLine(); //�nemsiz
		
		for(int i = 0; i<adet; i++) {
			System.out.println("Ders ad�");
			dersler[i] = input.nextLine();
			System.out.println("Notu");
			notlar[i] = input.nextInt();
			System.out.println("Kredisi");
			krediler[i] = input.nextInt();
			input.nextLine(); //�nemsiz
		}
		
		Karne karne = new Karne(ogrenci, dersler, krediler, notlar);
		karne.yazKarne();
		System.out.println(karne.burOrtalama());
		
	}

}
