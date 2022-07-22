package semana_7.state_carrito_de_compras;

public class Producto {
    private StateCarrito carrito;
    private String descripcion;
    private Double precio;

    public Producto(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }


    public StateCarrito getCarrito() {
        return carrito;
    }

    public void setCarrito(StateCarrito carrito) {
        this.carrito = carrito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
