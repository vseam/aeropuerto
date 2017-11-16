package aeropuerto;

import java.util.HashMap;
import java.util.Map;

public class Aena {
    private static Map getAeropuertos() {
        Map<String, Aeropuerto> aeropuertos = new HashMap<String, Aeropuerto>();
        
        aeropuertos.put("Valencia", new Aeropuerto());
        aeropuertos.put("Madrid", new Aeropuerto());
        aeropuertos.put("Cádiz", new Aeropuerto());
        
        return aeropuertos;
    }
    
    public static Aeropuerto getAeropuerto(String nombreCiudad) {
        Map<String, Aeropuerto> aeropuertos = getAeropuertos();
        
        return aeropuertos.get(nombreCiudad);
    }
}
