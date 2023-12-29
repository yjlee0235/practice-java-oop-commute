package dev.syntax.commuting;

public class CommutingSystem {
	public static void main(String[] args) {
		Bus bus = new Bus(271);
		Subway subway = new Subway(2);
		
		Student student1 = new Student("학생1", 10000);
		Student student2 = new Student("학생2", 1000);
		Student student3 = new Student("학생3", 1000);
		
		bus.getOn(student1);
		subway.getOn(student2);
		bus.getOn(student3);
		
		System.out.println();
		System.out.println(bus);
		System.out.println(subway);
		
		System.out.println();
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}
