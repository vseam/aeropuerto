package aeropuerto;

import java.util.HashMap;
import java.util.Map;

public class Aena {
    private static Map getAeropuertos() throws Exception {
        Map<String, Aeropuerto> aeropuertos = new HashMap<String, Aeropuerto>();
        
        aeropuertos.put("Valencia", new Aeropuerto("Valencia", TipoAeropuerto.INTERNATIONAL, 1, "05/08/1933", new String[]{"Madrid", "Londres", "Cádiz"}, InformacionTopografica.getPosicionAeropuerto("Valencia")));
        aeropuertos.put("Madrid", new Aeropuerto("Madrid", TipoAeropuerto.INTERNATIONAL, 4, "22/04/1931", new String[]{"Londres", "Roma", "Valencia", "Cádiz"}, InformacionTopografica.getPosicionAeropuerto("Madrid")));
        aeropuertos.put("Cádiz", new Aeropuerto("Cádiz", TipoAeropuerto.NATIONAL, 1, "20/11/1975", new String[]{"Madrid", "Valencia"}, InformacionTopografica.getPosicionAeropuerto("Cádiz")));
        
        return aeropuertos;
    }
    
    public static Aeropuerto getAeropuerto(String nombreCiudad) throws Exception {
        Map<String, Aeropuerto> aeropuertos = getAeropuertos();
        
        return aeropuertos.get(nombreCiudad);
    }
}
