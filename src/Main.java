import Implementacion.Estrategia_1;
import Implementacion.PilaDinamica;
import Interfaces.PilaTDA;

public class Main {


    public static void main(String[] args) {

        PilaTDA pila = new Estrategia_1();
        PilaTDA pila2 = new PilaDinamica();

        probarPila("Pila Estatica y Dinamica", pila, pila2);

    }

    public static void probarPila(String nombre, PilaTDA pila, PilaTDA pila2) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar(1);
        pila.Apilar(2);
        pila.Apilar(3);
        pila.Apilar(4);
        pila.Apilar(5);
        pila.Apilar(6);
        pila.Apilar(7);
        pila.Apilar(8);
        pila.Apilar(9);
        pila.Apilar(10);

        pila2.InicializarPila();


        while (!pila.PilaVacia()) {
            if (pila.Tope() != 5) {
                pila2.Apilar(pila.Tope());
            }
            pila.Desapilar();

        }

        while (!pila2.PilaVacia()) {
            System.out.println("Pila dinámica: " + pila2.Tope());
            pila2.Desapilar();
        }

        System.out.println("\n¿Pila estática vacía?: " + pila.PilaVacia());
        System.out.println("¿Pila dinámica vacía?: " + pila2.PilaVacia());

        }

    }
