package object;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.toString();
		
		Employee employee1 = new Employee(1,"abc","Pune");
		String emp = employee1.toString();
		System.out.println(emp);
	}

}

class Employee{
	
	private int empId;
	private String name;
	private String address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		System.out.println("This is toString() of employee class \n");
		return "Employee [empId=" + this.empId + ", name=" + name + ", address=" + address + "]";
	}
}
