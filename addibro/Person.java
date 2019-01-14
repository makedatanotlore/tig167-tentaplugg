package addibro;

import java.util.ArrayList;
import java.util.List;

/**
 * Person
 */
public class Person {

    private String name;
    private int age;
    private List<Thing> things;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return name + ", age " + age + " with: " + things;
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