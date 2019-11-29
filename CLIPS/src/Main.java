import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.CLIPSLoadException;
import net.sf.clipsrules.jni.Environment;

/*
public class Main extends JFrame{
	static Environment clips;
	static JButton button;
	public static void main(String[] args) throws CLIPSException, IOException {
		
		
		
		//NewJFrame jf= new NewJFrame();
		//OptionsWindow win1 = new OptionsWindow();
		SearchWindow win2 = new SearchWindow();
		//clips = new Environment();
	    //clips.load("clipsproject.clp");
	    //clips.reset();
	    //clips.eval("(assert (tt Air))");
	    //clips.run();				
	    				
		JFrame frame = new JFrame("Welcome Frame");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       button = new JButton("WELCOME");
	       
	       button.addActionListener(new ActionListener() {
	    	   public void actionPerformed(ActionEvent e) {
	    			
	    			 OptionsWindow win = new OptionsWindow();
	    			 
	    		}
	       });
	       
	    frame.getContentPane().add(button);
	    frame.setVisible(true);
	    
	}
	
	
	
}
*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Naman
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Main extends JFrame {

    /**
     * @param args the command line arguments
     */
    private static JFrame frame;
    private static JButton Button1;
    private static JButton Button2;
    private static JLabel Title;
    
    
    
    public static void main(String[] args) throws Exception{
        // TODO code application logic here for creating the home page
	
	       frame = new JFrame("Travel Recommendation System");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(600,455);
	       
               Button1 = new JButton("Search By Menu");
               Button2 = new JButton("Search By Places");
               Title = new JLabel("Travel Recommendation System");
               Button1.setBounds(25,300,200,30);
               Button2.setBounds(360,300,200,30);
               Title.setBounds(92,140,400,100);
               Button1.setFont(new java.awt.Font("Ink Free", 1, 18));
               Button2.setFont(new java.awt.Font("Ink Free", 1, 18));
               Title.setFont(new java.awt.Font("Ink Free", 1, 27));
               Color color3 = new Color(64, 8, 138);
               Color color1 = new Color(199, 212, 211);
               Color color2 = new Color(6, 69, 42);
               Title.setForeground(color3);
               Button1.setBackground(color1);
               Button2.setBackground(color1);
               Button1.setForeground(color2);
               Button2.setForeground(color2);
               frame.add(Button1);
               frame.add(Button2);
               frame.add(Title);
               //enter your filepath
               frame.add(new JLabel(new ImageIcon("\\travel2.png")));  
               Button1.addActionListener((ActionEvent e) -> {
                   OptionsWindow win = new OptionsWindow();
                   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               });
               Button2.addActionListener((ActionEvent e) -> {
                   output out = new output();
               });
               frame.setLocationRelativeTo(null);
	       
	    frame.setVisible(true);
	    
	}
       
       
    }
    


