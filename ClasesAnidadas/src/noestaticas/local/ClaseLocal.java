package noestaticas.local;

public class ClaseLocal {

    public void imprimir() {
        System.out.println("Comienzo del método imprimir de la clase externa ");

        class Local {
            public void imprimir() {
                System.out.println("Método imprimir de la clase local. ");

            }
        }

        Local local1 = new Local();
        local1.imprimir();
        System.out.println("Fin del método de la clase externa");
    }
}


