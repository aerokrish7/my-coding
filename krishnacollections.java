package sample2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class krishnacollections {

	public static void main(String[] args) {
ArrayList <String> players = new ArrayList <String>();
players.add("dhoni");
players.add("rahul");
players.add("summa");
players.add("kohli");
players.add("dinesh");
players.add("pant");
players.add("bumrah");
players.add("shami");
Collections.sort(players);
for (String i : players) {
	System.out.println(i);
	
}
 
		// TODO Auto-generated method stub

	}

}
