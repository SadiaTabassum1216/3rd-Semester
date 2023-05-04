package Collection;

public class person {

	String name;
	int roll;
	int age;
	
	public person(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", roll=" + roll + ", age=" + age + "]";
	}
}
