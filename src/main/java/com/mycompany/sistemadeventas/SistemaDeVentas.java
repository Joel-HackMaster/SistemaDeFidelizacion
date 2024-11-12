/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadeventas;

import Vistas.Login;
import javax.swing.SwingUtilities;

/**
 *
 * @author jwsb1
 */
public class SistemaDeVentas {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
