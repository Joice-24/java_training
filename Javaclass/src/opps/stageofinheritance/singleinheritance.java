package opps.stageofinheritance;

class Parent1{
	String hairColor = "black";
	void behaviour() {
		System.out.println("Attitude");
	}
			
}
class Child1 extends Parent1{
	String hairColor = "cyan";
	void behaviour() {
		System.out.println("Less Attitude");
	}

public class singleinheritance {
	public static void main(String[]args) {
		Parent1 obj = new Child1();
		obj.behaviour();
}
}
}