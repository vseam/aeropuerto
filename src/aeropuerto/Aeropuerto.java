/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author vlazaro
 */
public class Aeropuerto {
    private String   nombreCiudad;
    private String   tipoAeropuerto;
    private int      numeroPistas;
    private String   fechaConstruccion;
    private String[] ciudadesDestino;
    private String   coordenadas;
    
    public Aeropuerto(String nombreCiudad, String tipoAeropuerto, int numeroPistas, String fechaConstruccion, String[] ciudadesDestino, String coordenadas) {
        this.nombreCiudad      = nombreCiudad;
        this.tipoAeropuerto    = tipoAeropuerto;
        this.numeroPistas      = numeroPistas;
        this.fechaConstruccion = fechaConstruccion;
        this.ciudadesDestino   = ciudadesDestino;
        this.coordenadas       = coordenadas;
    }
    
    private int precioPorDestino() {
        int tasas = 0;
        
        if(this.tipoAeropuerto == "National") {
            tasas = 8;
        } else if(this.tipoAeropuerto == "International") {
            tasas = 17;
        }
        
        return tasas;
    }
    
    public int getTasas() {
        return this.ciudadesDestino.length * precioPorDestino();
    }
}
