/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickects;

/**
 *
 * @author Student
 */
public class Ticket {
   private int numero;
   private String tipo;

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ticket(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
    public Ticket(){
        this(0,"");
    }

    @Override
    public String toString() {
        return "ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
   
   
}
