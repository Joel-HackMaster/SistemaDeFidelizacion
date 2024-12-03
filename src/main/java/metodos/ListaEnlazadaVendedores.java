/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.ArrayList;
import java.util.List;
import modelos.VendedorEntity;

public class ListaEnlazadaVendedores {
    private Nodo cabeza;
    
    public ListaEnlazadaVendedores() {
        this.cabeza = null;
    }
    
    public void agregar(VendedorEntity vendedor) {
        Nodo nuevoNodo = new Nodo(vendedor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }
    
    public void agregarInicio(VendedorEntity vendedor) {
        Nodo nuevoNodo = new Nodo(vendedor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo; 
    }
    
    public List<VendedorEntity> obtenerVendedoresComoLista() {
        List<VendedorEntity> listaVendedores = new ArrayList<>();
        Nodo temp = cabeza;
        while (temp != null) {
            listaVendedores.add(temp.vendedor);
            temp = temp.siguiente;
        }
        return listaVendedores;
    }
    
    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.vendedor);
            temp = temp.siguiente;
        }
    }
}
