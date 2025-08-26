public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        double dish = 2.50;
        if(payment >= dish){
            this.money += dish;
            this.affordableMeals++;
            return payment - dish;
        }
        else{
            return payment;
        }

        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public boolean eatAffordably(PaymentCard card) {
        double dish = 2.50;
        if(card.balance() >= dish){
            card.takeMoney(dish);
            affordableMeals++;
            return true;
        }
        else{
            return false;
        }
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public double eatHeartily(double payment) {
        double dish = 4.30;
        if(payment >= dish){
            this.money += dish;
            this.heartyMeals++;
            return payment - dish;
        }
        else{
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public boolean eatHeartily(PaymentCard card) {
        double dish = 4.30;
        if(card.balance() >= dish){
            card.takeMoney(dish);
            heartyMeals++;
            return true;
        }
        else{
            return false;
        }
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
            card.addMoney(sum);
            this.money+=sum;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}