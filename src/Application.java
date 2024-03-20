
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// PERSON
		Person person1 = new Person();
		person1.setName("Alex");
		person1.setAge(26);
		person1.printName();
		boolean adult = person1.isAdult();
		System.out.println(adult);
		
		// CAR
		Car car1 = new Car("Mercedes", "AMG", "silver", 50000, false);
		Car car2 = new Car();
		
		car1.printBrand();
		car2.printBrand();
		car1.printAllData();
		car2.printAllData();
		
		car1.setColor("black");
		car2.setAll("Ferrari", "F50", "red", 5000, false);
		car2.printAllData();
		
		boolean highMileage = car2.isHighMileage();
		System.out.println("Does this car have high milegae? " + highMileage);
	}
}
