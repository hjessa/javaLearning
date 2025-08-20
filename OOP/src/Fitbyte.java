import java.text.MessageFormat;

public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percantage){
        double maxHeartRate = 206.3 - (0.711* this.age);
        return maxHeartRate * percantage;
    }

    public String toString(double percantage, Fitbyte assitant){
        double fullPercantage = percantage * 100;
        return MessageFormat.format("Target {0}%, of maximum {1}",fullPercantage,assitant.targetHeartRate(percantage));
    }

}
