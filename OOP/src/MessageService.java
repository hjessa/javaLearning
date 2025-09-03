import java.util.ArrayList;

public class MessageService {

    private ArrayList<Message> messages;

    public MessageService(){
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message){
        if(message.getContent().length()<280){
            this.messages.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return messages;
    }
}
