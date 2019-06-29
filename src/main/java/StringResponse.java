import java.net.URL;
import java.util.Arrays;

public class StringResponse {
    private String[] categories;
    private String created_at;
    private URL icon_url;
    private String id;
    private String updated_at;
    private URL url;
    private String value;

    public String getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "StringResponse{" +
                "categories=" + Arrays.toString(categories) +
                ", created_at='" + created_at + '\'' +
                ", icon_url=" + icon_url +
                ", Id='" + id + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", url=" + url +
                ", value='" + value + '\'' +
                '}';
    }
}
