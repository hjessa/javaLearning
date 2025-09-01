import java.text.MessageFormat;

public class Archive {

    private String id;
    private String name;

    public Archive(String id, String name){

        this.id = id;
        this.name = name;
    }

    public String toString(){
        return MessageFormat.format("{0}: {1}",this.id,this.name);
    }

    public boolean equals(Object object){

        if(this == object){
            return true;
        }

        if(!(object instanceof Archive)){
            return false;
        }

        Archive compared = (Archive) object;
        if(this.id.equals(compared.id))
        {
            return true;
        }
        else {return false;}
    }
}
