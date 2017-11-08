package in.com.hikex.constructorchaining;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class WithInClassConstructorChaining {
	private String fName;
	private String lName;
	private int age;

	public WithInClassConstructorChaining(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public WithInClassConstructorChaining(String fName, String lName, int age) {
		this(fName, lName);
		this.age = age;
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
