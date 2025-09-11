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
        String inputWord = "";
        String translation = "";

        while(true){
            System.out.print("Command:");
            word = this.scanner.nextLine();
            if(word.equals("end")){
                System.out.println("Bye Bye");
                break;
            }

            if(word.equals("add")){
                System.out.print("Word: ");
                inputWord = scanner.nextLine();
                System.out.print("Translation: ");
                translation = scanner.nextLine();
                this.dictionary.add(inputWord,translation);
            } else if (word.equals("search")) {
                System.out.print("To be translated: ");
                inputWord = scanner.nextLine();
                translation = this.dictionary.translate(inputWord);
                System.out.println(translation);
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public boolean endWord(String word){
        return word.equals("end");
    }
}
