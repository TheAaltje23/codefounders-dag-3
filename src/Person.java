
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("In constructor");
		name = "Alex";
		age = 0;
	}
	
	public void printName() {
		System.out.println("Mijn naam is " + name);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public boolean isAdult() {
		return age >= 18;
	}
}
