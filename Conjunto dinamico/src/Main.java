import Implementacion.ConjuntoDinamico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoDinamico();

        c.InicializarConjunto();

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());

        int legajo1 = 1354;
        int legajo2 = 3764;
        int legajo3 = 6553;
        System.out.println("¿Pertenece el estudiante 1?: " + c.Pertenece(legajo1));
        if (!c.Pertenece(legajo1)){
            c.Agregar(legajo1); //vota estudiante 1
            System.out.println("Vota el estudiante 1");
        } else{
            System.out.println("El estudiante ya voto. No puede votar otra vez");
        }
        System.out.println("¿Pertenece el estudiante 2?: " + c.Pertenece(legajo2));
        if (!c.Pertenece(legajo2)){
            c.Agregar(legajo2); //vota estudiante 2
            System.out.println("Vota el estudiante 2");
        } else{
            System.out.println("El estudiante ya voto. No puede votar otra vez");
        }
        System.out.println("¿Pertenece el estudiante 3?: " + c.Pertenece(legajo3));
        if (!c.Pertenece(legajo3)){
            c.Agregar(legajo3); //vota estudiante 3
            System.out.println("Vota el estudiante 3");
        } else{
            System.out.println("El estudiante ya voto. No puede votar otra vez");
        }
        System.out.println("¿Pertenece el estudiante 1?: " + c.Pertenece(legajo1));
        if (!c.Pertenece(legajo1)){
            c.Agregar(legajo1); //vota estudiante 1
        } else{
            System.out.println("El estudiante ya voto. No puede votar otra vez");
        }


        c.Sacar(legajo1);
        System.out.println("¿Pertenece el alumno 1 luego de sacarlo?: " + c.Pertenece(7));

        c.Sacar(legajo3);
        System.out.println("¿Pertenece el alumno 3 luego de sacarlo?: " + c.Pertenece(3));

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());
    }
}
