package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Fox());
		farm.add(new Aidan());
		farm.add(new Pig());
		farm.add(new Rat());
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).eat();
			farm.get(i).makeNoise();
		}
	}
}
