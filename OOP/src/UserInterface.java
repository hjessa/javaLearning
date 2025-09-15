import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){

        String input = "";

        while(true){

            System.out.print("Command: ");
            input = this.scanner.nextLine();

            if(input.equals("stop")){
                break;
            }

            if(input.equals("add")){
                System.out.print("To add: ");
                input = this.scanner.nextLine();
                this.list.add(input);
                continue;
            }

            if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                this.list.remove(index);
                continue;
            }

            if(input.equals("list")){
                this.list.print();
            }

        }


    }
}
