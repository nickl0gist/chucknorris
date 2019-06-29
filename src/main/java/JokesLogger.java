import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JokesLogger implements JokesHistory {

    private String pathString;

    public JokesLogger(String pathString) {
        this.pathString = pathString;
    }

    @Override
    public List<String> getIds(){
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(pathString))) {
            stream.forEach(a -> list.add(a));
        } catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void setId(String newId) throws IOException {
        FileWriter fw = new FileWriter(pathString, true);
        try (Writer output = new BufferedWriter(fw)) {
            output.append(newId + "\n");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            fw.close();
        }
    }
}
