import java.text.MessageFormat;

public class Person {

    private String name;
    private SimpleDate birthday;
    private Pet pet;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name,  0, 0);
    }
    public Person(String name, Pet pet){
        this.name = name;
        this.pet = pet;
    }

    public Person(String name, SimpleDate date){
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year){
        this.name = name;
        this.birthday = new SimpleDate(day,month,year);
    }

    public Person(String name, int height, int weight) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} has a friend called {1} ({2})",this.name,this.pet.getName(),this.pet.getBreed());
    }
}