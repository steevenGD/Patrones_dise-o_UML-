package ec.edu.espol.taller_patrones_diseno.Iterator;


    public class Producto {
        private String nombre;
        private String tipo;
        private int cantidad;

        public Producto(String nombre, String tipo, int cantidad){
            this.nombre= nombre;
            this.tipo= tipo;
            this.cantidad= cantidad;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    Producto get(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        

    }