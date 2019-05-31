package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private final int id;
	private List<Student>students =new ArrayList<>();
	public Department(int id) {
		this.id=id;
	}
	public int getDeptId() {
		return deptId;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public void printStudents() {
		students.parallelStream()
		.forEach(
				s ->System.out.println(s.getRollNumber()));
	}
    
}
