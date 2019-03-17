package ldnr_java_swing_form_poo;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author Marine V
 */
public class Langages extends JPanel {

    public Langages() {

        this.setLayout(new GridLayout(0, 4));
        this.setAlignmentX(JTextField.LEFT);
        Border lineLangage = BorderFactory.createTitledBorder("Langages");
        this.setBorder(lineLangage);

        String[] myLangages = {"C", "C++", "C#", "JAVA SE", "JAVA EE", "Python", "Shell", "Delphi", "Pascal", "TurboPascal"};
        JCheckBox[] checkBox = new JCheckBox[myLangages.length];
        for (int i = 0; i < myLangages.length; i++) {
            checkBox[i] = new JCheckBox(myLangages[i]); // checkbox creation for each element of the array myLangages
            this.add(checkBox[i]);  // and add each elements to the panel langages
        }
    }
}
