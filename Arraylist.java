package sample2;
import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> krishna = new ArrayList <Integer>();
		krishna.add(34);
		krishna.add(79);
		krishna.add(90);
		krishna.add(32);
		krishna.add(65);
		krishna.add(342);
		Collections.sort(krishna);
		for (int i: krishna) {
			System.out.println(i);
		}
				// TODO Auto-generated method stub

	}

}

