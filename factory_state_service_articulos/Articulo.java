package semana_7.factory_state_service_articulos;

public class Articulo {
    /*Atributos*/
    private StateArticulo estadoArticulo;
    private String nombre;
    private Double valorPresupuesto;
    private String direccion;



    /*Constructor*/
    public Articulo(StateArticulo estadoArticulo, String nombre, String direccion) {
        this.estadoArticulo = estadoArticulo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.setEstadoArticulo(new Presupuesto(this));
    }



    /*Métodos*/
    public void agregarValorRepuesto(Double valorRepuesto){
        this.valorPresupuesto =+ valorRepuesto;
    }

    public StateArticulo getEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(StateArticulo estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorPresupuesto() {
        return valorPresupuesto;
    }

    public void setValorPresupuesto(Double valorPresupuesto) {
        this.valorPresupuesto = valorPresupuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
