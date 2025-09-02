public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition){

        Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared){

        if(this.euros < compared.euros){
            return true;
        }

        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){

        int euros;
        int cents;
        Money decreased = new Money(0,0);

        if(this.euros - decreaser.euros < 0){
            return decreased;
        }
        if(this.euros - decreaser.euros == 0 && this.cents - decreaser.cents <= 0){
            return decreased;
        }
        if(this.cents == 0 && decreaser.cents > 0){
            cents = 100 - decreaser.cents;
            euros = this.euros - decreaser.euros -1;
        }
        else {
            cents = this.cents - decreaser.cents;
            euros = this.euros - decreaser.euros;
        }

        decreased = new Money(euros,cents);
        return decreased;

    }


    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}