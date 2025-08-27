public class Song {

    private String title;
    private String singer;
    private int words;

    public Song(String title, String singer, int words){
        this.title = title;
        this.singer = singer;
        this.words = words;
    }

    public boolean equals(Object song){

        if(this == song){
            return true;
        }

        if(!(song instanceof Song)){
            return false;

        }

        Song object = (Song) song;

        if(object.words == this.words && object.singer.equals(this.singer) && object.title.equals(this.title)){
            return true;
        }

        return false;


    }
}
