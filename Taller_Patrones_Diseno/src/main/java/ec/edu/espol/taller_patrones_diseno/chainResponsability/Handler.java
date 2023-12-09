/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_patrones_diseno.chainResponsability;

/**
 *
 * @author USUARIO
 */

//Clase abstracta
public abstract class Handler {
    private IHandler sucesor;
    
    public void setSucesor(IHandler sucesor) {
        this.sucesor = sucesor;
    }
    
    public void handleRequest() {
        if (sucesor != null) {
            sucesor.handleRequest();
        }
    }

    public IHandler getSucesor() {
        return sucesor;
    }
    
}
