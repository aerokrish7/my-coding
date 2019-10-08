package sample2;
import java.util.*;
public class Arraylist2 {
public static void main(String[] args) {
	ArrayList<String>alist = new ArrayList<String>();
	alist.add("steve");
	alist.add("ramu");
	alist.add("somu");
	alist.add("raja");
	alist.add("thalapathy");
	alist.add("thala");
	System.out.println(alist);
	alist.remove("steve");
	alist.remove("thalapathy");
	System.out.println(alist);
	alist.remove(2);
	System.out.println(alist);
// TODO Auto-generated method stub

	}

}
