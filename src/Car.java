
public class Car {
	private String brand;
	private String model;
	private String color;
	private int mileage;
	private boolean stolen;
	
	// NO ARGS CONSTRUCTOR (DEFAULT VALUES OR OTHER INITIALIZATIONS)
	public Car() {
		brand = "Opel";
		model = "Corsa";
		color = "white";
		mileage = 10000;
		stolen = false;
	}
	
	// CONSTRUCTOR WITH ARGS
	public Car(String newBrand, String newModel, String newColor, int newMileage, boolean newStolen) {
		brand = newBrand;
		model = newModel;
		color = newColor;
		mileage = newMileage;
		stolen = newStolen;
	}
	
	public void printBrand() {
		System.out.println("Brand: " + brand);
	}
	
	public void printAllData() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Mileage: " + mileage);
		System.out.println("Stolen?: " + stolen);
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setAll(String newBrand, String newModel, String newColor, int newMileage, boolean newStolen) {
		brand = newBrand;
		model = newModel;
		color = newColor;
		mileage = newMileage;
		stolen = newStolen;
	}
	
	public boolean isHighMileage() {
		return mileage >= 50000;
	}
}
