package semana_7.caja_pelota_singleton_factory;

public class AlmacenFactory {

    /*Atributo que almacena la única instancia que será creada*/
    private static AlmacenFactory instancia;

    /*constructor privado, para que no se pueda instanciar desde fuera*/
    private AlmacenFactory(){

    }

    /*SINGLETON*/
    /*getInstance() retorna la unica instancia que puede ser creada */
    public static AlmacenFactory getInstance(){
        if(instancia == null){
            instancia = new AlmacenFactory();
        }
        return instancia;
    }

    /*Método construir, recibe un string
    que determina el objeto concreto a Instanciar */
    public static AlmacenFactory construir(String tipo){

        /*identificar el parámetro recibido con un switch*/
        switch (tipo){
            case "Caja":
                return null;
            case "Pelota":
                ;
            default:
                System.out.println("Ups, no encontramos este objeto para construir");
                return null;
        }
    }

}
