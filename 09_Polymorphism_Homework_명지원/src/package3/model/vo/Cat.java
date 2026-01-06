package package3.model.vo;

public class Cat extends Animal{
	private String location;
	private int color;
	
	public Cat(){
		
	}
	
	public Cat(String name, String kind,String location, int color) {
		super(name, kind);
		this.location = location;
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}


	public void speak() {
		System.out.println(toString() + " " + location + " " + " " + color + "Kg");
	}
}
