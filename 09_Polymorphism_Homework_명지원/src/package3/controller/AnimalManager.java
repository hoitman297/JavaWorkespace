package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal arr[] = new Animal[5];
		
		arr[0] = new Dog("1","1", 0);
		arr[1] = new Cat("2","2", "툰드라 ",9);
		arr[2] = new Dog("3","3", 0);
		arr[3] = new Cat("4","4", " 사막",9);
		arr[4] = new Dog("5","5", 0);
		
		for(Animal am : arr) {
			am.speak();
		}
		
	}
}
