import java.util.HashMap;
import java.util.Map;

abstract class Serializer {
    public abstract void serialize(SampleObject o);

    Map getMap(SampleObject o){
        Map mapa = new HashMap<String,Object>();
        mapa.put("liczba",o.getLiczba());
        mapa.put("napis",o.getNapis());
        mapa.put("lista",o.getLista());
        return mapa;
    }
}
