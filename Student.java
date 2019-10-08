package sample2;

public class Student {

	public static void main(String[] args) {
		School Schools[] = new School [6];
		
		Schools[0] = new School();
		Schools[0].name = "krishna";
		Schools[0].marks = 90;
		Schools[0].section = 'A';
		
		Schools[1] = new School();
		Schools[1].name = "kalai";
		Schools[1].marks = 99;
		Schools[1].section = 'b';
		
		Schools[2] = new School();
		Schools[2].name = "rajesh";
		Schools[2].marks = 98;
		Schools[2].section = 'C';
		
		Schools[3] = new School(); 
		Schools[3].name = "karthik";
		Schools[3].marks = 97;
		Schools[3].section = 'D';
		
		Schools[4] = new School ();
		Schools[4].name = "bala";
		Schools[4].marks = 96;
		Schools[4].section = 'A';
		
		
		Schools[5] = new School();
		Schools[5].name = "babu";
		Schools[5].marks = 95;
		Schools[5].section = 'E';
		System.out.println(Schools.length);
		
		for  (int i=0; i<Schools.length; i++){
			System.out.println( Schools[i].name + " in section " + Schools[i].section + " got " + Schools[i].marks +" marks. ");
			
			
		}
				
		
		// TODO Auto-generated method stub

	}

}

class School{
	String name;
	int marks;
	char section;
	String address;
	String mobile;
}