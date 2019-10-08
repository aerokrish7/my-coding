package sample2;
import java.util.ArrayList;
import java.util.Collections;

public class stringcollections {

	public static void main(String[] args) {
		ArrayList<String>cricketers = new ArrayList<String>();
		cricketers.add("KOHLI");
		cricketers.add("DHONI");
		cricketers.add("RAHUL");
		cricketers.add("PANT");
		cricketers.add("BUMRAH");
		cricketers.add("SHAMI");
		Collections.sort (cricketers);
		for (String i : cricketers) {
			System.out.println(i);
			
			
		}
		
		
		
	
		// TODO Auto-generated method stub

	}

}
