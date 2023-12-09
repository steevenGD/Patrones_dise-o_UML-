/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_patrones_diseno.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */

public class Bodega implements Inventario {
    private List<Producto> items;

    public Bodega(){
        items= new ArrayList<>();

    }

    public void agregarProducto(Producto producto){
        items.add(producto);
    }

    @Override
    public Iterator crearIterador(){
        return new InventarioIterator(items);


    }


}