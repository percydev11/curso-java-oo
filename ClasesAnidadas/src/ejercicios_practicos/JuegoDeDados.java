package ejercicios_practicos;

/*Confeccionar una clase llamada JuegoDeDados que contenga
una clase anidada interna llamada Dado. La clase JuegoDeDados tiene
como atributo el nombre del jugador que tirará el dado y un objeto de la clase Dado.
Cada vez que se tire un dado la clase Dado debe verificar que
el atributo 'jugador' de la clase externa tenga el nombre de una persona.*/


//Clase externa
public class JuegoDeDados {

    private String jugador;
    private Dado dado1;

    //Clase interna
    private class Dado {
        private int valor = 1;

        private void tirar() throws Exception {
            if(jugador == null)
                throw new Exception("No hay jugador seleccionado");
            valor = 1 + (int) (Math.random() * 6);
        }

        public void imprimir() {
            System.out.println("Al jugador " + jugador + " le salió el valor " + valor);
        }
    }



    public JuegoDeDados() {
        dado1 = new Dado();
    }

    public void jugar() {
        try {
            jugador = "Pedro";
            dado1.tirar();
            dado1.imprimir();
            jugador = "Ana";
            dado1.tirar();
            dado1.imprimir();
            jugador = null;
            dado1.tirar();
            dado1.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
