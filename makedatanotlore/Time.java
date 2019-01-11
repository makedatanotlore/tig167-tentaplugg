package makedatanotlore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Duration;

public class Time {
    public static String daysUntilChristmas(){
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(2019, Month.DECEMBER, 24);

        return today.isAfter(christmas) ? "God fortsättning!" : "Det är " + Duration.between(today.atStartOfDay(), christmas.atStartOfDay()).toDays() + " dagar till jul.";
    }
}
