package commuting;


public class Bus extends Transportation {
    public Bus(int number) {
        super(number);
        this.FARE = 1000;
        this.type = "버스";
    }
}
