package pl.javastart.task;

public class Person {
    private static final int MINIMUM_VALUE_OF_WORDS_IN_NAMES = 2;
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String socialSecurityNumber) {
        if (firstName == null) {
            throw new NameUndefinedException("Podane imię jest nieprawidłowe " + getFirstName());
        }
        if (lastName == null) {
            throw new NameUndefinedException("Podane nazwisko jest nieprawidłowe " + getLastName());
        }
        if (age <= 1) {
            throw new IncorrectAgeExceptions("Najmniejszy dopuszczalny wiek to 2 lata " + getAge());
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NameUndefinedException("Podane imię jest nieprawidłowe ");
        }
        if (firstName.length() < MINIMUM_VALUE_OF_WORDS_IN_NAMES) {
            throw new NameUndefinedException("Podane imię jest za krótkie.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NameUndefinedException("Podane nazwisko jest nieprawidłowe");
        }
        if (lastName.length() < MINIMUM_VALUE_OF_WORDS_IN_NAMES) {
            throw new NameUndefinedException("Podane nazwisko jest za krótkie.");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 1) {
            throw new IncorrectAgeExceptions("Nie możesz ustawić wieku poniżej jednego roku życia");
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}