package kamp2_1Odev;

public class Main {

	public static void main(String[] args) {
	
		Course course1=new Course(1 , "Java + React", "Engin Demiroð" );
		Course course2=new Course(2,"C# + Angular", "Engin Demiroð");
		Course course3=new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð");
		
		Course[] courses= {course1, course2,course3};
		
		for(Course course:courses) 
		{
			System.out.println("Kurs Adý:"+course.CourseName);
			
			
			
		}
		
		
		System.out.println("---------------------------------------------");
		
		User user1=new User(1,"Kader Nur Tekin", "tekinkadernur@gmail.com");
		User user2=new User(2,"Helin Tekin", "helintekin65@gmail.com");
		
		User[] users={user1,user2};
	for(User user:users) {
	
		System.out.println("Kullanýcý adý:"+user.UserName);
		System.out.println("Kullanýcý iletiþim:"+user.UserMail);
	}
	
	
	
	CourseRegister courseRegister=new CourseRegister();
	courseRegister.Register(course1);
	courseRegister.Register(course2);
	courseRegister.RegisterExit(course3);
		
		
	}
	
		
		

	}


