package practicepack;

public class Animal {

	private String name="Rahul";
	
	private void de() {
		System.out.println("private method");
	}
	
	public void d(){
de();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	
	
	
	
	public void legs(int noOfLegs,String animalName) {
		System.out.println(animalName+" :"+noOfLegs);
	}
	
	public void legs(String animalName) {
		System.out.println(animalName);
	}
	public void legs(int animalName) {
		System.out.println(animalName);
	}

}
