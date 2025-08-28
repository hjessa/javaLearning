public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day =day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(!(obj instanceof SimpleDate)){
            return false;
        }

        SimpleDate object = (SimpleDate) obj;

        if(this.day == object.day && this.month == object.month && this.year == object.year){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
