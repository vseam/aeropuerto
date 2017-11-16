package aeropuerto;

import java.util.HashMap;
import java.util.Map;

public class InformacionTopografica {
    private static Map getPosicionesAeropuertos() throws Exception {
        Map<String, Coordenada> aeropuertos = new HashMap<String, Coordenada>();
        
        aeropuertos.put("Cadiz", new Coordenada(-6.292409, 36.529942));
        aeropuertos.put("Valencia", new Coordenada(-0.376805, 39.470239));
        aeropuertos.put("Madrid", new Coordenada(-3.700345, 40.416691));
        aeropuertos.put("Londres", new Coordenada(-0.126236, 51.500152));
        aeropuertos.put("Roma", new Coordenada(12.482324, 41.895466));
        
        return aeropuertos;
    }
    
    public static Coordenada getPosicionAeropuerto(String nombreCiudad) throws Exception {
        Map<String, Coordenada> aeropuertos = getPosicionesAeropuertos();
        
        return aeropuertos.get(nombreCiudad);
    }
    
}
