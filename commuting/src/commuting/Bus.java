package commuting;


public class Bus {
	private static final int BUS_FARE = 1000;

	private int busNumber;
	private int numberOfPassenger;
	private int totalSales;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void getOn(Student student) {
		boolean isSuccess = student.pay(BUS_FARE);
		if(!isSuccess) {
			System.out.println(student.getName() + "님의 잔액이 부족하여 탑승에 실패했습니다.");
			return;
		}
		System.out.println(student.getName() + "님이 " + this.busNumber + "번 버스에 탑승했습니다.");
		this.numberOfPassenger++;
		this.totalSales += BUS_FARE;
	}

	public String toString() {
		return "해당 버스는 " + this.busNumber + "번 버스입니다. 현재 " + this.numberOfPassenger + "명의 승객이 탑승중이며, 지금까지 "
				+ this.totalSales + "원의 매촐이 발생했습니다.";
	}
}
