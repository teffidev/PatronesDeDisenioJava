package semana_7.caja_pelota_singleton_factory;

public class Caja extends Producto {
    //----Atributos----
    private Double longitud;
    private Double ancho;
    private Double altura;


    //----Constructor----

    public Caja(Double peso, Double longitud, Double ancho, Double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    //----Métodos----
    @Override
    public Double calcularEspacio() {
        return null;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
