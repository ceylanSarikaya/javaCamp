package oopIntro;

public class Product {

	// constructor(yapýcý) blogu
	//bir construct calýþmak zorunda býrden fazlavarsa sadece biri çalýþýr.
	public Product() {

	}

//ayný constructor tekrar oluþturmaya overloding(aþýrý yüklenme) denir
	// iki constructor oluþmasýna signature(imza ) denir
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
