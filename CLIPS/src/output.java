
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;

public class output extends JFrame {
 JLabel jlabel;
 JTextField jtf;
 JButton button ;
 JFrame jframe;

 
output(){

        jframe = new JFrame("Search By Places");
        jlabel = new JLabel("Place you have already visited");
                      jlabel.setFont(jlabel.getFont().deriveFont(18.0f));
        jtf = new JTextField();
        jtf.setFont(jtf.getFont().deriveFont(14.0f));
                      button = new JButton("Submit");
                      jlabel.setBounds(60, 360, 300, 60);
        jtf.setBounds(380,360,300,60);
        Color color1 = new Color(199, 212, 211);
        jtf.setFont(new java.awt.Font("Ink Free", 1, 18));
        jtf.setForeground(Color.DARK_GRAY);
        jtf.setBackground(color1);
        button.setBounds(250,500,200,60);
        jframe.add(jlabel);
        jframe.add(jtf);
        jframe.add(button);
        jframe.setSize(800, 700);

        jframe.add(new JLabel(new ImageIcon("..\\GettyImages-150127577-58f920153df78ca159d41100.jpg")));
                      button.setFont(button.getFont().deriveFont(24.0f));
                      button.addActionListener(new ActionListener(){  
                              public void actionPerformed(ActionEvent e){  
                              //tf.setText("Welcome to Javatpoint.");
                              String inputplace = jtf.getText();
                              	try {
									SearchWindow jf = new SearchWindow(inputplace);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
                          }    
                      });

      jframe.setVisible(true);
      jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

      
}
