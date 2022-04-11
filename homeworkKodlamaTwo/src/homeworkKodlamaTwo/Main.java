package homeworkKodlamaTwo;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		Student student =new Student(1, 2, "Ceylan", "Sarýkaya", "ceylan@gmail.com", "12345", "Erzurum", "0235472");
		Instructor instructor=new Instructor(1, 2, "Engin", "Demirog", "engin@gmail.com", "8975453", "Ýyi bir egitmen", "Yazýlým");
		User []user ={student,instructor};
		System.out.println(user);
		System.out.println("-------------------------------------------");

		UserManager userManager= new UserManager();
	 
	}

}
