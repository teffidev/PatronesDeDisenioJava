package semana_7.caja_pelota_singleton_factory;

public abstract class Producto {
    //----Atributos----
    private Double peso;


    //----Constructor----

    public Producto(Double peso) {
        this.peso = peso;
    }


    //----Métodos----
    public abstract Double calcularEspacio();

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
