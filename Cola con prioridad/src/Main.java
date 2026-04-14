import Implementacion.ColaPrioridadDinamica;
import Interface.ColaPrioridadTDA;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new ColaPrioridadDinamica();

        cola.InicializarColaPrioridad();

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());

        cola.AcolarPrioridad("persona1", 1);
        cola.AcolarPrioridad("persona2", 10);
        cola.AcolarPrioridad("persona3", 18);
        cola.AcolarPrioridad("persona4", 100);
        cola.AcolarPrioridad("persona5", 81);

        System.out.println("Ingresa primero la " + cola.Primero() + " por prioridad" + ", su prioridad es de :"+ cola.Prioridad());



        cola.Desacolar();
        System.out.println("El proximo en la fila es :");
        System.out.println("Ingresa primero la " + cola.Primero() + " por prioridad" + ", su prioridad es de :"+ cola.Prioridad());


        cola.Desacolar();
        System.out.println("El proximo en la fila es :");
        System.out.println("Ingresa primero la " + cola.Primero() + " por prioridad" + ", su prioridad es de :"+ cola.Prioridad());


        cola.Desacolar();
        System.out.println("El proximo en la fila es :");
        System.out.println("Ingresa primero la " + cola.Primero() + " por prioridad" + ", su prioridad es de :"+ cola.Prioridad());


        cola.Desacolar();
        System.out.println("No hay gente en la fila : " + cola.ColaVacia());
    }
}
