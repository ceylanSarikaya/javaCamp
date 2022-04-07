

public class CourseManager {
	public void Add(Course course) {
		System.out.println(course.courseName +"Kurs eklendi");
	}
	public void Delete(Course course) {
		System.out.println(course.courseName +"Kurs silindi" );
	}
	public void Update(Course course) {
		System.out.println(course.courseName +"Kurs güncellendi" );
	}
}
