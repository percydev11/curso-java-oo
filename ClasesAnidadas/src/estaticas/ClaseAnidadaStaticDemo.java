package estaticas;

class ClaseAnidadaStaticDemo {

    public static void main(String[] args) {

        //Accediendo a la clase anidada estática
        ClaseExterna.ClaseAnidadaStatic objetoAnidado = new ClaseExterna.ClaseAnidadaStatic();
        objetoAnidado.mostrar();
    }
}