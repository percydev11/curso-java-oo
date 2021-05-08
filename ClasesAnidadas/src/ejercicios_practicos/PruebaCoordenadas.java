package ejercicios_practicos;

public class PruebaCoordenadas {

    public static void main(String[] args) {
        Coordenadas coordenadas = new Coordenadas();
        coordenadas.agregarPunto(30, 30);
        coordenadas.agregarPunto(2,7);
        coordenadas.agregarPunto(-3,2);
        coordenadas.agregarPunto(-5,-4);
        coordenadas.agregarPunto(-9,-2);
        coordenadas.agregarPunto(7, -11);
        System.out.println("Cantidad de puntos en el primer cuadrante: " + coordenadas.cantidadPuntosCuadrante(1));
        System.out.println("Cantidad de puntos en el segundo cuadrante: " + coordenadas.cantidadPuntosCuadrante(2));
        System.out.println("Cantidad de puntos en el tercero cuadrante: " + coordenadas.cantidadPuntosCuadrante(3));
        System.out.println("Cantidad de puntos en el cuarto cuadrante: " + coordenadas.cantidadPuntosCuadrante(4));


    }
}

