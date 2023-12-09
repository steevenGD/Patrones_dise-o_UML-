/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_patrones_diseno.strategy;

/**
 *
 * @author USUARIO
 */
class RutaEscogida {
    private Via via;
    
    public void setVia(Via via) {
        //code
    }
    
    public void transportar() {
        via.rutaTransporte("destino");
    }
    
    public static void main(String[] args) {
        RutaEscogida ruta = new RutaEscogida();
        Via via = new FerreoVia();
        ruta.setVia(via);
        ruta.transportar();
    }
}