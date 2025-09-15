import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }

    public void remove(int taskNum){
        this.list.remove(taskNum-1);
    }

    public void print(){
        for (String s : list) {
            System.out.println((list.indexOf(s)+1)+": "+s);
        }
    }
}
