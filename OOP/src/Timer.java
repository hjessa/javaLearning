import java.text.MessageFormat;

public class Timer {

    private ClockHand seconds;
    private ClockHand hundredsOfSeconds;

    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredsOfSeconds = new ClockHand(100);
    }

    public String toString(){
        return MessageFormat.format("{0}:{1}",this.seconds,this.hundredsOfSeconds);
    }

    public void advance(){

        this.hundredsOfSeconds.advance();
        if(this.hundredsOfSeconds.value() == 0){
            this.seconds.advance();
        }


    }


}
