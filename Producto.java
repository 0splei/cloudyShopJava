import java.util.ArrayList;

public class Producto {
        private int id;
        private String nombre;
        private String descripcion;
        private double precio;
        private ArrayList<Etiqueta> etiquetas;
        private int inventario;

        public Producto(int id, String nombre, String descripcion, double precio, int inventario) {
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
            this.etiquetas = new ArrayList<Etiqueta>();
            this.inventario = inventario;
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getPrecio() {
            return precio;
        }

        public ArrayList<Etiqueta> getEtiquetas() {
            return etiquetas;
        }

        public int getInventario() {
            return inventario;
        }

        public void setDescripcion(String nueva) {
            this.descripcion = nueva;
        }

        public void setPrecio(double nuevo) {
            this.precio = nuevo;
        }

        public void agregarEtiqueta(Etiqueta etiqueta) {
            this.etiquetas.add(etiqueta);
        }

        public void eliminarEtiqueta(Etiqueta etiqueta) {
            this.etiquetas.remove(etiqueta);
        }

        public void actualizarInventario(int cantidad) {
            this.inventario = cantidad;
        }
    
}