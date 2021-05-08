package ejercicios_practicos;

/* EJEMPLO DE CLASE INTERNA ANIDADA
Confeccionar una clase llamada Coordenadas que almacene la referencia de puntos en el plano mediante x e y.
Declarar una clase interna que represente un punto en el plano.
La clase Coordenadas debe almacenar en un ArrayList  los elementos de tipo Punto.
Además la clase Coordenadas debe poder calcular la cantidad de puntos almacenados en cada cuadrante.*/

import java.util.ArrayList;

//Clase externa
public class Coordenadas {

    //Clase interna
    private class Punto {
        private int x, y;

        public Punto(int x, int y) {
            fijarX(x);
            fijarY(y);
        }

        public void fijarX(int x) {
            this.x = x;
        }

        public void fijarY(int y) {
            this.y = y;
        }

        public int retornarCuadrante() {
            if (x > 0 && y > 0)
                return 1;
            else if (x < 0 && y > 0)
                return 2;
            else if (x < 0 && y < 0)
                return 3;
            else if (x > 0 && y < 0)
                return 4;
            else
                return -1;
        }
    }

    private ArrayList<Punto> puntos;

    public Coordenadas() {
        puntos = new ArrayList<Punto>();
    }

    public void agregarPunto(int x, int y) {
        puntos.add(new Punto(x, y));
    }

    public int cantidadPuntosCuadrante(int cuadrante) {
        int cant = 0;
        for (Punto pun : puntos)
            if (pun.retornarCuadrante() == cuadrante)
                cant++;
        return cant;


    }


}
