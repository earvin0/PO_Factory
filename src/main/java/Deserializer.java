import java.util.List;
import java.util.Map;

abstract class Deserializer {
    public SampleObject deserialize(){
        Map<String,Object> mapa = getMap();
        return new SampleObject( ((Double)mapa.get("liczba")).intValue(),(String)mapa.get("napis"),(List)mapa.get("lista"));
    }

    abstract Map getMap();
}
