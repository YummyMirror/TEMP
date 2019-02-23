import java.util.List;
import java.util.stream.Collectors;

public class Feature3 {
    private static final String PATH = "Some path";

    public static void main(String[] args) {
        System.out.println(PATH);
        System.out.println("Path is: " + PATH);
    }

    private static String concat(List<String> list) {
        return list.stream()
                .collect(Collectors.joining());
    }

    private static void sayFollowing (String value){
        if (value != null && !value.isEmpty()) {
            System.out.println("Saying: " + value);
        }
    }
}
