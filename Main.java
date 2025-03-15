import modelo.pedido.Direccion;
import modelo.pedido.Pago;
import modelo.pedido.Pedido;
import modelo.producto.Etiqueta;
import modelo.producto.Producto;
import modelo.usuario.Admin;
import modelo.usuario.Cliente;
import modelo.usuario.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Admin> admins = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Producto> catalogo = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Direccion> direcciones = new ArrayList<>();
    private static ArrayList<Pago> pagos = new ArrayList<>();
    private static ArrayList<Etiqueta> etiquetas = new ArrayList<>();
    private static ArrayList<Direccion> puntosEntrega = new ArrayList<>();
    private static String rolActual;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Menú principal
        while (true) {

            inicializarDatos();

            System.out.println("\nBienvenido al sistema");
            System.out.println("1. Iniciar sesión como administrador");
            System.out.println("2. Iniciar sesión como empleado");
            System.out.println("3. Iniciar sesión como cliente");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    manejarAdmin();
                    break;
                case "2":
                    manejarEmpleado();
                    break;
                case "3":
                    manejarCliente();
                    break;
                case "4":
                    System.out.println("Saliendo del sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    private static void inicializarDatos() {
        // Administradores
        admins.add(new Admin(1, "Juan Admin", "admin1", "admin1@empresa.com", "admin123"));

        // Empleados
        empleados.add(new Empleado(1, "Ana Empleado", "empleado1", "ana@empresa.com", "emp123"));
        empleados.add(new Empleado(2, "Luis Empleado", "empleado2", "luis@empresa.com", "emp456"));

        // Clientes
        clientes.add(new Cliente(1, "María Cliente", "cliente1", "maria@cliente.com", "cli123", "555-1234"));
        clientes.add(new Cliente(2, "Pedro Cliente", "cliente2", "pedro@cliente.com", "cli456", "555-5678"));

        // Etiquetas
        etiquetas.add(new Etiqueta(1, "Electrónica"));
        etiquetas.add(new Etiqueta(2, "Hogar"));

        // Productos
        ArrayList<Etiqueta> etiquetasProducto1 = new ArrayList<>();
        etiquetasProducto1.add(etiquetas.getFirst()); // Electrónica
        catalogo.add(new Producto(1, "Laptop", "Laptop de alta gama", 1000.0, 10));

        ArrayList<Etiqueta> etiquetasProducto2 = new ArrayList<>();
        etiquetasProducto2.add(etiquetas.get(1)); // Hogar
        catalogo.add(new Producto(2, "Silla", "Silla ergonómica", 150.0, 20));

        ArrayList<Etiqueta> etiquetasProducto3 = new ArrayList<>();
        etiquetasProducto3.add(etiquetas.get(0)); // Electrónica
        catalogo.add(new Producto(3, "Teléfono", "Smartphone moderno", 500.0, 15));

        // Direcciones
        direcciones.add(new Direccion(1, "Calle Falsa 123", "Ciudad A", false));
        direcciones.add(new Direccion(2, "Avenida Real 456", "Ciudad B", false));

        // Puntos de Entrega
        puntosEntrega.add(new Direccion(1, "Punto Central", "Ciudad C", true));

        // Pagos
        pagos.add(new Pago(1, "Tarjeta", "1234-5678-9012-3456", "Completado"));

        // Pedidos
        ArrayList<Producto> productosPedido = new ArrayList<>();
        productosPedido.add(catalogo.get(0)); // Laptop
        pedidos.add(new Pedido(1, productosPedido, direcciones.get(0), pagos.get(0), "Pendiente", clientes.get(0).getId()));
    }

    private static void manejarAdmin() {
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        Admin admin = buscarAdmin(usuario, password);
        if (admin != null) {
            System.out.println("Sesión iniciada como administrador");
            menuAdmin(admin);
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }

    private static void manejarEmpleado() {
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = sc.nextLine();

        Empleado empleado = buscarEmpleado(usuario, contraseña);
        if (empleado != null) {
            System.out.println("Sesión iniciada como empleado");
            menuEmpleado(empleado);
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }

    private static void manejarCliente() {
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        Cliente cliente = buscarCliente(usuario, password);
        if (cliente != null) {
            System.out.println("Sesión iniciada como cliente");
            menuCliente(cliente);
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }

    private static Admin buscarAdmin(String usuario, String contraseña) {
        for (Admin admin : admins) {
            if (admin.iniciarSesion(usuario, contraseña)) {
                return admin;
            }
        }
        return null;
    }

    private static Empleado buscarEmpleado(String usuario, String contraseña) {
        for (Empleado empleado : empleados) {
            if (empleado.iniciarSesion(usuario, contraseña)) {
                return empleado;
            }
        }
        return null;
    }

    private static Cliente buscarCliente(String usuario, String contraseña) {
        for (Cliente cliente : clientes) {
            if (cliente.iniciarSesion(usuario, contraseña)) {
                return cliente;
            }
        }
        return null;
    }

    private static void menuAdmin(Admin admin) {
        while (true) {
            System.out.println("\nMenú Administrador");
            System.out.println("1. Crear etiqueta");
            System.out.println("2. Registrar empleado");
            System.out.println("3. Agregar punto de entrega");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Nombre de la etiqueta: ");
                    String nombreEtiqueta = sc.nextLine();
                    admin.crearEtiqueta(nombreEtiqueta, etiquetas);
                    System.out.println("Etiqueta creada");
                    break;
                case "2":
                    System.out.print("Nombre del empleado: ");
                    String nombre = sc.nextLine();
                    System.out.print("Usuario: ");
                    String usuario = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String contraseña = sc.nextLine();
                    admin.registrarEmpleado(nombre, usuario, contraseña, empleados);
                    System.out.println("Empleado registrado");
                    break;
                case "3":
                    System.out.print("Calle: ");
                    String calle = sc.nextLine();
                    System.out.print("Ciudad: ");
                    String ciudad = sc.nextLine();
                    admin.agregarPuntoEntrega(calle, ciudad, "00000", puntosEntrega);
                    System.out.println("Punto de entrega agregado");
                    break;
                case "4":
                    admin.cerrarSesion();
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void menuEmpleado(Empleado empleado) {
        while (true) {
            System.out.println("\nMenú Empleado");
            System.out.println("1. Consultar productos del catálogo");
            System.out.println("2. Agregar producto al catálogo");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    List<Producto> productos = empleado.consultarProductosCatalogo(catalogo);
                    System.out.println("Catálogo: " + productos);
                    break;
                case "2":
                    System.out.print("ID del producto: ");
                    int idProducto = Integer.parseInt(sc.nextLine());
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.print("Inventario: ");
                    int inventario = Integer.parseInt(sc.nextLine());
                    Producto nuevoProducto = new Producto(idProducto, nombre, descripcion, precio, inventario);
                    empleado.agregarProductoCatalogo(nuevoProducto, catalogo);
                    System.out.println("Producto agregado");
                    break;
                case "3":
                    empleado.cerrarSesion();
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void menuCliente(Cliente cliente) {
        while (true) {
            System.out.println("\nMenú Cliente");
            System.out.println("1. Ver productos");
            System.out.println("2. Crear pedido");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    List<Producto> productos = cliente.verProductos(catalogo);
                    System.out.println("Catálogo: " + productos);
                    break;
                case "2":
                    Pedido nuevoPedido = cliente.crearPedido(pedidos);
                    System.out.println("Pedido creado con ID: " + nuevoPedido.getId());
                    break;
                case "3":
                    cliente.cerrarSesion();
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}