package chapter5;

import java.util.ArrayList;

public class AnimalsArray {

	public static void main(String[] args) {
		ArrayList<String> Animals = new ArrayList<String>();
		Animals.add("cat");
		Animals.add("dog");
		Animals.add("horse");
		Animals.add("cow");
		Animals.add("leopard");
		System.out.println(Animals.get(2));
		System.out.println(Animals.get(4));
		System.out.println(Animals.size());
		Animals.set(3,"buffalo");
		Animals.set(4,"tiger");
		Animals.remove(0);
		Animals.remove(0);
		for(String i : Animals)
		{
			System.out.println(i);
		}

	}

}
