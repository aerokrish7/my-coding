package sample2;
class employee {
	String name = "krishna";
	float amount = 1.1f;
	char letter = 'S';
	void does () {
	}
}
public class Arraylist6 extends employee {
	String mainsubject = "EMPLYEE";
public static void main(String[] args) {
	Arraylist6 obj = new Arraylist6();
	System.out.println(obj.name);
	System.out.println(obj.amount);
	System.out.println(obj.mainsubject);
	System.out.println(obj.letter);
	obj.does ();
	}

}
