//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
//        Programming exercise:
//Comparing apartments (3 parts)





//
//        PaymentCard annesCard = new PaymentCard(2);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        unicafeExactum.addMoneyToCard(annesCard, 100);
//
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        System.out.println(unicafeExactum);
//                PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//                double change = unicafeExactum.eatAffordably(10);
//                System.out.println("remaining change " + change);
//
//                change = unicafeExactum.eatAffordably(5);
//                System.out.println("remaining change " + change);
//
//                change = unicafeExactum.eatHeartily(4.3);
//                System.out.println("remaining change " + change);
//
//                System.out.println(unicafeExactum);


//        PaymentCard petesCard = new PaymentCard(10);
//
//        System.out.println("money " + petesCard.balance());
//        boolean wasSuccessful = petesCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
//
//        wasSuccessful = petesCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
    }
}


//        HealthStation childrensHospital = new HealthStation();
//
//        Person ethan = new Person("Ethan", 1, 110, 7);
//        Person peter = new Person("Peter", 33, 176, 85);
//
//        System.out.println("weighings performed: " + childrensHospital.weighings());
//
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(peter);
//
//        System.out.println("weighings performed: " + childrensHospital.weighings());
//
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(ethan);
//
//        System.out.println("weighings performed: " + childrensHospital.weighings());


//        Counter test = new Counter(5);
//        test = null;
//        test.increase();
//        Counter test = new Counter(5);
//        Counter test2 = new Counter();
//
//        test.decrease();
//        test.decrease(2);
//        test2.increase();
//        test2.increase(2);
//
//        System.out.println(test.value());
//        System.out.println(test2.value());




//        Product tapeMeasure = new Product("Tape measure");
//        Product plaster = new Product("Plaster", "home improvement section");
//        Product tyre = new Product("Tyre", 5);
//
//        System.out.println(tapeMeasure);
//        System.out.println(plaster);
//        System.out.println(tyre);

//        System.out.println(tapeMeasure);
//        System.out.println(plaster);
//        System.out.println(tyre);


//        Fitbyte assistant = new Fitbyte(30, 60);
//
//        double percantage = 0.3;
//        while(percantage < 1.0){
//
//            double target = assistant.targetHeartRate(percantage);
//            System.out.println("Target is "+percantage*100+"% , of maximum "+target);
//
//            percantage += 0.1;

//https://java-programming.mooc.fi/part-5/2-method-and-constructor-overloading

//        Cube oSheaJackson = new Cube(4);
//        System.out.println(oSheaJackson.volume());
//        System.out.println(oSheaJackson);
//
//        System.out.println();
//
//        Cube salt = new Cube(2);
//        System.out.println(salt.volume());
//        System.out.println(salt);


//        Book haripota = new Book("J.K Rowling","Harry Potter",1000);
//        System.out.println(haripota);


//        Timer timer = new Timer();
//
//        while (true) {
//            System.out.println(timer);
//            timer.advance();
//
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//
//            }
//        }



//https://java-programming.mooc.fi/part-5/3-primitive-and-reference-variables