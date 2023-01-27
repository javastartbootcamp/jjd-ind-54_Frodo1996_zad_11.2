package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", "sdsaa", 2, "1234567890");
            person.setFirstName(null);
            System.out.println(person);
        } catch (IncorrectAgeExceptions | NameUndefinedException e) {
            System.err.println(e.getMessage());
        }

        try {
            Person person = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person);
            person.setAge(-10);
            System.out.println(person);
        } catch (IncorrectAgeExceptions | NameUndefinedException e) {
            System.err.println(e.getMessage());
        }

        try {
            Person person = new Person("Jan", "Kowalski", 25, "12321421421");
            person.setFirstName("J");
            System.out.println(person);
        } catch (IncorrectAgeExceptions | NameUndefinedException e) {
            System.err.println(e.getMessage());
        }
    }
}