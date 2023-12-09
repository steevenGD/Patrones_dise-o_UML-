/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_patrones_diseno.Iterator;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public class InventarioIterator implements Iterator{
    private List<Producto> items;
    private int posicion;

    public InventarioIterator(List<Producto> items){
        this.items = items;
        this.posicion = 0;
    }

    @Override
    public boolean hasMore(){
        return posicion < items.size();
    }
    
    @Override
    public Producto getNext(){
        if(hasMore()){
            Producto producto = producto.get(posicion);
            posicion++
            return producto;
        }
        return null;
    }
}