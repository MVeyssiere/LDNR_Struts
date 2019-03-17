package ldnr_java_swing_form_poo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author Marine V
 */
public class Civilite extends JPanel {

    public Civilite() {

        this.setAlignmentX(JTextField.LEFT);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Border civilTitle = BorderFactory.createTitledBorder("Civilité");

        this.setBorder(civilTitle);

        /////Monsieur / Madame / Mademoiselle
        JPanel type = new JPanel();

        type.setLayout(new FlowLayout(FlowLayout.LEADING));
        ButtonGroup grpType = new ButtonGroup(); // to select only one button on the three

        //création des radio buttons.
        JRadioButton radioType1 = new JRadioButton("M.");
        JRadioButton radioType2 = new JRadioButton("Mme");
        JRadioButton radioType3 = new JRadioButton("Mlle");

        grpType.add(radioType1);
        grpType.add(radioType2);
        grpType.add(radioType3);
        type.add(radioType1);//insertion des radio buttons dans le panel type
        type.add(radioType2);
        type.add(radioType3);
        this.add(type);

        ////// Nom / Prenom
        JPanel name = new JPanel(new BorderLayout());
        JLabel labelNom = new JLabel("Nom");
        JTextField nom = new JTextField("", 35);

        name.add(labelNom, BorderLayout.WEST);
        name.add(nom, BorderLayout.EAST);

        JPanel surname = new JPanel(new BorderLayout());
        JLabel labelPrenom = new JLabel("Prenom");
        JTextField prenom = new JTextField("", 35);

        surname.add(labelPrenom, BorderLayout.WEST);
        surname.add(prenom, BorderLayout.EAST);

        this.add(name);
        this.add(surname);

        /////////// date de naissance
        JLabel naissance = new JLabel("Date de naissance ");
        JPanel date = new JPanel(new FlowLayout(FlowLayout.LEFT));
        String[] month = {"January", "February", "March",
            "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
        JComboBox boxMonth = new JComboBox(month);

        JComboBox boxDay = new JComboBox();
        for (int i = 1; i <= 31; i++) {
            boxDay.addItem(i);
        }

        JComboBox boxYear = new JComboBox();
        for (int i = 1920; i <= 2019; i++) {
            boxYear.addItem(i);
        }

        date.add(naissance);
        date.add(boxDay);
        date.add(boxMonth);
        date.add(boxYear);

        this.add(date);
    }
}
