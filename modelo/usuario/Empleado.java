package modelo.usuario;

import modelo.pedido.Direccion;
import modelo.pedido.Pago;
import modelo.pedido.Pedido;
import modelo.producto.Etiqueta;
import modelo.producto.Producto;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int id;
    private String nombre;
    private String usuario;
    private String correo;
    private String contraseña;

    // Constructor completo
    public Empleado(int id, String nombre, String usuario, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public boolean iniciarSesion(String usuario, String contraseña) {
        return (this.usuario.equals(usuario) && this.contraseña.equals(contraseña));
    }
    public void cerrarSesion() {
        // pendiente de mas
        System.out.println("Sesion cerrada para " + usuario);
    }

    public List<Producto> consultarProductosCatalogo(List<Producto> catalogo) {
        return new ArrayList<>(catalogo);
    }

    public void agregarProductoCatalogo(Producto producto, List<Producto> catalogo) {
        catalogo.add(producto);
    }

    public void eliminarProductoCatalogo(int idProducto, List<Producto> catalogo) {
        catalogo.removeIf(p -> p.getId() == idProducto);
    }

    public void editarProductoCatalogo(int idProducto, List<Producto> catalogo, String nuevoNombre, String nuevaDescripcion, double nuevoPrecio) {
        for (Producto p : catalogo) {
            if (p.getId() == idProducto) {
                p.setNombre(nuevoNombre);
                p.setDescripcion(nuevaDescripcion);
                p.setPrecio(nuevoPrecio);
            }
        }
    }

    public void agregarEtiquetaProducto(int idProducto, Etiqueta etiqueta, List<Producto> catalogo) {
        for (Producto p : catalogo) {
            if (p.getId() == idProducto) {
                p.agregarEtiqueta(etiqueta);
            }
        }
    }

    public void eliminarEtiquetaProducto(int idProducto, Etiqueta etiqueta, List<Producto> catalogo) {
        for (Producto p : catalogo) {
            if (p.getId() == idProducto) {
                p.eliminarEtiqueta(etiqueta);
            }
        }
    }

    public int consultarInventarioProducto(int idProducto, ArrayList<Producto> catalogo) {
        for (Producto p : catalogo) {
            if (p.getId() == idProducto) {
                return p.getInventario();
            }
        }
        return -1;
    }

    public void registrarEntradaInventario(int idProducto, int cantidad, List<Producto> catalogo) {
        for (Producto p : catalogo) {
            if (p.getId() == idProducto) {
                p.actualizarInventario(p.getInventario() + cantidad);
            }
        }
    }

    public List<Producto> recibirAlertasInventarioBajo(List<Producto> catalogo) {
        List<Producto> alertas = new ArrayList<>();
        for (Producto p : catalogo) {
            if (p.getInventario() < 5) {
                alertas.add(p);
            }
        }
        return alertas;
    }

    public void actualizarEstadoPedido(int idPedido, String nuevoEstado, List<Pedido> pedidos) {
        for (Pedido p : pedidos) {
            if (p.getId() == idPedido) {
                p.setEstado(nuevoEstado);
            }
        }
    }

    public void cancelarPedido(int idPedido, List<Pedido> pedidos) {
        for (Pedido p : pedidos) {
            if (p.getId() == idPedido) {
                p.setEstado("Cancelado");
            }
        }
    }

    public List<Pedido> verPedidosPendientes(List<Pedido> pedidos) {
        List<Pedido> pendientes = new ArrayList<>();
        for (Pedido p : pedidos) {
            if ("Pendiente".equals(p.getEstado())) {
                pendientes.add(p);
            }
        }
        return pendientes;
    }

    public boolean verificarEstadoPago(int idPago, List<Pago> pagos) {
        for (Pago p : pagos) {
            if (p.getId() == idPago) {
                return "Completado".equals(p.getEstado());
            }
        }
        return false;
    }

    public Direccion consultarDireccionPedido(int idPedido, List<Pedido> pedidos) {
        for (Pedido p : pedidos) {
            if (p.getId() == idPedido) {
                return p.getDireccion();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', usuario='" + usuario + "'}";
    }
}

