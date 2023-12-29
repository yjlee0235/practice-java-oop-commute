package commuting;

public class Transportation {
    int FARE;
    int number;
    int numberOfPassenger;
    int totalSales;
    String type;

    public Transportation(int number) {
        this.number = number;
    }

    public void getOn(Student student) {
        boolean isSuccess = student.pay(FARE);
        if(!isSuccess) {
            System.out.println(student.getName() + "님의 잔액이 부족하여 탑승에 실패했습니다.");
            return;
        }
        System.out.println(student.getName() + "님이 " + this.number + "호선" +type+ "에 탑승했습니다.");
        this.numberOfPassenger++;
        this.totalSales += FARE;
    }

    public String toString() {
        return "해당 "+type+"은" + this.number + "호선입니다. 현재 " + this.numberOfPassenger + "명의 승객이 탑승중이며, 지금까지 "
                + this.totalSales + "원의 매촐이 발생했습니다.";
    }


}
