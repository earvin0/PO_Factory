import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class JsonDeserializer extends Deserializer {

    @Override
    Map getMap() {
        Gson gson = new GsonBuilder().create();
        JsonReader reader = null;
        try (FileReader reader2 = new FileReader("src/main/resources/samplejson.json")) {
            reader = new JsonReader(reader2);
            return gson.fromJson(reader,Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
