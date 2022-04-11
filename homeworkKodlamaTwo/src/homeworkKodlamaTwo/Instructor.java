package homeworkKodlamaTwo;

public class Instructor extends User{
	String biography;
	String profession;

	

	public Instructor(int id, int courseId, String firstname, String lastname, String email, String paswword,
			String biography, String profession) {
		super(id, courseId, firstname, lastname, email, paswword);
		this.biography = biography;
		this.profession = profession;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}
