public class SerializerFactory {
    public static Serializer getSerializer(String type){
        switch (type){
            case "JSON":
                return new JsonSerializer();
            case "XML:":
                return new XmlSerializer();
            case"CSV":
                return new CsvSerializer();
                default:
                    return new JsonSerializer();
        }


    }
}
