package semana_7.caja_pelota_singleton_factory;

public class Pelota extends Producto{
    //----Atributos----
    private Double radio;


    //----Constructor----

    public Pelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }


    //----Métodos----
    @Override
    public Double calcularEspacio() {
        return null;
    }


}
