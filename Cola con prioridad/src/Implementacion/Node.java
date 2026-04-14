package Implementacion;

public class Node {

    private String dato;
    private int prioridad;
    private Node next;

    public Node(String dato, int prioridad, Node next) {
        this.dato = dato;
        this.prioridad = prioridad;
        this.next = next;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
