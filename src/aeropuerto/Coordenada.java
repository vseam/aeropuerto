package aeropuerto;

public class Coordenada {
    private double longitud;
    private double latitud;
    
    public Coordenada(double longitud, double latitud) throws Exception {
        if(longitud >= -180 && longitud <= 180) {
            this.longitud = longitud;
        } else {
            throw new Exception("La longitud debe estar entre -180 y 180. (" + longitud + ")");
        }
        
        if(latitud >= -90 && latitud <= 90) {
            this.latitud = latitud;
        } else {
            throw new Exception("La latitud debe estar entre -90 y 90. (" + latitud + ")");
        }
    }
    
    // Setters
    public double getLongitud() {
        return this.longitud;
    }
    
    public double getLatitud() {
        return this.latitud;
    }
    
    // Método
    public String toString() {
        return this.longitud + ", " + this.latitud;
    }
}
