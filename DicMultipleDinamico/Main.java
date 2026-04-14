import Implementacion.DiccionarioMultipleDinamico;
import Interface.DiccionarioMultipleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioMultipleTDA d = new DiccionarioMultipleDinamico();

        d.InicializarDiccionario();

        d.Agregar("feliz", "alegre");
        d.Agregar("feliz", "contento");
        d.Agregar("feliz", "dichoso");
        d.Agregar("triste", "melancolico");
        d.Agregar("triste", "apenado");
        d.Agregar("triste", "apenado"); // no se repite

        System.out.println("Palabras del diccionario:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println("  " + claves1[i]);
        }

        System.out.println("\nSinonimos de 'feliz':");
        String[] sinonimos = d.Recuperar("feliz");
        for (int i = 0; i < sinonimos.length; i++) {
            System.out.println("  " + sinonimos[i]);
        }

        d.EliminarValor("feliz", "contento");

        System.out.println("\nSinonimos de 'feliz' luego de eliminar 'contento':");
        String[] sinonimos2 = d.Recuperar("feliz");
        for (int i = 0; i < sinonimos2.length; i++) {
            System.out.println("  " + sinonimos2[i]);
        }

        d.Eliminar("triste");

        System.out.println("\nPalabras luego de eliminar 'triste':");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println("  " + claves2[i]);
        }
    }
}
