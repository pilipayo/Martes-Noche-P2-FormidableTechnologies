import Implementacion.Estrategia_1;

import Interfaces.PilaTDAStr;

public class Main {
    public static void main(String[] args) {

        PilaTDAStr p1 = new Estrategia_1();
        probarPila("Estrategia 1", p1);
        PilaTDAStr p2 = new Estrategia_1();
        Ej2("Ej2", p2);
        }
    public static void probarPila(String nombre, PilaTDAStr pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        System.out.println("... Ingresando a https://fi.uba.ar/");
        pila.Apilar("https://fi.uba.ar/");
        System.out.println("... Ingresando a https://campus.utn.edu.ar/");
        pila.Apilar("http://campus.utn.edu.ar/");
        System.out.println("... Ingresando a https://stackoverflow.com/questions");
        pila.Apilar("https://stackoverflow.com/questions");

        System.out.println("Tope luego de apilar UBA, UTN y STACKOVERFLOW: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());

        System.out.println();
    }


    public static void Ej2(String nombre, PilaTDAStr pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar("Hola");
        System.out.println("Agregando a la pila 'Hola'");
        pila.Apilar("Mundo");
        System.out.println("Agregando a la pila 'Mundo'");
        pila.Apilar(".");
        System.out.println("Agregando a la pila '.'");

        System.out.println("Tope luego de apilar 'Hola Mundo .' ---- :  " + pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());

        System.out.print("Desapilando nuevamente...");
        pila.Desapilar();
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());

        System.out.println();
    }

    public static void Ej3(String nombre, PilaTDAStr pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar("(");
        System.out.println("Agregando a la pila '('");
        pila.Apilar("(");
        System.out.println("Agregando a la pila '('");

        System.out.println("Tope luego de abrir 2 paréntesis " + pila.Tope());
        pila.Desapilar();
        System.out.println("Tope luego de desapilar (cerrar paréntesis) una vez: **SI HAY PARÉNTESIS, SIGNIFICA QUE FALTA CERRAR ALGUNO** " + pila.Tope());

        pila.Desapilar();
        System.out.print("Tope luego de desapilar una vez más (cerrar paréntesis) **SI PILA VACÍA -> NO FALTA CERRAR PARÉNTESIS**: ");

        System.out.println("¿Pila vacía?: " + pila.PilaVacia());

        System.out.println();
    }
}
