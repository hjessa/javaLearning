import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

    while(true){

        String bookName ="";
        int pubYear = 0;
        System.out.println("Book name:");
        bookName = scanner.nextLine();
        if(bookName.isEmpty()){
            break;
        }
        System.out.println("Publication year: ");
        pubYear = Integer.valueOf(scanner.nextLine());

        Book tryBook = new Book(bookName,pubYear);
        if(books.contains(tryBook)){
            System.out.println("The book is already on the list. Let's not add the same book again.");
        }
        else{
            books.add(new Book(bookName,pubYear));
        }

    }


//        Programming exercise:
//          Archive (2 parts)
        // https://java-programming.mooc.fi/part-5/4-objects-and-references
//        SimpleDate date = new SimpleDate(24, 3, 2017);
//        SimpleDate date2 = new SimpleDate(23, 7, 2017);
//
//        Person leo = new Person("Leo", date, 62, 9);
//        Person lily = new Person("Lily", date2, 65, 8);
//        Person lily2 = new Person("Lily", date2, 65, 8);
//
//        if (lily2.equals(lily)) {
//            System.out.println("Is this quite correct?");
//        }
//
//        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
//
//        if (leo.equals(leoWithDifferentWeight)) {
//            System.out.println("Is this quite correct?");
//        }

//        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
//        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
//
//        if (jackSparrow.equals(anotherSparrow)) {
//            System.out.println("Songs are equal.");
//        }
//
//        if (jackSparrow.equals("Another object")) {
//            System.out.println("Strange things are afoot.");
//        }
//https://java-programming.mooc.fi/part-5/4-objects-and-references
        //Identical twins
//        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
//        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
//        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
//
//        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
//        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
//        Pet lucy = new Pet("Lucy", "golden retriever");
//        Person leo = new Person("Leo", lucy);
//
//        System.out.println(leo);
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