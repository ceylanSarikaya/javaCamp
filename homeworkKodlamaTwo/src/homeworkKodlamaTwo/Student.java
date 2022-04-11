package homeworkKodlamaTwo;

public class Student extends User{
	String address;
	String contact;

	

	public Student(int id, int courseId, String firstname, String lastname, String email, String paswword,
			String address, String contact) {
		super(id, courseId, firstname, lastname, email, paswword);
		this.address = address;
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
