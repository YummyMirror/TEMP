import java.util.Arrays;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
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
