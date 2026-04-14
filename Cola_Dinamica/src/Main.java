import Implementacion.ColaDinamica;
import Interface.ColaTDA;

public class Main {
    public static void main(String[] args) {

        System.out.println("--EJERCICIO FILA DEL CAJERO--");

        ColaTDA colaCajero = new ColaDinamica();
        colaCajero.InicializarCola();

        System.out.println("\n¿No hay nadie en la cola del cajero?: " + colaCajero.ColaVacia());

        colaCajero.Acolar("Juan");
        System.out.println("\nIngresa Juan al cajero");
        colaCajero.Acolar("Maria");
        System.out.println("Ingresa Maria");
        colaCajero.Acolar("Carla");
        System.out.println("Ingresa Carla");


        System.out.println("\nEl primero en usar el cajero es: " + colaCajero.Primero());//Juan
        colaCajero.Desacolar();
        System.out.println("Luego de desacolar, pasa: " + colaCajero.Primero());//Maria
        colaCajero.Acolar("Pilar");
        System.out.println("Entra otra persona: Pilar ");
        colaCajero.Desacolar();
        System.out.println("Sale Maria y pasa: " + colaCajero.Primero());//Carla
        colaCajero.Desacolar();
        System.out.println("Primero luego de desacolar: " + colaCajero.Primero());//Pilar
        colaCajero.Desacolar();

        System.out.println("¿Ya no queda nadie en la fila?: " + colaCajero.ColaVacia());
    }
}