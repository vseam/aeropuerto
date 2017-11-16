package aeropuerto;

public class Aeropuerto {
    private String         nombreCiudad;
    private TipoAeropuerto tipoAeropuerto;
    private int            numeroPistas;
    private String         fechaConstruccion; // Tipo fecha?
    private String[]       ciudadesDestino;
    private Coordenada     coordenadas;
    
    public Aeropuerto(String nombreCiudad, TipoAeropuerto tipoAeropuerto, int numeroPistas, String fechaConstruccion, String[] ciudadesDestino, Coordenada coordenadas) {
        this.nombreCiudad      = nombreCiudad;
        this.tipoAeropuerto    = tipoAeropuerto;
        this.numeroPistas      = numeroPistas;
        this.fechaConstruccion = fechaConstruccion;
        this.ciudadesDestino   = ciudadesDestino;
        this.coordenadas       = coordenadas;
    }
    
    private int precioPorDestino() throws Exception {
        int tasas = 0;
        
        if(null == this.tipoAeropuerto) {
            throw new Exception();
        } else switch (this.tipoAeropuerto) {
            case NATIONAL:
                tasas = 8;
                break;
            case INTERNATIONAL:
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
