import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<Producto> productos;
    private Direccion direccion;
    private Pago metodoPago;
    private String estado;
    private int clienteId;

    public Pedido(int id, ArrayList<Producto> productos, Direccion direccion, Pago metodoPago, String estado, int clienteId) {
        this.id = id;
        this.productos = productos;
        this.direccion = direccion;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.clienteId = clienteId;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Pago getMetodoPago() {
        return metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setMetodoPago(Pago pago) {
        this.metodoPago = pago;
    }
}