/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.Pantalla;
import javax.swing.UIManager;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.JMarsDarkTheme;

/**
 *
 * @author usuario
 */
public class Logica {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel(new JMarsDarkTheme()));

            Pantalla panta = new Pantalla();
            panta.setVisible(true);
            panta.setLocationRelativeTo(null);
            panta.setTitle("Conversor");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
