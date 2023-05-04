package reflection;

public class Person {
	public String name;
	private int age;
	
	
	public void method1()
	{
		System.out.println("The name is "+name);
	}
	
	public void method2(int n)
	{
		System.out.println("The number is "+n);
	}
	
	private void method3()
	{
		System.out.println("Private method invoked");
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
