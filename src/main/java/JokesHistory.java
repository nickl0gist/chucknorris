import java.io.IOException;
import java.util.List;

public interface JokesHistory {
    List<String> getIds();
    void setId(String newId) throws IOException;
}
