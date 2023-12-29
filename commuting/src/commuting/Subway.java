package commuting;


public class Subway {
	private static final int SUBWAY_FARE = 1200;

	private int subwayNumber;
	private int numberOfPassenger;
	private int totalSales;

	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}

	public void getOn(Student student) {
		boolean isSuccess = student.pay(SUBWAY_FARE);
		if(!isSuccess) {
			System.out.println(student.getName() + "님의 잔액이 부족하여 탑승에 실패했습니다.");
			return;
		}
		System.out.println(student.getName() + "님이 " + this.subwayNumber + "호선 지하철에 탑승했습니다.");
		this.numberOfPassenger++;
		this.totalSales += SUBWAY_FARE;
	}

	public String toString() {
		return "해당 지하철은 " + this.subwayNumber + "호선입니다. 현재 " + this.numberOfPassenger + "명의 승객이 탑승중이며, 지금까지 "
				+ this.totalSales + "원의 매촐이 발생했습니다.";
	}
}
