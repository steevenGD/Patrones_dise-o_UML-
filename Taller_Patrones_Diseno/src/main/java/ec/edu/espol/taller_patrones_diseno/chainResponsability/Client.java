/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_patrones_diseno.chainResponsability;

/**
 *
 * @author USUARIO
 */

//Cliente para ensamblar la cadena
public class Client {
    public static void main(String[] args) {
        AtencionClienteHandler atencionCliente = new AtencionClienteHandler();
        TecnicoHandler tecnico = new TecnicoHandler();
        
        atencionCliente.setSucesor(tecnico);
        atencionCliente.handleRequest();
    }
}
