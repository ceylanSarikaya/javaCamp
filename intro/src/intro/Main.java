package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// camelCase kullanýlýr java da
		// Don't repeat yourself ==kendini Tekrar etme
		String internetSubeButtonu = "Ýnternet Þubesi";
		int dolar = 25;
		Double dolarDun = 8.5;
		Double dolarBugun = 14.5;
		boolean euro = true;

		System.out.println(internetSubeButtonu);
		if (dolarBugun < dolarBugun) {
			System.out.print("Dolar düþtü");

		} else if (dolarBugun > dolarBugun) {
			System.out.print("Dolar yükseldi");
		} else {
			System.out.print("Dolar dün ve bügün birbirine eþittir.");

		}
//tek tek yazmak yerine arreylerle yazýlmalý
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu kredi";
		String kredi3 = "Cifci kredi";
		String kredi4 = "Msb kredi";

		String[] krediler = { "Hýzlý kredi", "Mutlu kredi", "Cifci kredi", "Msb kredi" };
//Git tek dolaþ bana verileri getir.
//C# foreach

		for (String kredi : krediler) {
			System.out.print(kredi);

		}
		for (int i = 0; i < krediler.length; i++) {
			// git 0 elmaný bul ekrana yaz iþlem sonlanana kadar budfa 4 kez yazýlmasýna
			// sebeb olur.
			System.out.print(krediler[0]);
			// hangileri i iþlem sonlanana kadar yazar
			System.out.print(krediler[i]);
		}
		//Deðer ve Referans Tip
		//sayýsal veri tipleri deger tip int,bool, double
		//Deger tiplerde atamalar yapýlýr ve kopar
		//steack bölgesinde sayi1 10
		int sayi1=10;
		//steack bölgesinde sayi2 20
		int sayi2=20;
		//steack bölgesinde eþitlediðimde sayi1 20 olur
		sayi1=sayi2;
		//steack bölgesinde sayi2 artýk 100 olur
		sayi2=100;
		//steack bölgesinde sayi1 halen 20dir ve onu ekranana yazdýrýrým.
		System.out.print(sayi1);
		
		//arryler referans tiptir 
		//class,dizi,interface yapýlar ise referans tip
		//sayilar1 steak bölgesinde tutulur süslü parantes içindeki heap bölgesinde tutulur
		//buda birbirine baglantý kurulmnasý için örnegin 101 yada 102 kodla arkada tutar
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		//sayilar1 sayilar2 eþitlendiðinde artýk sayi 2 de ne deðiþiklik yapacaksan aynen yansýr 
		sayilar1=sayilar2;
		//sayýlar 2 ilk degeri 100 ise artýk sayýlar1 degeride 100dur.
		sayilar2[0]=100;
		System.out.print(sayilar1[0]);
	}
	// kodlar control+shift+f
}
