package package3.model.vo;

public class Dog extends Animal{
	private final String PLACE = "애견카페";
	private int weight;
	
	public Dog(){
		
	}
	
	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


	public void speak() {
		System.out.println(super.toString() + " " + weight + "Kg");
	}
}
