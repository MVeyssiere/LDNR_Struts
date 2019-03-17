package ldnr_java_swing_form_poo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author Marine V
 */
public class Formulaire {

    public Formulaire() {

        JFrame frame = new JFrame("Formulaire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel général de type CardLayout
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        /////////////////////////////////////////////////////
        //////////PANEL CIVILITE
        JPanel civilite = new JPanel();
        civilite.setAlignmentX(JTextField.LEFT);
        civilite.setLayout(new BoxLayout(civilite, BoxLayout.Y_AXIS));
        Border civilTitle = BorderFactory.createTitledBorder("Civilité");
        civilite.setBorder(civilTitle);

        /////Monsieur / Madame / Mademoiselle
        JPanel type = new JPanel();
        type.setLayout(new FlowLayout(FlowLayout.LEADING));
        // type.setBackground(Color.ORANGE);
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
        civilite.add(type);

        //type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
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

        civilite.add(name);
        civilite.add(surname);

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

        civilite.add(date);


        ///////////////////////////////////////////////////////////////////////////
        ///////////////////ADDRESS
        JPanel address = new JPanel();
        address.setAlignmentX(JTextField.LEFT);
        address.setLayout(new BoxLayout(address, BoxLayout.Y_AXIS));
        Border bluelineaddress = BorderFactory.createTitledBorder("Adresse");
        address.setBorder(bluelineaddress);
        //address.setBackground(Color.red);
        JPanel num = new JPanel(new BorderLayout());
        //num.setAlignmentX(JTextField.LEFT);
        JLabel labelNumero = new JLabel("Numéro");
        JTextField numero = new JTextField("", 35);
        num.add(labelNumero, BorderLayout.WEST);
        num.add(numero, BorderLayout.EAST);
        JPanel ru = new JPanel(new BorderLayout());
        //  ru.setAlignmentX(JTextField.LEFT);
        JLabel labelRue = new JLabel("Rue");
        JTextField rue = new JTextField("", 35);
        ru.add(labelRue, BorderLayout.WEST);
        ru.add(rue, BorderLayout.EAST);
        JPanel codePostal = new JPanel(new BorderLayout());
        //codePostal.setAlignmentX(JTextField.LEFT);
        JLabel labelCp = new JLabel("CP");
        JTextField cp = new JTextField("", 35);
        codePostal.add(labelCp, BorderLayout.WEST);
        codePostal.add(cp, BorderLayout.EAST);
        JPanel comm = new JPanel(new BorderLayout());
        //comm.setAlignmentX(JTextField.LEFT);
        JLabel labelCommune = new JLabel("Commune");
        JTextField commune = new JTextField("", 35);
        comm.add(labelCommune, BorderLayout.WEST);
        comm.add(commune, BorderLayout.EAST);

        address.add(num);
        address.add(ru);
        address.add(codePostal);
        address.add(comm);

        //////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////LANGAGES
        JPanel langages = new JPanel(new GridLayout(0, 4));
        langages.setAlignmentX(JTextField.LEFT);
        Border lineLangage = BorderFactory.createTitledBorder("Langages");
        langages.setBorder(lineLangage);

        String[] myLangages = {"C", "C++", "C#", "JAVA SE", "JAVA EE", "Python", "Shell", "Delphi", "Pascal", "TurboPascal"};
        JCheckBox[] checkBox = new JCheckBox[myLangages.length];
        for (int i = 0; i < myLangages.length; i++) {
            checkBox[i] = new JCheckBox(myLangages[i]);
            langages.add(checkBox[i]);
        }

        //////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////PASSIONS
        JPanel passions = new JPanel();
        passions.setLayout(new BoxLayout(passions, BoxLayout.Y_AXIS));
        passions.setAlignmentX(JTextField.LEFT);
        Border linePassions = BorderFactory.createTitledBorder("Passions");
        passions.setBorder(linePassions);

        JTextArea area = new JTextArea(10, 35);
        area.append(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris mattis leo rhoncus odio consectetur efficitur. "
                + "Fusce aliquam tristique lectus, in luctus leo luctus quis. Duis ac ante neque. "
                + "Proin sed molestie arcu. Donec metus libero, consectetur eget gravida sed, congue sit amet erat. "
                + "Nullam urna mauris, interdum et velit maximus, varius varius arcu. In commodo at massa eu ornare. Sed eu consequat tellus, vel porttitor neque."
                + "Maecenas enim felis, commodo sit amet porttitor ut, maximus vitae arcu. Nullam placerat risus nec aliquet tempus."
                + "Donec consequat fringilla neque at eleifend. Vivamus vitae nunc lacus. Duis vitae sodales metus. "
                + "Curabitur tincidunt turpis eget dui lobortis, non auctor tellus viverra. Nullam dignissim viverra justo, eu semper odio facilisis vitae. "
                + "Sed ut lacinia augue. Mauris ut risus pulvinar, blandit felis eget, pharetra augue. Quisque et ultrices tortor. "
                + "Cras sagittis eros neque, in interdum ligula egestas sed. Cras vestibulum elit justo, at pellentesque magna congue ac. "
                + "Praesent luctus placerat odio non fringilla. Nam semper elementum nunc eget dignissim. Vestibulum sit amet sagittis enim. Cras in sagittis augue."
                + "Duis nec consequat nisi. Praesent lacinia blandit vulputate. "
                + "Nulla ultrices, lectus sit amet mattis congue, neque diam pulvinar tortor, vel tincidunt massa dui nec nunc. "
                + "Maecenas sed ullamcorper mauris, eget lobortis velit. Praesent sapien magna, luctus sit amet tincidunt id, eleifend id neque."
                + "Phasellus scelerisque metus nec ligula auctor pulvinar. Sed aliquam turpis vel dignissim facilisis. Ut pellentesque eros eget eleifend rhoncus. "
                + "Maecenas blandit metus tincidunt, placerat lacus ut, aliquam elit. Quisque eget finibus orci, ac imperdiet ante."
                + "Aenean vitae venenatis elit, at tincidunt purus. Donec lacinia ante a semper vehicula. Sed volutpat vulputate accumsan."
                + "In hac habitasse platea dictumst. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.");

        area.setLineWrap(true);
        passions.add(area);
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        passions.add(scrollPane);

        content.add(civilite);
        content.add(address);
        content.add(langages, BorderLayout.CENTER);
        content.add(passions);

        frame.add(content);
        frame.pack();
        frame.setVisible(true);
    }
}
