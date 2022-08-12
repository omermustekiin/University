package week15_LastWeek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class dosya_islemleri {

	public static void main(String[] args) throws IOException {
//		
//		addProduct();
//		
//		Scanner input = new Scanner(System.in);
//		for(int i = 0; i<3; i++) {
//			System.out.print("Prdocut Name: ");
//			String prd = input.next();
//			System.out.print("Price: ");
//			int prc = input.nextInt();
//			
//			addProduct(prd,prc);
		
		readProduct();
		//transfer();  //kopyalama i�lemi ger�ekle�ti
	}

	
	public static void addProduct() throws FileNotFoundException {
		File f = new File("D:\\Dersler\\3.s�n�f\\2.D�nem\\�leri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product"); //File s�n�f�ndan bir nesne �rettik
		PrintWriter p = new PrintWriter(f);  //Yazma arac�m�za, file s�n�f�ndaki nesneye yazaca��m�z i�in f parametresi verdik.
		
		p.print("--PRDCT--");
		p.print("--PR�CE--\n");
		p.close();
	}
	
	public static void addProduct(String productN, int price) throws IOException {
		
		FileWriter f = new FileWriter("D:\\Dersler\\3.s�n�f\\2.D�nem\\�leri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product", true); //buradaki true anlam�: Dosyan�n i�indeki bilgiler kals�n, silinmesin
		PrintWriter p =new PrintWriter(f);
		p.print(productN+"\t"+price+"\n");
		p.close();
	}
	
	public static void readProduct() throws FileNotFoundException {
		File f = new File("D:\\Dersler\\3.s�n�f\\2.D�nem\\�leri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product");
		
		Scanner input = new Scanner(f);
		while(true) {
			String row = input.nextLine(); //sat�r sat�r okuyoruz
			System.out.println(row);
		}
	
	}
	
	public static void transfer() throws IOException {
		File f = new File("D:\\Dersler\\3.s�n�f\\2.D�nem\\�leri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product");
		Scanner input = new Scanner(f);
		
		ArrayList<String> fileRecords=new ArrayList<String>();
		while(input.hasNext()) {
			String rows = input.nextLine();
			fileRecords.add(rows);
			
		}
		input.close();
		
		FileWriter f1 = new FileWriter("D:\\Dersler\\3.s�n�f\\2.D�nem\\�leri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product1");
		PrintWriter p = new PrintWriter(f1);
		
		for(String row: fileRecords) {
			p.println(row);
		}
		p.close();
	
		
	}
	
	public static void findCost() throws FileNotFoundException {
		File f = new File("D:\\Dersler\\3.s�n�f\\2.D�nem\\�leri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product");
		Scanner input = new Scanner(f);
		int sum=0;
		while(input.hasNext()) {
			String row = input.nextLine();
			String[] parts = row.split("\t"); //0.indiste name, ikinci indiste price var
			int price= Integer.parseInt(parts[1]);
			sum=sum+price;
		}
		System.out.println("Cost: "+sum);
	}
}






/*F�NAL SINAVI A�IKLAMASI

1 A��klamal� soru 
1 dosya soru ()
1 gui sorusu (40-45 puan) -  Tasar�m ve arkaplanda button actionlar�. Method tan�mlama vs ...(iki say�y� bi methodla toplas�n)
1 �u y�ntemi kullanrak ��z�n�z sorusu...

*/
	
	
	
	
	

