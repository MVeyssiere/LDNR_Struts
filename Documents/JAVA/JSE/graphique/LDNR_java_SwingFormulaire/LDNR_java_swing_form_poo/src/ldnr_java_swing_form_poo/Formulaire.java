package ldnr_java_swing_form_poo;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Marine V
 */
public class Formulaire {

    public Formulaire() {

        JFrame frame = new JFrame("Formulaire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //main panel for the frame containing all other panels
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        JPanel civilite = new Civilite();
        JPanel adresse = new Adresse();
        JPanel langages = new Langages();
        JPanel passions = new Passions();

        // add all panels to the content panel
        content.add(civilite);
        content.add(adresse);
        content.add(langages, BorderLayout.CENTER);
        content.add(passions);

        frame.add(content); // add the content panel to the frame to display it
        frame.pack(); // window of the frame sized according to the inside elements
        frame.setVisible(true); // to show the frame. MENDATORY
    }
}
