package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s= new Student(1, "Arpita","Arpita@gtt");
		Student s2=new Student(2,"Rajsi","dd");
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s.equals(s2));
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
		

	}
	
	

}



