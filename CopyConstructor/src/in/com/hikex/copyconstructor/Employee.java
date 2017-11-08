package in.com.hikex.copyconstructor;
public class Employee implements Cloneable {

	private String fName;
	private String lName;
	private int age;

	public Employee(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// This is example of copy constructor. The benefit of copy constructor over
	// object cloning is that with copy constructor we can restrict what to
	// copy
	// what not to copy
	public Employee(Employee employee) {
		this.fName = employee.getfName();
		this.lName = employee.getlName();
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
