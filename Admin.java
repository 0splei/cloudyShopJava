class Admin extends Empleado {
    public Admin(int id, String nombre, String usuario, String correo, String contraseña) {
        super(id, nombre, usuario, correo, contraseña);
    }
    
    public void crearEtiqueta(String nombreEtiqueta) {
        // Añade una nueva etiqueta al sistema
    }

    public void eliminarEtiqueta(String nombreEtiqueta) {
        // Borra una etiqueta obsoleta
    }

    public void conocerInventario() {
        // Devuelve el inventario completo
        return;
    }

    public void registrarEmpleado() {
        // Crea una cuenta de empleado
    }

    public void eliminarCuentaEmpleado(int idEmpleado) {
        // Borra la cuenta de un empleado
    }

    public void editarInformacionEmpleado(int idEmpleado, String nuevosDatos) {
        // Actualiza datos de un empleado
    }

    public int consultarCantidadPedidos() {
        // Devuelve el número total de pedidos
        return 0;
    }

    public void consultarPagosRealizados() {
        // Lista todos los pagos procesados
        return;
    }

    public Direccion agregarPuntoEntrega(int id, String calle, String ciudad, String codigoPostal, boolean sesionIniciada) {
        // Define un nuevo punto de entrega disponible para pedidos
        return new Direccion(id, codigoPostal, codigoPostal, sesionIniciada);
    }

    public void editarPuntoEntrega(int idPunto, String calle, String ciudad, String codigoPostal) {
        // Actualiza la información de un punto de entrega existente
    }

    public void eliminarPuntoEntrega(int idPunto) {
        // Retira un punto de entrega que ya no se usa
    }
}