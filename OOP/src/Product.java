import java.text.MessageFormat;

public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight){

        this.name = name;
        this.location = location;
        this.weight = weight;

    }

    public Product(String name, String location){
        this(name,location,1);
    }

    public Product(String name, int weight){
        this(name,"from the shelf",weight);
    }

    public Product(String name){
        this(name,"form the shelf",1);
    }

    public String toString(){
        return MessageFormat.format("{0} measure ({1}kg) can be foung {2}",this.name,this.weight,this.location);
    }
}
