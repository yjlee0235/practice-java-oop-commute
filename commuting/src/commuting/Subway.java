package commuting;


public class Subway extends Transportation{
    public Subway(int number) {
        super(number);
        this.FARE = 1200;
        this.type = "지하철";
    }
}
