/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalsupport;

import com.alee.laf.WebLookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import pages.IncidentsPage;
import pages.LoginPage;

/**
 *
 * @author Loli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TODO: LookAndFeel del proyecto
        SwingUtilities.invokeLater(() -> {
            WebLookAndFeel.install();
        });
        
        //Pantalla inicial de la app
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }
}
