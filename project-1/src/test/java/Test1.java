import java.util.Arrays;
import java.util.Objects;

public class Test1 {
    private static String a = "a";
    private static String b = "b";

    public static void main(String[] args) {
        System.out.println(stringConcatenation(a, b, "yeah"));
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
}
