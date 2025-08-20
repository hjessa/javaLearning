//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fitbyte assistant = new Fitbyte(30, 60);

        double percantage = 0.3;
        while(percantage < 1.0){

            double target = assistant.targetHeartRate(percantage);
            System.out.println("Target is "+percantage*100+"% , of maximum "+target);

            percantage += 0.1;
        }
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
    }
}

//Programming exercise:
//One Minute