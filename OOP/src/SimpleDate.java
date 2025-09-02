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

    public void advance(){
        if(this.day == 30){
            this.month +=1;
            this.day = 1;
        }
        else{
            this.day += 1;
        }
    }

    public void advance(int howManyDays){
        int counter = 0;
        if(howManyDays > 0){
            while(counter < howManyDays) {
                this.advance();
                counter++;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days){

        SimpleDate clone = new SimpleDate(this.day,this.month,this.year);
        clone.advance(days);
        return clone;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }



    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
