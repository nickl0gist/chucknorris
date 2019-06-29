import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class ChuckNorris {

    public static Set<String> getJokes(int number) throws IOException {

        Set<String> jokes = new HashSet<>();
        while (jokes.size()<number){
         jokes.add(getNextJoke());
        }
        return jokes;
    }

    private static String getNextJoke()  throws IOException {
        URL url = new URL("https://api.chucknorris.io/jokes/random");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        InputStreamReader isr = new InputStreamReader(con.getInputStream());
        Gson gson = new Gson();
        StringResponse sr = gson.fromJson(isr, StringResponse.class);
        return sr.getValue();
    }
}
