package homeworkKodlamaTwo;

public class StudentManager extends UserManager {
	public void Add(User user) {
		System.out.println("EKLENDÝ");
	}
	public void Delete(User user) {
		System.out.println("Silindi");
	}
	public void Update(User user) {
		System.out.println("Güncellendi");
	}
	public void Listed(User user) {
		System.out.println("Listelendi");
	}
}
