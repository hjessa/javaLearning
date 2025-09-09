import java.text.MessageFormat;
import java.util.ArrayList;

public class SimpleCollection {

    private String collectionName;
    private int count;
    private ArrayList<String> collection;

    public SimpleCollection(String name){
        this.collectionName = name;
        this.collection = new ArrayList<>();
        this.count = 0;
    }

    public void add(String element){
        this.collection.add(element);
        this.count++;
    }

    public String toString(){

        String output = MessageFormat.format("The collection {0} is empty",this.collectionName);

        if(this.count == 0){
            return output;
        }

        if(this.count == 1){
            output = MessageFormat.format("The collection {0} has {1} element",this.collectionName,this.count);
        }
        if(this.count > 1){
            output = MessageFormat.format("The collection {0} has {1} elements",this.collectionName,this.count);
        }

        String elements = "\n";
        for (String s : collection) {
            elements = elements + s +"\n";
        }

        return output + elements;
    }

    public String longest(){

        if(this.collection.isEmpty()){
            return null;
        }

        String longest = this.collection.get(0);

        for (String s : collection) {

            if(s.length() > longest.length()){
                longest = s;
            }
        }

        return longest;
    }

}
