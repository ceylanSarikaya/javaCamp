package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// camelCase kullan�l�r java da
		// Don't repeat yourself ==kendini Tekrar etme
		String internetSubeButtonu = "�nternet �ubesi";
		int dolar = 25;
		Double dolarDun = 8.5;
		Double dolarBugun = 14.5;
		boolean euro = true;

		System.out.println(internetSubeButtonu);
		if (dolarBugun < dolarBugun) {
			System.out.print("Dolar d��t�");

		} else if (dolarBugun > dolarBugun) {
			System.out.print("Dolar y�kseldi");
		} else {
			System.out.print("Dolar d�n ve b�g�n birbirine e�ittir.");

		}
//tek tek yazmak yerine arreylerle yaz�lmal�
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu kredi";
		String kredi3 = "Cifci kredi";
		String kredi4 = "Msb kredi";

		String[] krediler = { "H�zl� kredi", "Mutlu kredi", "Cifci kredi", "Msb kredi" };
//Git tek dola� bana verileri getir.
//C# foreach

		for (String kredi : krediler) {
			System.out.print(kredi);

		}
		for (int i = 0; i < krediler.length; i++) {
			// git 0 elman� bul ekrana yaz i�lem sonlanana kadar budfa 4 kez yaz�lmas�na
			// sebeb olur.
			System.out.print(krediler[0]);
			// hangileri i i�lem sonlanana kadar yazar
			System.out.print(krediler[i]);
		}
		//De�er ve Referans Tip
		//say�sal veri tipleri deger tip int,bool, double
		//Deger tiplerde atamalar yap�l�r ve kopar
		//steack b�lgesinde sayi1 10
		int sayi1=10;
		//steack b�lgesinde sayi2 20
		int sayi2=20;
		//steack b�lgesinde e�itledi�imde sayi1 20 olur
		sayi1=sayi2;
		//steack b�lgesinde sayi2 art�k 100 olur
		sayi2=100;
		//steack b�lgesinde sayi1 halen 20dir ve onu ekranana yazd�r�r�m.
		System.out.print(sayi1);
		
		//arryler referans tiptir 
		//class,dizi,interface yap�lar ise referans tip
		//sayilar1 steak b�lgesinde tutulur s�sl� parantes i�indeki heap b�lgesinde tutulur
		//buda birbirine baglant� kurulmnas� i�in �rnegin 101 yada 102 kodla arkada tutar
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		//sayilar1 sayilar2 e�itlendi�inde art�k sayi 2 de ne de�i�iklik yapacaksan aynen yans�r 
		sayilar1=sayilar2;
		//say�lar 2 ilk degeri 100 ise art�k say�lar1 degeride 100dur.
		sayilar2[0]=100;
		System.out.print(sayilar1[0]);
	}
	// kodlar control+shift+f
}
