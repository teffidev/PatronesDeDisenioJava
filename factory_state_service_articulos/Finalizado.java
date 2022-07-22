package semana_7.factory_state_service_articulos;

import java.sql.SQLOutput;

public class Finalizado implements StateArticulo{
    /*Atributos*/
    private Articulo articulo;



    /*Constructor*/
    public Finalizado(Articulo articulo) {
        this.articulo = articulo;
    }



    /*Métodos*/
    @Override
    public void valorPresupuesto() {

    }

    @Override
    public void sumaRepuesto() {

    }

    @Override
    public void cambiarDireccion() {

    }


    @Override
    public void pasarSiguientePaso() {
        System.out.println("El articulo fue entregado");

    }
}
