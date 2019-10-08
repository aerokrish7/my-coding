package sample2;
import java.util.*;
public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList <String> alist = new ArrayList<String>();
		alist.add("steve");
		alist.add("ramu");
		alist.add("somu");
		alist.add("raja");
		alist.add("thalapathy");
		alist.add("thala");
		System.out.println(alist);
		alist.add(3,  "steve");
		System.out.println(alist);
	}
	}