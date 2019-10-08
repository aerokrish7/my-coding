package sample2;
class teacher {
	String designation = "teacher";
	String collegename = "beginners book";
	void does () {
		System.out.println("Teaching");
	}
}

public class Arraylist5 extends teacher {
String mainsubject = "physics";
	public static void main(String[] args) {
		Arraylist5 obj = new Arraylist5 ();
		System.out.println(obj.collegename);
		System.out.println(obj.designation);
		System.out.println(obj.mainsubject);
		obj.does();		
		// TODO Auto-generated method stub

	}

}