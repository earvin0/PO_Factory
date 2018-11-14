import java.util.List;

public class SampleObject {
    private int liczba;
    private String napis;
    private List<String> lista;

    public SampleObject(int liczba, String napis, List<String> lista) {
        this.liczba = liczba;
        this.napis = napis;
        this.lista = lista;
    }

    public Integer getLiczba() {
        return liczba;
    }

    public String getNapis() {
        return napis;
    }

    public List<String> getLista() {
        return lista;
    }

    public String przedstawSie(){
        return "Jestem sample object liczba: "+this.liczba+" napis: "+this.napis+" lista: "+lista;
    }
}
