/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Student
 */
public class ListaTicket {
    private ArrayList<Ticket> listaTicket;
    
    private LinkedList<String> lista;
    private ListIterator<String> iterador;

    public ListaTicket() {
        this.listaTicket = new ArrayList<>();
        this.lista = lista;
        this.iterador = lista.listIterator();
    }
    
    public void agregarTicket(Ticket ticket){
        listaTicket.add(ticket);
    }
    
    public void eliminarTicket(int numero){
        listaTicket.removeIf(Ticket -> ticket.getNumero().equals(numero));
    }
    
    public void buscarTicket(int numero, String tipo){
        for (Ticket ticket : listaTicket) {
            if (listaTicket.get(numero).equals(tipo)) {
                return numero;
            }
        }
    }
    
    public ArrayList<Ticket> ListaTicket() {
        return listaTicket;
    }

    public boolean avanzar() {
        if (iterador.hasNext()) {
            iterador.next();
            return true;
        }
        return false;
    }

    public String obtenerElementoActual() {
        if (iterador.hasPrevious()) {
            return iterador.previous();
        }
        return null;
    }
    
    
}
