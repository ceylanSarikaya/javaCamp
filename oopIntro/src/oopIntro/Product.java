package oopIntro;

public class Product {

	// constructor(yap�c�) blogu
	//bir construct cal��mak zorunda b�rden fazlavarsa sadece biri �al���r.
	public Product() {

	}

//ayn� constructor tekrar olu�turmaya overloding(a��r� y�klenme) denir
	// iki constructor olu�mas�na signature(imza ) denir
	public Product(int id, String name, double unitPrice, String detail) {
//this bu classta ki =ismi ,id vb
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;

	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
