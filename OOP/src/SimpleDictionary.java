import java.util.HashMap;
import java.util.Map;

public class SimpleDictionary {

    private Map<String, String> translations;

    public SimpleDictionary(){
        this.translations = new HashMap<>();
    }

    public void add(String nativeName,String foreignName){
        translations.put(nativeName, foreignName);
    }

    public String translate(String word){
        if(translations.get(word) == null){
            return "Word "+word+" was not found";
        }
        return "Translation: "+translations.get(word);
    }

}
