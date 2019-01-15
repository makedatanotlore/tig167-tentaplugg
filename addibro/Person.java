package addibro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Person
 */
public class Person {

    private String name;
    private int age;
    private Optional<String> email;
    private List<Thing> things;

    public Person(String name, int age) {
        this(name, age, null);
    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = Optional.ofNullable(email);
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        things.add(thing);
    }

    /**
     * @return the things
     */
    public List<Thing> getThings() {
        return things;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email.orElse("no email");
    }

    @Override
    public String toString() {
        return name + ", age " + age + " with: " + things + ((email.isPresent()) ? " and email " + email.get(): "");
    }
}

/**
 * Thing
 */
class Thing {
    private String name;
    public Thing(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}