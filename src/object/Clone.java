package object;

import java.util.Objects;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person(1,"abc","abc");
		System.out.println("Person is : "+person.toString());
		
		Person person1 = new Person(2,"xyz","xyz");
		System.out.println("Person is : "+person1.toString());
		
		Person person2 = (Person) person1.clone();
		System.out.println("\nCloned values are \n");
		System.out.println(person2);
	}

}

class Person implements Cloneable{
	
	private int id;
	private String name;
	private String address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override 
	public Person clone()
    {
        try {
            return (Person)super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
