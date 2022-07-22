package semana_7.singleton;

public class CajeroSupermercado {

    //----Atributos------
    private String nombre;
    private Integer id;
    private Calculadora calculadora = Calculadora.getInstance();

    //-----Constructor----
    /*Supongamos que es un Supermercado en un pueblo y te dan cupones
    * para que en una próxima tenga un descuento*/

    public CajeroSupermercado(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    //-----Métodos-----

    public Double aplicarDescuento (Double porcentaje, Double monto){
        return this.calculadora.aplicarDescuento(monto, porcentaje);
    }

    /*Podría aplicarle algún cargo adicional*/

    public Double aplicarRecargo(Double recargo, Double monto){
        return this.calculadora.aplicarIncremento(monto, recargo);
    }

    /*Nos dice el dueño del Supermercado que ellos tienen un contador
    * entonces creamos una clase Contador*/

}
