package opps;
class Parent{
	String hairColor = "black";
	void behaviour() {
		System.out.println("Attitude");
	}
			
}
class Child extends Parent{
	String hairColor = "cyan";
	void behaviour() {
		System.out.println("Less Attitude");
	}
}
public class InheritanceClass {
	public static void main(String[]args) {
		Parent obj = new Child();
		obj.behaviour();
		
	}
}
