public class DeserializerFactory {
    public static Deserializer getDeserializer(String type){
        switch (type){
            case "JSON":
                return new JsonDeserializer();
            case "XML:":
                return new XmlDeserializer();
            case"CSV":
                return new CsvDeserializer();
            default:
                return new JsonDeserializer();
        }


    }
}
