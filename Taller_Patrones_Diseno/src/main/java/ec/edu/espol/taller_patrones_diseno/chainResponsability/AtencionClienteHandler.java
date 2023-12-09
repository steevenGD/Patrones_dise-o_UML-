/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_patrones_diseno.chainResponsability;

/**
 *
 * @author USUARIO
 */
//Clases concretas que implementan IHandler
public class AtencionClienteHandler extends Handler implements IHandler {
    @Override
    public void handleRequest() {
        //Lógica de handleRequest 
        if(this.getSucesor() != null) {
            this.getSucesor().handleRequest(); 
        }
    }
}