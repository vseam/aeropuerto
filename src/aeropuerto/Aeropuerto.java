package aeropuerto;

import java.util.Date;

public class Aeropuerto {
    private String         nombreCiudad;
    private TipoAeropuerto tipoAeropuerto;
    private int            numeroPistas;
    private Date           fechaConstruccion;
    private String[]       ciudadesDestino;
    private Coordenada     coordenadas;
    
    public Aeropuerto(String nombreCiudad, TipoAeropuerto tipoAeropuerto, int numeroPistas, Date fechaConstruccion, String[] ciudadesDestino, Coordenada coordenadas) throws Exception {
        if(!this.nombreCiudad.isEmpty()) {
            this.nombreCiudad = nombreCiudad;
        } else {
            throw new Exception();
        }
        
        if(this.tipoAeropuerto != null) {
            this.tipoAeropuerto = tipoAeropuerto;
        } else {
            throw new Exception();
        }
        
        if(this.numeroPistas > 0) {
            this.numeroPistas = numeroPistas;
        } else {
            throw new Exception();
        }
        
        if(this.fechaConstruccion != null && this.fechaConstruccion.before(new Date())) {
            this.fechaConstruccion = fechaConstruccion;
        } else {
            throw new Exception();
        }
        
        if(this.ciudadesDestino.length > 0) {
            this.ciudadesDestino = ciudadesDestino;
        } else {
            throw new Exception();
        }
        
        if(this.coordenadas != null) {
            this.coordenadas = coordenadas;
        } else {
            throw new Exception();
        }
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
