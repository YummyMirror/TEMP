import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test1 {
    private static String a = "a";
    private static String b = "b";

    public static void main(String[] args) {
        System.out.println(stringConcatenation(a, b, "yeah"));
        iterating(Arrays.asList("a", "b", "c"));
    }

    private static String stringConcatenation(String... strings) {
        Objects.requireNonNull(strings);
        String result = "";
        if (strings.length > 0) {
            StringBuilder builder = new StringBuilder();
            Arrays.stream(strings)
                    .forEach(builder::append);
            result = builder.toString();
        }
        return result;
    }

    private static void iterating(List<String> strings) {
        Objects.requireNonNull(strings);
        strings.forEach(System.out::println);
    }
}
