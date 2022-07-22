package semana_7.singleton;
/*Es la que se va a encargar de hacer todas las cuentas
* hace un llamado adentro del método de la clase y hace todas las
* operaciones..., Entonces si tengo que ajustar algunas operaciones
* matemáticas, solo trabajaré sobre esta clase*/

/*volvemos la Clase Singleton
* ponemos un atributo static que va a ser de su mismo tipo=Calculadora, lo
* instanciamos a si mismo...
* después hacemos un constructor de tipo private (para que nadie de afuera
* lo pueda llamar)
* Hacer un constructor que llame a instance*/

public class Calculadora {
    //----atributos----
    private static Calculadora instanceCalculadora = new Calculadora();



    //----constructor----
    private Calculadora (){

    }

    public  static Calculadora getInstance(){
        return instanceCalculadora;
    }


    //----métodos----

    public Double aplicarDescuento(Double monto, Double porcentajeDescuento){
        return monto * (100 - porcentajeDescuento);
    }

    public Double aplicarIncremento(Double monto, Double porcentajeIncremento){
        return monto * (100 + porcentajeIncremento);
    }

    public Double restarMonto(Double monto, Double cantidadARestar){
        return monto - cantidadARestar;
    }

    public Double sumarMonto(Double monto, Double cantidadASumar){
        return monto - cantidadASumar;
    }

    /*Vamos a llevar esta implementación a nuestras clases en sus métodos*/

}
