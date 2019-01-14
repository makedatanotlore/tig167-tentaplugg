package addibro;

import java.util.*;
import java.util.stream.*;

/**
 * Streamz
 */
public class Streamz {

    public static double averageAge(List<Person> persons) {
        return persons.stream()
            .mapToInt(Person::getAge)
            .average()
            .orElse(0);
    }

    public static double averageAge2(List<Person> persons) {
        return persons.stream().collect(Collectors.averagingInt(Person::getAge));
    }

    public static void printPersonAge(List<Person> persons) {
        persons.forEach(p -> System.out.println(p.getAge() + ": " + p.getName()));
    }

    public static Map<Integer, List<Person>> groupByAge(List<Person> persons) {
        return persons.stream()
            .collect(Collectors.groupingBy(Person::getAge));
    }

    public static String legalAgePhrase(List<Person> persons) {
        return persons.stream()
            .filter(p -> p.getAge() >= 20)
            .map(Person::getName)
            .collect(Collectors.joining(" and ", "In Sweden ", " get to buy booze")); // joining(delimiter, prefix, suffix);
    }
}