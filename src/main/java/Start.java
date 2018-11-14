import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("foo");
        lista.add("bar");
        Serializer jsonSerializer = SerializerFactory.getSerializer("JSON");
        SampleObject o = new SampleObject(1,"asd", lista );

        jsonSerializer.serialize(o);

        Deserializer jsonDeserializer = DeserializerFactory.getDeserializer("JSON");
        SampleObject o2 = jsonDeserializer.deserialize();
        System.out.println(o2.przedstawSie());
    }
}
