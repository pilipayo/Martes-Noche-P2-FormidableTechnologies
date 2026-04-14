import Implementacion.DiccionarioSimpleDinamico;
import Interface.DiccionarioSimpleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioSimpleTDA d = new DiccionarioSimpleDinamico();

        d.InicializarDiccionario();

        d.Agregar("Sebastian", 100);
        d.Agregar("Nacho", 200);
        d.Agregar("Pilar", 300);
        d.Agregar("Augus", 250); // actualiza el valor de la clave 2

        System.out.println("Claves del diccionario:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        d.Eliminar("Nacho");

        System.out.println("Claves luego de eliminar la clave 2:");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }
}
