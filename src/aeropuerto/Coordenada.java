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
public class Coordenada {
    private float longitud;
    private float latitud;
    
    public Coordenada(float longitud, float latitud) throws Exception {
        if(longitud >= -180 && longitud <= 180 && latitud >= -90 && latitud <= 90) {
            this.longitud = longitud;
            this.latitud  = latitud;
        } else {
            throw new Exception();
        }
    }
}
