/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Collections;
import java.util.List;
import modelos.VentaEntity;

/**
 *
 * @author jwsb1
 */
public class quicksort {
    public void ordenar(List<VentaEntity> ventas) {
        quickSort(ventas, 0, ventas.size() - 1);
    }

    private void quickSort(List<VentaEntity> ventas, int inicio, int fin) {
        if (inicio < fin) {
            int pivoteIndex = particionar(ventas, inicio, fin);
            quickSort(ventas, inicio, pivoteIndex - 1);
            quickSort(ventas, pivoteIndex + 1, fin);
        }
    }

    private int particionar(List<VentaEntity> ventas, int inicio, int fin) {
        float pivote = ventas.get(fin).getMontoVenta(); // Cambia esto a la propiedad que deseas usar para la comparación
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (ventas.get(j).getMontoVenta() < pivote) { // Cambia esto a la propiedad que deseas usar para la comparación
                i++;
                Collections.swap(ventas, i, j); // Usa Collections para hacer el swap
            }
        }
        Collections.swap(ventas, i + 1, fin);
        return i + 1;
    }
}
