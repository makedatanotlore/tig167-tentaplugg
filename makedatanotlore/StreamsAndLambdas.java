package makedatanotlore;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;


public class StreamsAndLambdas{
    public static Comparator<String> stringLengthComparator(){
        return (s1, s2) -> s1.length() - s2.length();
    }
    public static double averageLength(List<String> strings){
        System.out.println("StreamsAndLambdas.averageLength(): START");
        if (strings == null || strings.isEmpty()){
            System.out.println("- List supplied was null or empty");
            System.out.println("- Returning 0.0");

            return 0;
        }
        System.out.println("- List supplied was OK");
        double result = strings.stream()
            .mapToInt(x -> x == null ? 0 : x.length())
            .average()
            .orElse(0);
        System.out.println("- Returning " + result);
        return result;
    }
}
