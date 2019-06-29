import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ChuckNorris.getJokes(10)
                .stream()
                .forEach(System.out::println);
    }
}