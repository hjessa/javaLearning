import java.text.MessageFormat;

public class Cube {

    private int edgeLength;

    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }

    public double volume(){
        return Math.pow(this.edgeLength,3);
    }

}
