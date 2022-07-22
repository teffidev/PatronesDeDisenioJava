package semana_7.singleton;

public class Contador {

    //-----Atributos-----
    private String nombre;
    private String universidad;
    private Calculadora calculadora = Calculadora.getInstance();


    //----Constructor----

    public Contador(String nombre, String universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }


    //-----Métodos-----

    public Double aplicarIVA(Double monto){
        return  this.calculadora.aplicarIncremento(monto, 22.0);
    }

    public Double aplicarImpuestoALaVenta (Double monto){
        return  this.calculadora.aplicarIncremento(monto, 50.0);
    }

    /*Para que tener tantas instancias de calculadora si puedo tener solo una
    * ya qué no necesito algo como si fuera un atributo que depende de mi mismo
    * Aquí si podemos compartir porque no es un elemento único del Contador
    * se puede compartir por ser una herramienta
    * Para esto creamos una Clase Singleton y vamos a transformar la Clase
    * Calculadora en Singleton*/


}
