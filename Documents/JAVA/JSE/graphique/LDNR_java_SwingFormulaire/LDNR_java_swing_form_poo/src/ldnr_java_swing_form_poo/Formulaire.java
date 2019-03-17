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

        JPanel civilite = new Civilite();
        JPanel adresse = new Adresse();
        JPanel langages = new Langages();

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
