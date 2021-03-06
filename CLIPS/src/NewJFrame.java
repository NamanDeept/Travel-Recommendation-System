import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import java.util.*;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.CLIPSLoadException;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;


class NewJFrame extends JFrame{
	String[] varname;
	String[] selected;
	NewJFrame(String[] Varname , String[] Selected) throws IOException{
    	this.selected = Selected;
    	this.varname = Varname;
		initComponents();
    	this.setVisible(true);
//     
    }
    /**
     * Creates new form NewJFrame
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @throws IOException 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws IOException {
    	
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        //jTextArea1.setText(s);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Transport");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Place Type");

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Food");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Weather");

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Budget");

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Duration");

        jButton1.setText("Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox4))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        pack();
        ExecuteClips();
    }// </editor-fold>                        

    
    
    public void ExecuteClips() throws IOException {
    	
    	String s="";
    	Environment clips;
    	try {
			clips = new Environment();
			clips.clear();
			clips.load("C:\\Users\\Akshay Gupta\\Desktop\\travelrecomm\\CLIPS\\facts.clp");
			
			int[] filter = new int[6];
			for(int i=0;i<6;i++) filter[i]=0;
			
				if(jCheckBox1.isSelected())
				filter[0]=1;
				
				if(jCheckBox2.isSelected())
					filter[1]=1;
				
				if(jCheckBox3.isSelected())
					filter[2]=1;
				
				if(jCheckBox4.isSelected())
					filter[3]=1;
				
				if(jCheckBox5.isSelected())
					filter[4]=1;
				
				if(jCheckBox6.isSelected())
					filter[5]=1;
			
			
			MakeNewFile mkf = new MakeNewFile(filter,"C:\\Users\\Akshay Gupta\\Desktop\\travelrecomm\\CLIPS\\newrule.clp","C:\\Users\\Akshay Gupta\\Desktop\\travelrecomm\\CLIPS\\mainrule.clp");
			clips.load("C:\\Users\\Akshay Gupta\\Desktop\\travelrecomm\\CLIPS\\newrule.clp");
			clips.reset();
			int i=0;
			for(i=0;i<6;i++)
				clips.eval("(assert("+varname[i]+" "+selected[i]+"))");
			clips.run();
			ArrayList<FactAddressValue> fv = (ArrayList<FactAddressValue>) clips.findAllFacts("answer");
			for(FactAddressValue p :fv) {
				s=s+(p.getSlotValue("name"))+"\n";
				System.out.println(p.getSlotValue("name"));
				
			}
			//System.out.println("\n\n\n\n\n\n\n\n");
			jTextArea1.setText(s);
			Color color1 = new Color(199, 212, 211);
	        jTextArea1.setFont(new java.awt.Font("Ink Free", 1, 18));
	        jTextArea1.setForeground(Color.DARK_GRAY);
	        jTextArea1.setBackground(color1);
		}catch (CLIPSException e1) {
			e1.printStackTrace();
		}
    	
    }
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                        
        //jTextArea1.setText("Hi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\nHi\nHi again\n");
       
    	ExecuteClips();
    	
    	
    	
    }                                        

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                    
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                  
}
