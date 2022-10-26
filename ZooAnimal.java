package myexam1_10_26_2022;

public class ZooAnimal {
	private String name;
	private String type;
	private int age;
	private boolean hungry;

    public ZooAnimal(String name, Integer age, boolean hungry) {
        this.name = name;
        this.age = age;
        this.hungry = hungry;
    }
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	public String hungrys(String starving) {
		
		if(getAge() > 0){
			
			starving = "The zoo animal is hungry";
			
	        return starving;
	        }
	        return "The zoo animal is not hungry";
    }
	
	String ZooAnimalInfo(String starving) {
		return String.format("The zoo animal name %s is %01d years old. " +
				hungrys(starving), getName(), getAge());
	}
	
}
