package noestaticas.anonima;

//Clase externa
public class ClaseAnonimaDemo{

    abstract class A {
        public abstract void imprimir();
    }

    interface B {
        void imprimir();
    }

    public void probar() {
        //Clase anónima que hereda de la clase A e implementa su método abstracto
        (new A() {
            public void imprimir() {
                System.out.println("Clase");
            }
        }).imprimir();

        //Clase anónima que implementa la interfaz  B
        (new B() {
            public void imprimir() {
                System.out.println("Interface");
            }
        }).imprimir();

    }
}
