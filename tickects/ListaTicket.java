/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickects;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaTicket {
    private ArrayList<Ticket> listaTicket;

    public ListaTicket() {
        this.listaTicket = new ArrayList<>();
    }
    
    public void agregarTicket(Ticket ticket){
        listaTicket.add(ticket);
    }
    
    public void eliminarTicket(int numero){
        listaTicket.removeIf(Ticket -> ticket.getNumero().equals(numero));
    }
    
    public void buscarTicket(int numero){
            
    }
    
    public ArrayList<Ticket> ListaTicket() {
        return listaTicket;
    }
    
}
