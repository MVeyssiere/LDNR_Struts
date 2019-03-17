/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ldnr_java_swing_form_poo;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author Marine V
 */
public class Adresse extends JPanel {

    public Adresse() {

        this.setAlignmentX(JTextField.LEFT);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Border bluelineaddress = BorderFactory.createTitledBorder("Adresse");
        this.setBorder(bluelineaddress);

        //panel for the numéro asked to the user
        JPanel num = new JPanel(new BorderLayout());  // the borderlayout help us to place elements. Label on the left and the text field on the right
        JLabel labelNumero = new JLabel("Numéro");
        JTextField numero = new JTextField("", 35);
        num.add(labelNumero, BorderLayout.WEST);
        num.add(numero, BorderLayout.EAST);

        // panel for the rue of the user
        JPanel ru = new JPanel(new BorderLayout());
        JLabel labelRue = new JLabel("Rue");
        JTextField rue = new JTextField("", 35);
        ru.add(labelRue, BorderLayout.WEST);
        ru.add(rue, BorderLayout.EAST);

        //panel for the CP of the user
        JPanel codePostal = new JPanel(new BorderLayout());
        JLabel labelCp = new JLabel("CP");
        JTextField cp = new JTextField("", 35);
        codePostal.add(labelCp, BorderLayout.WEST);
        codePostal.add(cp, BorderLayout.EAST);

        //panel for the commune of the user
        JPanel comm = new JPanel(new BorderLayout());
        JLabel labelCommune = new JLabel("Commune");
        JTextField commune = new JTextField("", 35);
        comm.add(labelCommune, BorderLayout.WEST);
        comm.add(commune, BorderLayout.EAST);

        //adding all panels to the adresse panel
        this.add(num);
        this.add(ru);
        this.add(codePostal);
        this.add(comm);

    }
}
