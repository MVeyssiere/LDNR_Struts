/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ldnr_java_swing_form_poo;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author Marine V
 */
public class Passions extends JPanel {

    public Passions() {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setAlignmentX(JTextField.LEFT);
        Border linePassions = BorderFactory.createTitledBorder("Passions");
        this.setBorder(linePassions);

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

        area.setLineWrap(true); // to contain text in a specific width. Break up sentances with a \n
        this.add(area);

        // add of a scroll bar to show the entire text
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setPreferredSize(new Dimension(300, 150));
        this.add(scrollPane);

    }
}
