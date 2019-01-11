package addibro;

import java.time.Duration;
import java.time.LocalDate;

/**
 * Timez
 */
public class Timez {

    public static void dagarTillJulafton() {
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.parse("2019-12-24");
        System.out.println(today.isAfter(christmas) ? "God fortsättning!" : "Det är " + Duration.between(today.atStartOfDay(), christmas.atStartOfDay()).toDays() + " till julafton");
    }
}