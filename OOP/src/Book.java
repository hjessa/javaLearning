import java.text.MessageFormat;

public class Book {

    private String author;
    private String name;
    private int pages;
    private int pubYear;

    public Book(String name, int pubYear){
        this.name = name;
        this.pubYear = pubYear;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }

    public int getPubYear() {
        return pubYear;
    }

    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Book)){
            return false;
        }

        Book object = (Book) obj;

        if(this.name.equals(object.name) && this.pubYear == object.pubYear){
            return true;
        }
        else {
            return false;
        }

    }

    public String toString() {
       return MessageFormat.format("Author: {0}, Name: {1}, Pages {2}",this.author,this.name,this.pages);
    }
}
