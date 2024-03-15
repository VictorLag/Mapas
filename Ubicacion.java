import java.util.HashMap;
import java.util.Map;

public class Ubicacion {

    private int id;
    private String descripcion;
    private Map<String,Integer> exits=new HashMap<String,Integer>();

    public Ubicacion (int id, String descripcion){

        this.id=id;
        this.descripcion=descripcion;

        exits=new HashMap<>();

    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void addExit (String direccion, int idubicacion){

        exits.put(direccion,idubicacion);

    }
}
