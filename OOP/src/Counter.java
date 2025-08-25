import java.text.MessageFormat;

public class Counter {

    private int value;

    public Counter(int startValue){
        this.value = startValue;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return this.value;
    }

    public void increase(){
        this.value += 1;
    }

    public void increase(int increasedBy){
        if(increasedBy > 0){
            this.value += increasedBy;
        }
    }

    public void decrease(){
        this.value -= 1;
    }

    public void decrease(int decreasedBy){
        if(decreasedBy > 0){
            this.value -= decreasedBy;
        }
    }

    public String toString(){
        return MessageFormat.format("{0}",this.value);
    }

}
