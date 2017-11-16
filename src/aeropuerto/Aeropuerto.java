package aeropuerto;

public class Aeropuerto {
    private String   nombreCiudad;
    private String   tipoAeropuerto; // Usar el enum.
    private int      numeroPistas;
    private String   fechaConstruccion; // Tipo fecha?
    private String[] ciudadesDestino;
    private String   coordenadas; // Objeto coordenada?
    
    public Aeropuerto(String nombreCiudad, String tipoAeropuerto, int numeroPistas, String fechaConstruccion, String[] ciudadesDestino, String coordenadas) {
        this.nombreCiudad      = nombreCiudad;
        this.tipoAeropuerto    = tipoAeropuerto;
        this.numeroPistas      = numeroPistas;
        this.fechaConstruccion = fechaConstruccion;
        this.ciudadesDestino   = ciudadesDestino;
        this.coordenadas       = coordenadas;
    }
    
    private int precioPorDestino() throws Exception {
        int tasas = 0;
        
        if(this.tipoAeropuerto == null) {
            throw new Exception();
        } else switch (this.tipoAeropuerto) {
            case "National":
                tasas = 8;
                break;
            case "International":
                tasas = 17;
                break;
            default:
                throw new Exception();
        }
        
        return tasas;
    }
    
    public int getTasas() throws Exception {
        return this.ciudadesDestino.length * precioPorDestino();
    }
}
