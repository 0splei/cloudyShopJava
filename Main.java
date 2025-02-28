import java.util.ArrayList;

public class Main {
    private ArrayList<Empleado> empleados;
    private ArrayList<Admin> admins;
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> catalogo;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Pago> pagos;
    private ArrayList<String> etiquetas;
    private ArrayList<Direccion> puntosEntrega;
    private String rolActual;

    public static void main(String[] args) {
        Main main = new Main();
        main.mostrarMenuInicial();
    }

    public void mostrarMenuInicial() {
        // Implementación del menú inicial
    }

    public void registrarCliente() {
        // Implementación de la creación de un nuevo cliente
    }

    public void iniciarSesionCliente() {
        // Implementación de la autenticación de un cliente
    }

    public void iniciarSesionUsuario() {
        // Implementación de la autenticación de un empleado o administrador
    }

    public void mostrarMenuCliente() {
        // Implementación del menú para clientes
    }

    public void mostrarMenuEmpleado() {
        // Implementación del menú para empleados
    }

    public void mostrarMenuAdmin() {
        // Implementación del menú para administradores
    }

    public void cerrarSesion() {
        // Implementación de la terminación de la sesión
    }
}