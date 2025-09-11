import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
//        Scanner scanner = new Scanner(System.in);
//        SimpleDictionary dictionary = new SimpleDictionary();
//
//        TextUI ui = new TextUI(scanner, dictionary);
//        ui.start();
//        SimpleDictionary book = new SimpleDictionary();
//        book.add("one", "yksi");
//        book.add("two", "kaksi");
//
//        System.out.println(book.translate("one"));
//        System.out.println(book.translate("two"));
//        System.out.println(book.translate("three"));

//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("brick", 4);
//
//        Suitcase adasCase = new Suitcase(10);
//        adasCase.addItem(book);
//        adasCase.addItem(phone);
//
//        Suitcase pekkasCase = new Suitcase(10);
//        pekkasCase.addItem(brick);
//
//        Hold hold = new Hold(1000);
//        hold.addSuitcase(adasCase);
//        hold.addSuitcase(pekkasCase);
//
//        System.out.println("The suitcases in the hold contain the following items:");
//        hold.printItems();
//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("brick", 4);
//
//        Suitcase adasCase = new Suitcase(10);
//        adasCase.addItem(book);
//        adasCase.addItem(phone);
//
//        Suitcase pekkasCase = new Suitcase(10);
//        pekkasCase.addItem(brick);
//
//        Hold hold = new Hold(1000);
//        hold.addSuitcase(adasCase);
//        hold.addSuitcase(pekkasCase);
//
//        System.out.println(hold);
//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("Brick", 4);
//
//        Suitcase suitcase = new Suitcase(10);
//        suitcase.addItem(book);
//        suitcase.addItem(phone);
//        suitcase.addItem(brick);
//
//        Item heaviest = suitcase.heaviestItem();
//        System.out.println("Heaviest item: " + heaviest);
//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("brick", 4);
//
//        Suitcase suitcase = new Suitcase(10);
//        suitcase.addItem(book);
//        suitcase.addItem(phone);
//        suitcase.addItem(brick);
//
//        System.out.println("The suitcase contains the following items:");
//        suitcase.printItems();
//        System.out.println("Total weight: " + suitcase.getAllItemsWeight() + " kg");
//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("brick", 4);
//
//        Suitcase suitcase = new Suitcase(5);
//        System.out.println(suitcase);
//
//        suitcase.addItem(book);
//        System.out.println(suitcase);
//
//        suitcase.addItem(phone);
//        System.out.println(suitcase);
//
//        suitcase.addItem(brick);
//        System.out.println(suitcase);
//        Item book = new Item("The lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//
//        System.out.println("The book's name: " + book.getName());
//        System.out.println("The book's weight: " + book.getWeight());
//
//        System.out.println("Book: " + book);
//        System.out.println("Phone: " + phone);
//        Room room = new Room();
//        room.add(new Person("Lea", 183));
//        room.add(new Person("Kenya", 182));
//        room.add(new Person("Auli", 186));
//        room.add(new Person("Nina", 172));
//        room.add(new Person("Terhi", 185));
//
//        while (!room.isEmpty()) {
//            System.out.println(room.take());
//        }
//        Room room = new Room();
//        room.add(new Person("Lea", 183));
//        room.add(new Person("Kenya", 182));
//        room.add(new Person("Auli", 186));
//        room.add(new Person("Nina", 172));
//        room.add(new Person("Terhi", 185));
//
//        System.out.println("");
//        for (Person person : room.getPersons()) {
//            System.out.println(person);
//        }
//
//        System.out.println();
//        System.out.println("Shortest: " + room.take());
//        System.out.println("");
//        for (Person person : room.getPersons()) {
//            System.out.println(person);
//        }
//        Room room = new Room();
//        System.out.println("Empty room? " + room.isEmpty());
//        room.add(new Person("Lea", 183));
//        room.add(new Person("Kenya", 182));
//        room.add(new Person("Auli", 186));
//        room.add(new Person("Nina", 172));
//        room.add(new Person("Terhi", 185));
//        System.out.println("Empty room? " + room.isEmpty());
//
//        System.out.println("");
//        for (Person person : room.getPersons()) {
//            System.out.println(person);
//        }
//        SimpleCollection j = new SimpleCollection("characters");
//        System.out.println("Longest: " + j.longest());
//
//        j.add("magneto");
//        j.add("mystique");
//        j.add("phoenix");
//
//        System.out.println("Longest: " + j.longest());

//        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 1);
//        Gift book2 = new Gift("nie wiem cos tam", 20);
//        Package gifts = new Package();
//        gifts.addGift(book);
//        gifts.addGift(book2);
//        System.out.println(gifts.totalWeight());
//        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
//
//        System.out.println("Gift's name: " + book.getName());
//        System.out.println("Gift's weight: " + book.getWeight());
//
//        System.out.println("Gift: " + book);
//        SimpleCollection s = new SimpleCollection("characters");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("magneto");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("mystique");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("phoenix");
//        System.out.println(s);
//        SimpleCollection s = new SimpleCollection("alphabet");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("a");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("b");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("c");
//        System.out.println(s);
//        MessageService service = new MessageService();
//
//        // Tworzymy kilka wiadomości
//        Message m1 = new Message("Janek", "Cześć, co tam?");
//        Message m2 = new Message("Kasia", "Długa wiadomość...".repeat(30)); // będzie za długa
//        Message m3 = new Message("Ola", "Dzisiaj piękna pogoda!");
//
//        // Dodajemy do serwisu
//        service.addMessage(m1);
//        service.addMessage(m2); // ta się nie doda, bo > 280 znaków
//        service.addMessage(m3);
//
//        // Pobieramy i wyświetlamy wszystkie wiadomości
//        for (Message msg : service.getMessages()) {
//            System.out.println(msg.getSender() + ": " + msg.getContent());
//        }

//        Stack s = new Stack();
//        s.add("1");
//        s.add("2");
//        s.add("3");
//        s.add("4");
//        s.add("5");
//
//        while (!s.isEmpty()) {
//            System.out.println(s.take());
//        }

//        Menu menu = new Menu();
//        menu.addMeal("Tofu ratatouille");
//        menu.addMeal("Chilli coconut chicken");
//        menu.addMeal("Chilli coconut chicken");
//        menu.addMeal("Meatballs with mustard sauce");
//
//        menu.printMeals();
//        menu.clearMenu();
//
//        System.out.println();
//        menu.addMeal("Tomato and mozzarella salad");
//        menu.printMeals();

//        Money a = new Money(10, 0);
//        Money b = new Money(3, 50);
//
//        Money c = a.minus(b);
//
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 3.50e
//        System.out.println(c);  // 6.50e
//
//        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
////  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it
//
//
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 3.50e
//        System.out.println(c);  // 0.00e
//        Money a = new Money(10, 0);
//        Money b = new Money(3, 0);
//        Money c = new Money(5, 0);
//
//        System.out.println(a.lessThan(b));  // false
//        System.out.println(b.lessThan(c));  // true
//        Money a = new Money(10,0);
//        Money b = new Money(5,0);
//
//        Money c = a.plus(b);
//
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 5.00e
//        System.out.println(c);  // 15.00e
//
//        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
////  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it
//
//        System.out.println(a);  // 25.00e
//        System.out.println(b);  // 5.00e
//        System.out.println(c);  // 15.00e

//        SimpleDate date = new SimpleDate(13, 2, 2015);
//        System.out.println("Friday of the examined week is " + date);
//
//        SimpleDate newDate = date.afterNumberOfDays(7);
//        int week = 1;
//        while (week <= 7) {
//            System.out.println("Friday after " + week + " weeks is " + newDate);
//            newDate = newDate.afterNumberOfDays(7);
//
//            week = week + 1;
//        }
//
//
//        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        //    System.out.println("Try " + date.afterNumberOfDays(790));

//        ArchiveOps archiwum = new ArchiveOps();
//
//
//        archiwum.addToArchiveList();
//
//        System.out.println("==Items==");
//        for (Archive archive : archiwum) {
//            System.out.println(archive);
//        }


//https://java-programming.mooc.fi/part-5/4-objects-and-references
//Object as a method's return value
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Book> books = new ArrayList<>();
//
//    while(true){
//
//        String bookName ="";
//        int pubYear = 0;
//        System.out.println("Book name:");
//        bookName = scanner.nextLine();
//        if(bookName.isEmpty()){
//            break;
//        }
//        System.out.println("Publication year: ");
//        pubYear = Integer.valueOf(scanner.nextLine());
//
//        Book tryBook = new Book(bookName,pubYear);
//        if(books.contains(tryBook)){
//            System.out.println("The book is already on the list. Let's not add the same book again.");
//        }
//        else{
//            books.add(new Book(bookName,pubYear));
//        }
//
//    }


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