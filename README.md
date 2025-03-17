# CloudyShop - Java
Claudy Shop e-commerce system in Java

## Sistema de Gestión de Comercio Electrónico

Este proyecto es un sistema de gestión para un comercio electrónico desarrollado en Java como una aplicación de consola para la tienda CloudyShop. 
Permite a diferentes tipos de usuarios (administradores, empleados y clientes) interactuar con el sistema según sus roles. Los administradores pueden gestionar etiquetas, empleados y puntos de entrega; los empleados pueden gestionar productos y pedidos; y los clientes pueden registrarse, gestionar su cuenta, ver productos, crear pedidos y más.

## Descripción

El sistema simula las operaciones básicas de un comercio electrónico, incluyendo:

- **Gestión de usuarios**: Registro e inicio de sesión para administradores, empleados y clientes.
- **Gestión de productos**: Creación, edición y eliminación de productos y etiquetas.
- **Gestión de pedidos**: Creación, actualización y cancelación de pedidos, con manejo de direcciones y pagos.
- **Interfaz de consola**: Interacción a través de menús organizados por roles.

## Uso

Al iniciar el programa, se presenta un menú principal con las siguientes opciones:

1. Iniciar sesión como administrador
2. Iniciar sesión como empleado
3. Iniciar sesión como cliente
4. Registrarse como cliente
5. Salir

Dependiendo de la opción seleccionada, el usuario será dirigido a un menú específico para su rol. El sistema incluye datos iniciales precargados (administradores, empleados, clientes, productos, etc.) para facilitar las pruebas.

### Menú de Administrador
- **Gestión de Etiquetas**: Crear y eliminar etiquetas.
- **Gestión de Empleados**: Registrar, eliminar y editar información de empleados.
- **Gestión de Inventario**: Consultar el inventario completo.
- **Gestión de Pedidos**: Consultar cantidad de pedidos y pagos realizados.
- **Gestión de Puntos de Entrega**: Agregar, editar y eliminar puntos de entrega.
- **Cerrar sesión**.

### Menú de Empleado
- **Gestión de Productos**: Consultar, agregar, eliminar y editar productos; agregar y eliminar etiquetas de productos.
- **Gestión de Inventario**: Consultar inventario de un producto, registrar entrada de inventario, recibir alertas de inventario bajo.
- **Gestión de Pedidos**: Actualizar estado de pedido, cancelar pedido, ver pedidos pendientes, verificar estado de pago, consultar dirección de pedido.
- **Cerrar sesión**.

### Menú de Cliente
- **Mi Cuenta**: Editar datos, eliminar cuenta, gestionar métodos de pago y direcciones.
- **Productos**: Ver productos, filtrar por etiqueta, consultar inventario, agregar productos a un pedido.
- **Mis Pedidos**: Crear pedido, consultar estado de pedidos, ver historial de compras, agregar dirección y método de pago a un pedido, cancelar pedido.
- **Cerrar sesión**.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- **`modelo.usuario`**: Contiene las clases `Admin`, `Empleado` y `Cliente`.
- **`modelo.producto`**: Contiene las clases `Producto` y `Etiqueta`.
- **`modelo.pedido`**: Contiene las clases `Pedido`, `Direccion` y `Pago`.
- **`Main`**: Clase principal ubicada en el paquete raíz, maneja la lógica del programa y la interacción con el usuario a través de la consola.


## Mejoras a futuro

- Validación más robusta de entradas del usuario.
- Persistencia de datos (almacenamiento en archivos o base de datos).
- Mejoras en la interfaz de consola (mensajes más detallados o formato visual).
