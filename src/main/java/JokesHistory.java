import java.io.IOException;
import java.util.Set;

public interface JokesHistory {
    Set<String> getIds();
    void setId(String newId) throws IOException;
}
