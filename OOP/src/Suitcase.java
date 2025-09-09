import java.text.MessageFormat;
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

     public void addItem(Item item){

        if(!(item.getWeight() + this.getAllItemsWeight() >= this.maxWeight)){
            this.items.add(item);
        }
     }

     public int getAllItemsWeight(){
        if(this.items.isEmpty()){
            return 0;
        }

        int sum = 0;
         for (Item item : items) {
             sum = sum + item.getWeight();
         }

         return sum;
     }

     public String toString(){

        String returnMessage = "";

        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }

        if(this.items.size() == 1){
            return MessageFormat.format("{0} item ({1}kg)",this.items.size(),this.getAllItemsWeight());
        }
        else {
            return MessageFormat.format("{0} items ({1}kg)",this.items.size(),this.getAllItemsWeight());
        }
     }

     public void printItems(){

        if(this.items.isEmpty()){
            System.out.println("no items");
        }
        else{
            for (Item item : items) {
                System.out.println(item);
            }
        }

     }

     public Item heaviestItem(){

        if(this.items.isEmpty()){
            return null;
        }

        Item returnedItem = this.items.get(0);

         for (Item item : items) {
             if(item.getWeight() > returnedItem.getWeight())
                 returnedItem = item;
         }

         return returnedItem;
     }


}
