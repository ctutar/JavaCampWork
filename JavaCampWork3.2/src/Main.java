
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				// Student
				StudentManager studentManager = new StudentManager();
				
				Student student = new Student(1, "Cansu", "Tutar", "cansu@gmail.com", "123","Kahramanmaraş");
				
				studentManager.add(student);
				
				student.setEmail("cansu-123@gmail.com");
				studentManager.update(student);
				System.out.println("Güncellenen mail adresi => "+student.getEmail());
				
				studentManager.addAddress(student, "Ankara");
				
				studentManager.addComment("Ödev GitHuba yüklendi.");

				
				//Instructor
				InstructorManager instructorManager = new InstructorManager();
		
				Instructor instructor = new Instructor(1, "Engin", "Demirog", "engin@gmail.com", "123456", "Yazılım");
					
				instructorManager.add(instructor);
				
				instructorManager.addCourse("Java");
				
				instructorManager.deleteCourse("Java");
				
			}

	}


