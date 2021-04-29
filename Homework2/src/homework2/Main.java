package homework2;
public class Main {

	public static void main(String[] args) {
		Course course1 =new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(C#+ ANGULAR)","Engin Demirog");
		Course course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demirog");
		Course course3= new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demirog");
   
	Course[] courses = {course1,course2,course3};
	for(Course course : courses){
		System.out.println(course.name);
	}
	System.out.println(courses.length);
	CourseManager courseManager=new CourseManager();
	courseManager.addCourse(course1);
	courseManager.addCourse(course2);
	courseManager.addCourse(course3);
	courseManager.delete(course1);
	courseManager.delete(course2);
	courseManager.delete(course3);
	}


}
