import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class StreamsAndLambdas{
    public static double averageLength(List<String> strings){
        System.out.println("StreamsAndLambdas.averageLength(): START");
        if (strings == null || strings.isEmpty()){
            System.out.println("- List supplied was null or empty\n- Returning 0.0");
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
