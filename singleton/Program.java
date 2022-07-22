package semana_7.singleton;

public class Program {

    public static void main(String[] args) {
        /*Singleton
         * Vamos a hacer un ejercicio a partir de una necesidad
         * Su ventaja es:
         * es que tengo más control de mi código ¿Quién toca qué?*/

        /*Tiene un atributo especial que es static
        * Tiene un constructor PRIVATE que cuida que nadie más a excepción del
        * Singleton genere INSTANCIAS de esa clase...
        * Tiene un constructor public static que llega el método reservado
        * getInstance() me permite acceder a esa clase*/


        CajeroSupermercado lola = new CajeroSupermercado("Lola Lolez", 25256);

        Double monto = lola.aplicarDescuento(10.1, 15278.2);
        System.out.println(monto);


        Contador rodolfo = new Contador("Rodolfo", "UBA");
        Double monto2 = rodolfo.aplicarIVA(200.0);


        /*Double monto2 = lola.aplicarRecargo(15.2, 878475.5);*/
        System.out.println(monto2);

    }

}
