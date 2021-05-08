package estaticas;

public class ClaseExterna {

    //Miembro estático
    static int externo_x = 10;

    //Miembro de instancia
    int externo_y = 20;

    //Miembro privado
    private static int externo_privado = 30;

    //Clase anidada estática
    static class ClaseAnidadaStatic {

        void mostrar(){

            //Puede acceder al miembro estático de la clase externa
            System.out.println("externo_x: " + externo_x);

            //Puede acceder a mostrar un miembro estático privado de la clase externa
            System.out.println("externo_privado: " + externo_privado);

            /*La siguiente declaración dará un error de compilación ya que
            * la clase anidada estática no puede acceder directamente
            * a un miembro no estático*/
            //System.out.println("externo_y: " + externo_y);

        }
    }
}



