
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializer extends Serializer {
    @Override
    public void serialize(SampleObject o) {
        Gson gson = new GsonBuilder().create();

        try (FileWriter writer=  new FileWriter("src/main/resources/samplejson.json")){

            String json = gson.toJson(getMap(o));
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
