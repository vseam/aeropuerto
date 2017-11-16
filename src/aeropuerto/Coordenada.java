package aeropuerto;

public class Coordenada {
    private double longitud;
    private double latitud;
    
    public Coordenada(double longitud, double latitud) throws Exception {
        if(longitud >= -180 && longitud <= 180) {
            this.longitud = longitud;
        } else {
            throw new Exception();
        }
        
        if(latitud >= -90 && latitud <= 90) {
            this.latitud = latitud;
        } else {
            throw new Exception();
        }
    }
}
