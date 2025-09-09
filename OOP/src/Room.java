import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room(){
        persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){

        if(this.persons.isEmpty()){
            return null;
        }

        Person personReturned = this.persons.get(0);

        for (Person person : persons) {

            if(personReturned.getHeight()>person.getHeight()){
                personReturned = person;
            }
        }

        return personReturned;
    }

    public Person take(){

        if(this.persons.isEmpty()){
            return null;
        }

        Person personReturned = this.shortest();
        this.persons.remove(personReturned);

        return personReturned;
    }


}
