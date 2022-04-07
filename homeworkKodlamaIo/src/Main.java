

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C#", "C# ait resim", 15, "Yazılım Geliştirme Kampı");
		Course course2 = new Course(2, "Java", "Java ait resim", 15, "Yazılım Geliştirme Kampı");
		Course course3 = new Course(3, "JavaScript", "JavaScript ait resim", 15, "Yazılım Geliştirme Kampı");
		Teacher teacher = new Teacher(1, "Engin Demiog", "engindemirog@gmail.com", "12345");
		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.courseName + course.image + course.unitPrice + course.detail);
		}
		System.out.println(teacher.name + teacher.mail + teacher.password);

		CourseManager courseManager = new CourseManager();
		courseManager.Add(course3);
		courseManager.Delete(course2);
		courseManager.Update(course1);
		
		System.out.println("--------------------------------------YotubeHomeworkAsalSayi--------------------------------");
		int number=-2;
		int remainder=number % 2;
		boolean isPrime=true;
		if (number==1) {
		System.out.println("sayı asal değildir");
		return;
		}
		if (number<1) {
			System.out.println("sayı gecersizdir");
		}
		
		
		
		for (int i=2; i < number; i++) {
			if (number % i==0) {
				isPrime=false;
			}
		}
		if (isPrime) {
			System.out.println("sayı asaldır");
		}else {
			System.out.println("sayi asal degildir");
		}
		
	
	
	
	}
	

}
