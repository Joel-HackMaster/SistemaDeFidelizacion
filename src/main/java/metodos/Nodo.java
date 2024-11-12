/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import modelos.VendedorEntity;

/**
 *
 * @author jwsb1
 */
public class Nodo {
    VendedorEntity vendedor;
    Nodo siguiente;
    
    public Nodo(VendedorEntity vendedor) {
        this.vendedor = vendedor;
        this.siguiente = null; // Al crear un nodo, su referencia siguiente es null
    }
}
