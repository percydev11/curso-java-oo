package noestaticas.interna;

public class PruebaClaseInterna {

    public static void main(String[] args) {

        //Accediendo a la clase interna
        ClaseExterna objetoExterno = new ClaseExterna();
        ClaseExterna.ClaseInterna objetoInterno = objetoExterno.new ClaseInterna();
        objetoInterno.mostrar();
    }
}
