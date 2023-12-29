package dev.syntax.commuting;

public class Student {
	private String name;
	private int amount;

	public Student(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	public boolean pay(int cost) {
		if(this.amount < cost) {
			return false;
		}
		amount -= cost;
		return true;
	}

	public String toString() {
		return "학생 이름은 " + this.name + "이고, 현재 " + this.amount + "원을 가지고 있습니다.";
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}
}
