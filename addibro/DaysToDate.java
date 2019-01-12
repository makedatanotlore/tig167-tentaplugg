package addibro;

import java.time.LocalDate;
import java.time.Month;
import java.time.Duration;

/**
 * DaysToBirthday
 */
public class DaysToDate {

    public static void calculate(Month month, int day) {
        try {
            String m = (month.getValue() < 10) ? "0" + month.getValue() : "" + month.getValue();
            LocalDate birthday = LocalDate.parse(LocalDate.now().getYear() + "-" + m + "-" + day);
            LocalDate today = LocalDate.now();
            if (today.isAfter(birthday)) {
                System.out.println("That date has already passed! ");
            } else {
                System.out.println("It's " + Duration.between(today.atStartOfDay(), birthday.atStartOfDay()).toDays() + " days left to that date.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}