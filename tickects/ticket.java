/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickects;
import tickects.TipoTicket;

/**
 *
 * @author Student
 */
public class Ticket {
   private int numero;
   private TipoTicket tipo;

    public int getNumero() {
        return numero;
    }

    public TipoTicket getTipo() {
        return tipo;
    }

    public void setTipo(TipoTicket tipo) {
        this.tipo = tipo;
    }

    public Ticket(int numero, TipoTicket tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Ticket(){
        this(0, null);
    }

    @Override
    public String toString() {
        return "ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
   
   
}
