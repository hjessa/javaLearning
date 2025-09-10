import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){

        String word = "";

        while(true){
            System.out.print("Command:");
            word = this.scanner.nextLine();
            if(word.equals("end")){
                System.out.println("Bye Bye");
                break;
            }
            System.out.println("Unknown command");
        }
    }

    public boolean endWord(String word){
        return word.equals("end");
    }
}
