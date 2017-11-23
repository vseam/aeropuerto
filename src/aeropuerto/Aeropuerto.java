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
        if(!nombreCiudad.isEmpty()) {
            this.nombreCiudad = nombreCiudad;
        } else {
            throw new Exception("El nombre de la ciudad no ha sido introducido.");
        }
        
        if(tipoAeropuerto != null) {
            this.tipoAeropuerto = tipoAeropuerto;
        } else {
            throw new Exception("El tipo de aeropuerto no ha sido introducido.");
        }
        
        if(numeroPistas > 0) {
            this.numeroPistas = numeroPistas;
        } else {
            throw new Exception("El número de pistas no puede ser inferior de 0. (" + numeroPistas + ")");
        }
        
        if(fechaConstruccion != null && fechaConstruccion.before(new Date())) {
            this.fechaConstruccion = fechaConstruccion;
        } else {
            throw new Exception("La fecha introducida no es válida.");
        }
        
        if(ciudadesDestino.length > 0) {
            this.ciudadesDestino = ciudadesDestino;
        } else {
            throw new Exception("Debe haber como mínimo una ciudad de destino. (" + ciudadesDestino.length + ")");
        }
        
        if(coordenadas != null) {
            this.coordenadas = coordenadas;
        } else {
            throw new Exception("Las coordenadas no han sido introducidas.");
        }
    }
    
    // Getters
    public TipoAeropuerto getTipoAeropuerto() {
        return this.tipoAeropuerto;
    }
    
    public int getNumeroPistas() {
        return this.numeroPistas;
    }
    
    public Date getFechaConstruccion() {
        return this.fechaConstruccion;
    }
    
    public String[] getCiudadesDestino() {
        return this.ciudadesDestino;
    }
    
    public Coordenada getCoordenadas() {
        return this.coordenadas;
    }
    
    // Métodos
    private int precioPorDestino() throws Exception {
        int tasas = 0;
        
        if(null == this.tipoAeropuerto) {
            throw new Exception("El tipo de aeropuerto no ha sido introducido.");
        } else switch (this.tipoAeropuerto) {
            case NATIONAL:
                tasas = 8;
                break;
            case INTERNATIONAL:
                tasas = 17;
                break;
            default:
                throw new Exception("El tipo de aeropuerto introducido no es válido. (" + this.tipoAeropuerto + ")");
        }
        
        return tasas;
    }
    
    public int getTasas() throws Exception {
        return this.ciudadesDestino.length * precioPorDestino();
    }
}
