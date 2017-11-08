package in.com.hikex.constructorchaining;
public class Child extends Parent {

	private int age;

	public Child(String fName, String lName, int age) {
		super(fName, lName);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
