package object;

public class GetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new StudentOne();
		Class cls = object.getClass();
		System.out.println("Name of class is : "+cls.getName());
	}

}

class StudentOne{
	
	public void display() {
		System.out.println("This is display method inside student class.");
	}
}
