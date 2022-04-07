package oopIntro;

public class Product {

	// constructor(yap�c�) blogu
	//bir construct cal��mak zorunda b�rden fazlavarsa sadece biri �al���r.
	public Product() {

	}
//private sadece bu sayfada okunur ama getter ve setterini olsturdugum i�in
	//d�sardak� class da setter olarak okuaya bilir.
private	int id;
private	String name;
private	double unitPrice;
private	String detail;
private	double discount;
	//encapsullation:
//private	double unitPriceAfterDiscount;
	
	public Product(int id, String name, double unitPrice, String detail,double dicount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=dicount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}

}
//getter(okuma ) ve setter(yazma) oldugunda sadece okuna b�l�r olmal�
//encapsullation:
//ayn� constructor tekrar olu�turmaya overloding(a��r� y�klenme) denir
		// iki constructor olu�mas�na signature(imza ) denir
//		public Product(int id, String name, double unitPrice, String detail) {
//	//this bu classta ki =ismi ,id vb
//			this.id = id;
//			this.name = name;
//			this.detail = detail;
//			this.unitPrice = unitPrice;
//
//		}
