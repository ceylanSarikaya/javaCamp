package homeworkKodlamaTwo;

public class User {
	int Id;
	int courseId;
	String firstname;
	String lastname;
	String email;
	String paswword;

	public User(int id, int courseId, String firstname, String lastname, String email, String paswword) {
		super();
		Id = id;
		this.courseId = courseId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.paswword = paswword;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPaswword() {
		return paswword;
	}

	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}
}
