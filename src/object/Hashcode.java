package object;

import java.util.Objects;

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(student);
		System.out.println(student.toString());
	}

}

class Student{
	
	private int rollNumber;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber);
	}	
}
