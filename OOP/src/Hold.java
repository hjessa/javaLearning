import java.text.MessageFormat;
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(!(suitcase.getAllItemsWeight() + this.getAllSuitcasesWeight()  >= this.maxWeight)){
            this.suitcases.add(suitcase);
        }
    }

    public int getAllSuitcasesWeight(){
        if(this.suitcases.isEmpty()){
            return 0;
        }

        int sum = 0;
        for (Suitcase suitcase : suitcases) {
            sum = sum + suitcase.getAllItemsWeight();
        }

        return sum;
    }

    public String toString(){

        String returnMessage = "";

        if(this.suitcases.isEmpty()){
            return "no items (0 kg)";
        }

        if(this.suitcases.size() == 1){
            return MessageFormat.format("{0} item ({1}kg)",this.suitcases.size(),this.getAllSuitcasesWeight());
        }
        else {
            return MessageFormat.format("{0} items ({1}kg)",this.suitcases.size(),this.getAllSuitcasesWeight());
        }
    }

    public void printItems(){

        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
