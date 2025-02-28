public class Pago {
    private int id;
    private String tipo;
    private String datos;
    private String estado;

    public Pago(int id, String tipo, String datos, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.datos = datos;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDatos() {
        return datos;
    }

    public String getEstado() {
        return estado;
    }

    public void setDatos(String nuevosDatos) {
        this.datos = nuevosDatos;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}